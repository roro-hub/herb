package com.herb.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import com.herb.dto.BucketPolicyConfigDto;
import com.herb.dto.MinioUploadDto;
import com.herb.service.MinioService;
import io.minio.*;
import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class MinioServiceImpl implements MinioService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MinioServiceImpl.class);

    @Value("${minio.endpoint}")
    private String ENDPOINT;
    @Value("${minio.bucketName}")
    private String BUCKET_NAME;
    @Value("${minio.accessKey}")
    private String ACCESS_KEY;
    @Value("${minio.secretKey}")
    private String SECRET_KEY;

    @Resource
    private MinioClient minioClient;

    @Override
    public MinioUploadDto upload(MultipartFile file) {
        try {
            boolean isExist = minioClient.bucketExists(BucketExistsArgs.builder().bucket(BUCKET_NAME).build());
            if (isExist) {
                LOGGER.info("存储桶已经存在！");
            } else {
                //创建存储桶并设置只读权限
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(BUCKET_NAME).build());
                BucketPolicyConfigDto bucketPolicyConfigDto = createBucketPolicyConfigDto(BUCKET_NAME);
                SetBucketPolicyArgs setBucketPolicyArgs = SetBucketPolicyArgs.builder()
                        .bucket(BUCKET_NAME)
                        .config(JSONUtil.toJsonStr(bucketPolicyConfigDto))
                        .build();
                minioClient.setBucketPolicy(setBucketPolicyArgs);
            }
            String filename = file.getOriginalFilename();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            // 设置存储对象名称
            String objectName = sdf.format(new Date()) + "/" + RandomUtils.nextInt(1000) + "_" + filename;
            // 使用putObject上传一个文件到存储桶中
            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .bucket(BUCKET_NAME)
                    .object(objectName)
                    .contentType(file.getContentType())
                    .stream(file.getInputStream(), file.getSize(), ObjectWriteArgs.MIN_MULTIPART_SIZE).build();
            minioClient.putObject(putObjectArgs);
            LOGGER.info("文件上传成功!");
            MinioUploadDto minioUploadDto = new MinioUploadDto();
            minioUploadDto.setName(filename);
            minioUploadDto.setUrl(ENDPOINT + "/" + BUCKET_NAME + "/" + objectName);
            return minioUploadDto;
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.info("上传发生错误: {}！", e.getMessage());
            return null;
        }
    }

    @Override
    public void delete(String objectName) {
        try {
            MinioClient minioClient = MinioClient.builder()
                    .endpoint(ENDPOINT)
                    .credentials(ACCESS_KEY,SECRET_KEY)
                    .build();
            minioClient.removeObject(RemoveObjectArgs.builder().bucket(BUCKET_NAME).object(objectName).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private BucketPolicyConfigDto createBucketPolicyConfigDto(String bucketName) {
        BucketPolicyConfigDto.Statement statement = BucketPolicyConfigDto.Statement.builder()
                .Effect("Allow")
                .Principal("*")
                .Action("s3:GetObject")
                .Resource("arn:aws:s3:::"+bucketName+"/*.**").build();
        return BucketPolicyConfigDto.builder()
                .Version("2012-10-17")
                .Statement(CollUtil.toList(statement))
                .build();
    }

}

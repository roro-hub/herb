package com.herb.service;

import com.herb.dto.MinioUploadDto;
import org.springframework.web.multipart.MultipartFile;

public interface MinioService {

    MinioUploadDto upload(MultipartFile file);

    void delete(String objectName);
}

package com.herb.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
public class PriceTodayBO {

    @ApiModelProperty(value = "药材名称")
    private String name;

    @ApiModelProperty(value = "规格")
    private String standard;

    @ApiModelProperty(value = "产地")
    private String origin;

    @ApiModelProperty(value = "亳州")
    private BigDecimal haozhou;

    @ApiModelProperty(value = "安国")
    private BigDecimal anguo;

    @ApiModelProperty(value = "成都")
    private BigDecimal chengdu;

    @ApiModelProperty(value = "玉林")
    private BigDecimal yulin;

    @ApiModelProperty(value = "廉桥")
    private BigDecimal lianqiao;

    @ApiModelProperty(value = "普宁")
    private BigDecimal puning;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @ApiModelProperty(value = "记录时间")
    private Date newdate;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;
}

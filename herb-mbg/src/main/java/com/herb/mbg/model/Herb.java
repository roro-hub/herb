package com.herb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Herb implements Serializable {
    private Long id;

    @ApiModelProperty(value = "药材名称")
    private String name;

    @ApiModelProperty(value = "药材类型")
    private Long herbType;

    private String herbTypeName;

    @ApiModelProperty(value = "图片")
    private String images;

    @ApiModelProperty(value = "描述")
    private String content;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHerbType() {
        return herbType;
    }

    public void setHerbType(Long herbType) {
        this.herbType = herbType;
    }

    public String getHerbTypeName() {
        return herbTypeName;
    }

    public void setHerbTypeName(String herbTypeName) {
        this.herbTypeName = herbTypeName;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", herbType=").append(herbType);
        sb.append(", herbTypeName=").append(herbTypeName);
        sb.append(", images=").append(images);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
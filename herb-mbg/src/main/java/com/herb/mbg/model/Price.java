package com.herb.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Price implements Serializable {
    private Long id;

    @ApiModelProperty(value = "药材ID")
    private Long herbId;

    @ApiModelProperty(value = "药材名称")
    private Long herbName;

    @ApiModelProperty(value = "规格")
    private String standard;

    @ApiModelProperty(value = "产地")
    private String origin;

    @ApiModelProperty(value = "市场，亳州/安国/成都/玉林/廉桥/普宁")
    private String site;

    @ApiModelProperty(value = "单位，元/千克")
    private String measureunit;

    @ApiModelProperty(value = "价格")
    private String newprice;

    @ApiModelProperty(value = "较上周价格")
    private String wprice;

    @ApiModelProperty(value = "较上周价格比例")
    private String wpricefloat;

    @ApiModelProperty(value = "较上月价格")
    private String yprice;

    @ApiModelProperty(value = "较上月价格比例")
    private String ypricefloat;

    @ApiModelProperty(value = "较去年价格")
    private String nprice;

    @ApiModelProperty(value = "较去年价格比例")
    private String npricefloat;

    @ApiModelProperty(value = "记录时间")
    private Date newdate;

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

    public Long getHerbId() {
        return herbId;
    }

    public void setHerbId(Long herbId) {
        this.herbId = herbId;
    }

    public Long getHerbName() {
        return herbName;
    }

    public void setHerbName(Long herbName) {
        this.herbName = herbName;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getMeasureunit() {
        return measureunit;
    }

    public void setMeasureunit(String measureunit) {
        this.measureunit = measureunit;
    }

    public String getNewprice() {
        return newprice;
    }

    public void setNewprice(String newprice) {
        this.newprice = newprice;
    }

    public String getWprice() {
        return wprice;
    }

    public void setWprice(String wprice) {
        this.wprice = wprice;
    }

    public String getWpricefloat() {
        return wpricefloat;
    }

    public void setWpricefloat(String wpricefloat) {
        this.wpricefloat = wpricefloat;
    }

    public String getYprice() {
        return yprice;
    }

    public void setYprice(String yprice) {
        this.yprice = yprice;
    }

    public String getYpricefloat() {
        return ypricefloat;
    }

    public void setYpricefloat(String ypricefloat) {
        this.ypricefloat = ypricefloat;
    }

    public String getNprice() {
        return nprice;
    }

    public void setNprice(String nprice) {
        this.nprice = nprice;
    }

    public String getNpricefloat() {
        return npricefloat;
    }

    public void setNpricefloat(String npricefloat) {
        this.npricefloat = npricefloat;
    }

    public Date getNewdate() {
        return newdate;
    }

    public void setNewdate(Date newdate) {
        this.newdate = newdate;
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
        sb.append(", herbId=").append(herbId);
        sb.append(", herbName=").append(herbName);
        sb.append(", standard=").append(standard);
        sb.append(", origin=").append(origin);
        sb.append(", site=").append(site);
        sb.append(", measureunit=").append(measureunit);
        sb.append(", newprice=").append(newprice);
        sb.append(", wprice=").append(wprice);
        sb.append(", wpricefloat=").append(wpricefloat);
        sb.append(", yprice=").append(yprice);
        sb.append(", ypricefloat=").append(ypricefloat);
        sb.append(", nprice=").append(nprice);
        sb.append(", npricefloat=").append(npricefloat);
        sb.append(", newdate=").append(newdate);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.cnacademy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_slideshow")
public class TbSlideshow {
    /**
     * 标签id,1为新手入门，2为大咖专场
     */
    @Id
    @Column(name = "flag_id")
    private Integer flagId;

    /**
     * 是否上架
     */
    private Boolean status;

    @Column(name = "pic_url")
    private String picUrl;

    private String url;

    private String title;

    private Date created;

    private Date updated;

    /**
     * 获取标签id,1为新手入门，2为大咖专场
     *
     * @return flag_id - 标签id,1为新手入门，2为大咖专场
     */
    public Integer getFlagId() {
        return flagId;
    }

    /**
     * 设置标签id,1为新手入门，2为大咖专场
     *
     * @param flagId 标签id,1为新手入门，2为大咖专场
     */
    public void setFlagId(Integer flagId) {
        this.flagId = flagId;
    }

    /**
     * 获取是否上架
     *
     * @return status - 是否上架
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置是否上架
     *
     * @param status 是否上架
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return pic_url
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * @param picUrl
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
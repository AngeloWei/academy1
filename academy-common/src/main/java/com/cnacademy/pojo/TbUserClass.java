package com.cnacademy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_class")
public class TbUserClass {
    @Column(name = "user_id")
    private String userId;

    @Column(name = "class_id")
    private Integer classId;

    private String channel;

    /**
     * 是否购买
     */
    private Boolean payed;

    /**
     * 0:收藏记录 1：报名记录
     */
    private Short type;

    private Integer price;

    private Date created;

    private Date updated;

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return class_id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * @param classId
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 获取是否购买
     *
     * @return payed - 是否购买
     */
    public Boolean getPayed() {
        return payed;
    }

    /**
     * 设置是否购买
     *
     * @param payed 是否购买
     */
    public void setPayed(Boolean payed) {
        this.payed = payed;
    }

    /**
     * 获取0:收藏记录 1：报名记录
     *
     * @return type - 0:收藏记录 1：报名记录
     */
    public Short getType() {
        return type;
    }

    /**
     * 设置0:收藏记录 1：报名记录
     *
     * @param type 0:收藏记录 1：报名记录
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
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
package com.cnacademy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_class_info")
public class TbClassInfo {
    @Id
    private Integer id;

    /**
     * 1：正常 2.下架
     */
    private Short status;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 是否免费
     */
    private Boolean free;

    /**
     * 课程价格
     */
    private Integer price;

    /**
     * 课程描述
     */
    private String descript;

    /**
     * 购买量
     */
    @Column(name = "apply_num")
    private Integer applyNum;

    /**
     * 收藏量
     */
    @Column(name = "store_num")
    private Integer storeNum;

    /**
     * 标签
     */
    @Column(name = "flag_id")
    private Integer flagId;

    /**
     * 视频集
     */
    @Column(name = "collection_id")
    private Integer collectionId;

    /**
     * 是否置顶
     */
    @Column(name = "isTop")
    private Boolean istop;

    /**
     * 视频封面图
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 试看视频
     */
    @Column(name = "vedio1_url")
    private String vedio1Url;

    /**
     * 整个视频
     */
    @Column(name = "vedio2_url")
    private String vedio2Url;

    /**
     * 课程得分
     */
    private Float score;

    /**
     * 教师id
     */
    @Column(name = "teacher_id")
    private Integer teacherId;

    private Date created;

    private Date updated;

    /**
     * 所属渠道
     */
    private String channel;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取1：正常 2.下架
     *
     * @return status - 1：正常 2.下架
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置1：正常 2.下架
     *
     * @param status 1：正常 2.下架
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取视频标题
     *
     * @return title - 视频标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置视频标题
     *
     * @param title 视频标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取是否免费
     *
     * @return free - 是否免费
     */
    public Boolean getFree() {
        return free;
    }

    /**
     * 设置是否免费
     *
     * @param free 是否免费
     */
    public void setFree(Boolean free) {
        this.free = free;
    }

    /**
     * 获取课程价格
     *
     * @return price - 课程价格
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置课程价格
     *
     * @param price 课程价格
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取课程描述
     *
     * @return descript - 课程描述
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置课程描述
     *
     * @param descript 课程描述
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取购买量
     *
     * @return apply_num - 购买量
     */
    public Integer getApplyNum() {
        return applyNum;
    }

    /**
     * 设置购买量
     *
     * @param applyNum 购买量
     */
    public void setApplyNum(Integer applyNum) {
        this.applyNum = applyNum;
    }

    /**
     * 获取收藏量
     *
     * @return store_num - 收藏量
     */
    public Integer getStoreNum() {
        return storeNum;
    }

    /**
     * 设置收藏量
     *
     * @param storeNum 收藏量
     */
    public void setStoreNum(Integer storeNum) {
        this.storeNum = storeNum;
    }

    /**
     * 获取标签
     *
     * @return flag_id - 标签
     */
    public Integer getFlagId() {
        return flagId;
    }

    /**
     * 设置标签
     *
     * @param flagId 标签
     */
    public void setFlagId(Integer flagId) {
        this.flagId = flagId;
    }

    /**
     * 获取视频集
     *
     * @return collection_id - 视频集
     */
    public Integer getCollectionId() {
        return collectionId;
    }

    /**
     * 设置视频集
     *
     * @param collectionId 视频集
     */
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * 获取是否置顶
     *
     * @return isTop - 是否置顶
     */
    public Boolean getIstop() {
        return istop;
    }

    /**
     * 设置是否置顶
     *
     * @param istop 是否置顶
     */
    public void setIstop(Boolean istop) {
        this.istop = istop;
    }

    /**
     * 获取视频封面图
     *
     * @return pic_url - 视频封面图
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置视频封面图
     *
     * @param picUrl 视频封面图
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 获取试看视频
     *
     * @return vedio1_url - 试看视频
     */
    public String getVedio1Url() {
        return vedio1Url;
    }

    /**
     * 设置试看视频
     *
     * @param vedio1Url 试看视频
     */
    public void setVedio1Url(String vedio1Url) {
        this.vedio1Url = vedio1Url;
    }

    /**
     * 获取整个视频
     *
     * @return vedio2_url - 整个视频
     */
    public String getVedio2Url() {
        return vedio2Url;
    }

    /**
     * 设置整个视频
     *
     * @param vedio2Url 整个视频
     */
    public void setVedio2Url(String vedio2Url) {
        this.vedio2Url = vedio2Url;
    }

    /**
     * 获取课程得分
     *
     * @return score - 课程得分
     */
    public Float getScore() {
        return score;
    }

    /**
     * 设置课程得分
     *
     * @param score 课程得分
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * 获取教师id
     *
     * @return teacher_id - 教师id
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * 设置教师id
     *
     * @param teacherId 教师id
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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

    /**
     * 获取所属渠道
     *
     * @return channel - 所属渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置所属渠道
     *
     * @param channel 所属渠道
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }
}
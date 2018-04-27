package com.cnacademy.pojo;

import javax.persistence.*;

@Table(name = "tb_teacher")
public class TbTeacher {
    @Id
    private Integer id;

    /**
     * 教师名
     */
    private String name;

    /**
     * 课程数
     */
    @Column(name = "class_num")
    private Integer classNum;

    /**
     * 收藏和购买总人数
     */
    @Column(name = "stu_num")
    private Integer stuNum;

    /**
     * 介绍
     */
    private String description;

    /**
     * 头像
     */
    @Column(name = "photo_url")
    private String photoUrl;

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
     * 获取教师名
     *
     * @return name - 教师名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置教师名
     *
     * @param name 教师名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取课程数
     *
     * @return class_num - 课程数
     */
    public Integer getClassNum() {
        return classNum;
    }

    /**
     * 设置课程数
     *
     * @param classNum 课程数
     */
    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    /**
     * 获取收藏和购买总人数
     *
     * @return stu_num - 收藏和购买总人数
     */
    public Integer getStuNum() {
        return stuNum;
    }

    /**
     * 设置收藏和购买总人数
     *
     * @param stuNum 收藏和购买总人数
     */
    public void setStuNum(Integer stuNum) {
        this.stuNum = stuNum;
    }

    /**
     * 获取介绍
     *
     * @return description - 介绍
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置介绍
     *
     * @param description 介绍
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取头像
     *
     * @return photo_url - 头像
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * 设置头像
     *
     * @param photoUrl 头像
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
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
}
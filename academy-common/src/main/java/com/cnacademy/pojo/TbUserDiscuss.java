package com.cnacademy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_discuss")
public class TbUserDiscuss {
    @Column(name = "user_id")
    private String userId;

    @Column(name = "class_id")
    private Integer classId;

    /**
     * 得分
     */
    private Short score;

    /**
     * 建议内容
     */
    private String discuss;

    /**
     * 0:视评 1：建议
     */
    private Short type;

    private Date create;

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
     * 获取得分
     *
     * @return score - 得分
     */
    public Short getScore() {
        return score;
    }

    /**
     * 设置得分
     *
     * @param score 得分
     */
    public void setScore(Short score) {
        this.score = score;
    }

    /**
     * 获取建议内容
     *
     * @return discuss - 建议内容
     */
    public String getDiscuss() {
        return discuss;
    }

    /**
     * 设置建议内容
     *
     * @param discuss 建议内容
     */
    public void setDiscuss(String discuss) {
        this.discuss = discuss;
    }

    /**
     * 获取0:视评 1：建议
     *
     * @return type - 0:视评 1：建议
     */
    public Short getType() {
        return type;
    }

    /**
     * 设置0:视评 1：建议
     *
     * @param type 0:视评 1：建议
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * @return create
     */
    public Date getCreate() {
        return create;
    }

    /**
     * @param create
     */
    public void setCreate(Date create) {
        this.create = create;
    }
}
package com.cnacademy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_order")
public class TbOrder {
    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

    /**
     * 课程id
     */
    @Column(name = "class_id")
    private Integer classId;

    /**
     * 订单价格
     */
    private Integer price;

    /**
     * 实际支付金额
     */
    private Integer payment;

    /**
     * 0:未支付1：支付成功 2：支付失败
     */
    private Short status;

    /**
     * 渠道
     */
    private String channe;

    /**
     * 优惠券id
     */
    @Column(name = "coupon_id")
    private String couponId;

    /**
     * 优惠金额
     */
    private Integer discount;

    private Date created;

    private Date updated;

    /**
     * 支付方式
     */
    @Column(name = "pay_type")
    private Short payType;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

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
     * 获取课程id
     *
     * @return class_id - 课程id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 设置课程id
     *
     * @param classId 课程id
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 获取订单价格
     *
     * @return price - 订单价格
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置订单价格
     *
     * @param price 订单价格
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取实际支付金额
     *
     * @return payment - 实际支付金额
     */
    public Integer getPayment() {
        return payment;
    }

    /**
     * 设置实际支付金额
     *
     * @param payment 实际支付金额
     */
    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    /**
     * 获取0:未支付1：支付成功 2：支付失败
     *
     * @return status - 0:未支付1：支付成功 2：支付失败
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置0:未支付1：支付成功 2：支付失败
     *
     * @param status 0:未支付1：支付成功 2：支付失败
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取渠道
     *
     * @return channe - 渠道
     */
    public String getChanne() {
        return channe;
    }

    /**
     * 设置渠道
     *
     * @param channe 渠道
     */
    public void setChanne(String channe) {
        this.channe = channe;
    }

    /**
     * 获取优惠券id
     *
     * @return coupon_id - 优惠券id
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 设置优惠券id
     *
     * @param couponId 优惠券id
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取优惠金额
     *
     * @return discount - 优惠金额
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * 设置优惠金额
     *
     * @param discount 优惠金额
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
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
     * 获取支付方式
     *
     * @return pay_type - 支付方式
     */
    public Short getPayType() {
        return payType;
    }

    /**
     * 设置支付方式
     *
     * @param payType 支付方式
     */
    public void setPayType(Short payType) {
        this.payType = payType;
    }
}
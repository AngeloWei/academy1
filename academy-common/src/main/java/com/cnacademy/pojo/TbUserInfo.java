package com.cnacademy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_info")
public class TbUserInfo {
    /**
     * 根据channel生成唯一id
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    private String account;

    private String pwd;

    /**
     * 第三方token1
     */
    @Column(name = "third_token1")
    private String thirdToken1;

    /**
     * 第三方登录token2
     */
    @Column(name = "third_token2")
    private String thirdToken2;

    private String nick;

    private String channel;

    /**
     * 手机号，一个手机号对应多个userid
     */
    private String phone;

    @Column(name = "picture_ulr")
    private String pictureUlr;

    private Date created;

    private Date updated;

    /**
     * 获取根据channel生成唯一id
     *
     * @return user_id - 根据channel生成唯一id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置根据channel生成唯一id
     *
     * @param userId 根据channel生成唯一id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return account - 用户名
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置用户名
     *
     * @param account 用户名
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取第三方token1
     *
     * @return third_token1 - 第三方token1
     */
    public String getThirdToken1() {
        return thirdToken1;
    }

    /**
     * 设置第三方token1
     *
     * @param thirdToken1 第三方token1
     */
    public void setThirdToken1(String thirdToken1) {
        this.thirdToken1 = thirdToken1;
    }

    /**
     * 获取第三方登录token2
     *
     * @return third_token2 - 第三方登录token2
     */
    public String getThirdToken2() {
        return thirdToken2;
    }

    /**
     * 设置第三方登录token2
     *
     * @param thirdToken2 第三方登录token2
     */
    public void setThirdToken2(String thirdToken2) {
        this.thirdToken2 = thirdToken2;
    }

    /**
     * @return nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick
     */
    public void setNick(String nick) {
        this.nick = nick;
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
     * 获取手机号，一个手机号对应多个userid
     *
     * @return phone - 手机号，一个手机号对应多个userid
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号，一个手机号对应多个userid
     *
     * @param phone 手机号，一个手机号对应多个userid
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return picture_ulr
     */
    public String getPictureUlr() {
        return pictureUlr;
    }

    /**
     * @param pictureUlr
     */
    public void setPictureUlr(String pictureUlr) {
        this.pictureUlr = pictureUlr;
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
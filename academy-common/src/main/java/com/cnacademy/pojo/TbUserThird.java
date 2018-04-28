package com.cnacademy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user_third")
public class TbUserThird {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "third_token")
    private String thirdToken;

    private Short type;

    private String channel;

    private Date created;

    private Date updated;

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
     * @return third_token
     */
    public String getThirdToken() {
        return thirdToken;
    }

    /**
     * @param thirdToken
     */
    public void setThirdToken(String thirdToken) {
        this.thirdToken = thirdToken;
    }

    /**
     * @return type
     */
    public Short getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Short type) {
        this.type = type;
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
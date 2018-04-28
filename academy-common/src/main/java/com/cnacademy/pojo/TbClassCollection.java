package com.cnacademy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_class_collection")
public class TbClassCollection {
    @Id
    private Integer id;

    private String title;

    /**
     * 0为普通，1为新手，2为大咖专场
     */
    private String grade;

    private Boolean deleted;

    @Column(name = "flag_id")
    private Integer flagId;

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
     * 获取0为普通，1为新手，2为大咖专场
     *
     * @return grade - 0为普通，1为新手，2为大咖专场
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置0为普通，1为新手，2为大咖专场
     *
     * @param grade 0为普通，1为新手，2为大咖专场
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * @return flag_id
     */
    public Integer getFlagId() {
        return flagId;
    }

    /**
     * @param flagId
     */
    public void setFlagId(Integer flagId) {
        this.flagId = flagId;
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
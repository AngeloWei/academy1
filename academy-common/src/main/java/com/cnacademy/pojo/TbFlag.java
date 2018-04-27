package com.cnacademy.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_flag")
public class TbFlag {
    @Id
    private Integer id;

    /**
     * 标签名
     */
    private String name;

    /**
     * 0:正常 1：下架
     */
    private Short status;

    /**
     * 序号，大有限极高
     */
    private Short sequence;

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
     * 获取标签名
     *
     * @return name - 标签名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置标签名
     *
     * @param name 标签名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取0:正常 1：下架
     *
     * @return status - 0:正常 1：下架
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置0:正常 1：下架
     *
     * @param status 0:正常 1：下架
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取序号，大有限极高
     *
     * @return sequence - 序号，大有限极高
     */
    public Short getSequence() {
        return sequence;
    }

    /**
     * 设置序号，大有限极高
     *
     * @param sequence 序号，大有限极高
     */
    public void setSequence(Short sequence) {
        this.sequence = sequence;
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
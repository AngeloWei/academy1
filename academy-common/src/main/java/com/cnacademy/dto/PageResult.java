package com.cnacademy.dto;

import java.io.Serializable;

public class PageResult implements Serializable {
    private Integer page; //当前页数
    private Integer count;//记录总数
    private Object object;//当前数据
    private Integer size;//每页记录数


    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

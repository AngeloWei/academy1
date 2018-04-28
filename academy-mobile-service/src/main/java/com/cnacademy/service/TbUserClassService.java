package com.cnacademy.service;

import com.cnacademy.mappers.TbUserClassMapper;
import com.cnacademy.pojo.TbUserClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbUserClassService {
    @Autowired
    private TbUserClassMapper userClassMapper;

    public String insert() {
        TbUserClass tbUserClass = new TbUserClass();
        tbUserClass.setUserId("123123");
        tbUserClass.setChannel("asdfsdf");
        tbUserClass.setClassId(12323);
        tbUserClass.setPayed(true);
        tbUserClass.setPrice(1000);
        userClassMapper.insert(tbUserClass);
        return "sssss";
    }
}


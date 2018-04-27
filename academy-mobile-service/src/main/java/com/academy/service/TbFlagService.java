package com.academy.service;

import com.academy.mapper.TbFlagMapper;
import com.academy.pojo.TbFlag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbFlagService {

    @Autowired
    private TbFlagMapper flagMapper;

    public String insertFlag(TbFlag flag) {
        int i = flagMapper.insertSelective(flag);
        return i+"";
    }
}

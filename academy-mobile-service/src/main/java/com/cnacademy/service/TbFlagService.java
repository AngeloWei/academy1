package com.cnacademy.service;


import com.cnacademy.dto.ComResult;
import com.cnacademy.mappers.TbFlagMapper;
import com.cnacademy.pojo.TbFlag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TbFlagService {

    @Autowired
    private TbFlagMapper flagMapper;

    public ComResult insertFlag(TbFlag flag) {
       flagMapper.insertSelective(flag);
       return ComResult.ok();
    }

    /**
     * 把status 的状态变为1
     * @param id
     * @return
     */
    public ComResult deleteFlag(Integer id) {
        TbFlag flag = new TbFlag();
        flag.setId(id);
        flag.setStatus((short) 1);
        flagMapper.updateByPrimaryKeySelective(flag);
        return ComResult.ok();
    }

    /**
     * 根据id更新flag 信息
     * @param flag
     * @return
     */
    public ComResult updateFlag(TbFlag flag) {
        flagMapper.updateByPrimaryKeySelective(flag);
        return ComResult.ok();
    }

    /**
     * 查询所有
     * @return
     */
    public ComResult queryFlagAll() {
        List<TbFlag> tbFlags = flagMapper.selectAll();
        return ComResult.ok(tbFlags);
    }
}

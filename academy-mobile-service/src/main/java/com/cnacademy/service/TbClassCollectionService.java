package com.cnacademy.service;

import com.cnacademy.dto.ComResult;
import com.cnacademy.mappers.TbClassCollectionMapper;
import com.cnacademy.pojo.TbClassCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbClassCollectionService {
    @Autowired
    private TbClassCollectionMapper classCollectionMapper;

    /**
     * 插入数据，空字段不插入
     * @param classCollection
     * @return
     */
    public ComResult addClassCollection(TbClassCollection classCollection) {
        classCollectionMapper.insertSelective(classCollection);
        return ComResult.ok();
    }

    /**
     * 根据id 查询单个对象
     * @param id
     * @return
     */
    public ComResult queryClassCollection(Integer id) {
        TbClassCollection classCollection = classCollectionMapper.selectByPrimaryKey(id);
        return ComResult.ok(classCollection);
    }

    /**
     * 查询所有
     * @return
     */
    public ComResult queryAll() {
        List<TbClassCollection> tbClassCollections = classCollectionMapper.selectAll();
        return ComResult.ok(tbClassCollections);
    }

    /**
     * 根据id更新课程集信息
     * @param classCollection
     * @return
     */
    public ComResult updateInfo(TbClassCollection classCollection) {
        classCollectionMapper.updateByPrimaryKeySelective(classCollection);
        return ComResult.ok();
    }
}

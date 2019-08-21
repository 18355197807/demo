package com.example.demo.test.dao;

import com.example.demo.test.model.DemoPo;

public interface DemoDao {
    int deleteByPrimaryKey(String uuid);

    int insert(DemoPo record);

    int insertSelective(DemoPo record);

    DemoPo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(DemoPo record);

    int updateByPrimaryKey(DemoPo record);
}
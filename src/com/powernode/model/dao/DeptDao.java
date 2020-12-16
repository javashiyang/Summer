package com.powernode.model.dao;

import com.powernode.entity.Dept;

import java.util.List;

 public interface DeptDao {
    int deleteByPrimaryKey(Integer deptno);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptno);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
    //查询所有
    List<Dept> selectAll();
}
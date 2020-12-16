package com.powernode.model.service.impl;

import com.powernode.entity.Dept;
import com.powernode.model.dao.DeptDao;
import com.powernode.model.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: LoginSSM
 * @Package: com.powernode.model.service.impl
 * @Description: 类
 * @Author: 施洋
 * @CreateDate: 2020/12/14 16:50
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
/*使用注解 @Service 使其放入Service容器中*/
@Service
public class DeptServiceImpl implements DeptService {
  @Autowired
  DeptDao deptDao;
//查询所有
    @Override
    public List<Dept> list() {

        return deptDao.selectAll();
    }
//查询单个信息
  @Override
  public Dept get(int deptno) {

    return deptDao.selectByPrimaryKey(deptno);
  }
//添加信息
  @Override
  public int save(Dept dept) {
    return deptDao.insert(dept);
  }
//修改信息
  @Override
  public int update(Dept dept) {
    return deptDao.updateByPrimaryKey(dept);
  }
//删除信息
  @Override
  public int delete(int deptno) {
    return deptDao.deleteByPrimaryKey(deptno);
  }
}

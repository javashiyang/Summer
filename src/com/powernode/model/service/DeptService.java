package com.powernode.model.service;

import com.powernode.entity.Dept;

import java.util.List;

/**
 * @ProjectName: LoginSSM
 * @Package: com.powernode.model.service
 * @Description: 类
 * @Author: 施洋
 * @CreateDate: 2020/12/14 16:49
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface DeptService {

    //查询
    List<Dept> list();
    //查询一个学生
    Dept get(int deptno);
    //添加
    int save(Dept dept);
    //修改
    int update(Dept dept);
    //删除
    int delete(int deptno);
}

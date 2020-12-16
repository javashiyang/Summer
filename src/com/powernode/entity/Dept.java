package com.powernode.entity;

import java.io.Serializable;

/**
 * dept
 * @author 
 */
public class Dept implements Serializable {
    private Integer deptno;

    private String deptname;

    private String sex;

    private String deptloc;

    private String sal;

    private Integer uid;

    private static final long serialVersionUID = 1L;

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDeptloc() {
        return deptloc;
    }

    public void setDeptloc(String deptloc) {
        this.deptloc = deptloc;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
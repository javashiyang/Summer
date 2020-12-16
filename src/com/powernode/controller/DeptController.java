package com.powernode.controller;

import com.powernode.entity.Dept;
import com.powernode.model.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ProjectName: LoginSSM
 * @Package: com.powernode.controller
 * @Description: 类
 * @Author: 施洋
 * @CreateDate: 2020/12/14 16:53
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */

/*
* servlet使用的4种作用
* 1.接收请求当中的参数（没有参数时不执行）
* String id=req.getParamenter("id=")
* 2.调用模型层
* List<Dept> list =deptService.list()
* 3.往作用域放值（ request） (登录时使用 session)
* req.setAttribute("list",list)
* 4.响应用户（请求转发 重定向 下载 json）
* req.getRequestDispatcher("xxx.jsp").forward(req,resp)
* */
/*使用注解 @Controller 使其放入controller容器中*/
@Controller
@RequestMapping("dept")
public class DeptController {
    /*从容器里取出一个service*/
    @Autowired
    DeptService deptService;

    /*第一种请求方式 srevlet api 处理*/
  /*  @RequestMapping("list")
     void list(HttpServletRequest req, HttpServletResponse resp){
         try {
             //String id=req.getParameter("");//没有传参数所以不接收数据
             List<Dept> list =deptService.list();
             req.setAttribute("deptList",list);
             *//* /=>表示根目录  *//*
             req.getRequestDispatcher("/pages/list.jsp").forward(req,resp);
         }catch (Exception e){
             e.printStackTrace();
         }

   }*/

    /*第二种请求方式 使用ModelAndView*/
 /*   @RequestMapping("list")
    *//*如果有参数 例如id => ModelAndView list( int id) */
   /* ModelAndView list(){
        ModelAndView modelAndView=new ModelAndView();
        //2
        List<Dept> list =deptService.list();
        //3  model:被放在请求作用域当中的对象
      modelAndView.addObject("deptList",list);
       //4
        //请求转发
      modelAndView.setView(new InternalResourceView("/pages/list.jsp"));
        //重定向
        //直接获取视图
       //modelAndView.setView(new RedirectView("pages/list.jsp",true));
         //重定向默认可以出应用
         //获取视图名称
        //viewName经过视图解析器，而view不经过，所以需要写全路径名
         modelAndView.setViewName("list");
        *//*
        * 请求转发与重定向的区别
        * 1.请求转发是一次性请求，重定向是两次请求
        *2.请求转发只在应用的内部，重定向可以向任何地方做重定向
        * 3.请求转发可以取出请求作用域当中的对象（attribute ） ，重定向不可以
        *
        *//*

        return modelAndView;

    }*/
    /* 第三种  返回视图的名称  视图的名称  被视图解析器的前缀和后缀包夹的那个字符串*/
   /* @RequestMapping("list")
    String list(ArrayList<Dept> list){
        //2
        List<Dept> listDB =deptService.list();
        list.addAll(listDB);
        //将listDB集合内容放到ArrayList中
        //3
        //4
        return "list";

    }*/
   /*第四种   返回视图的名称 */
    //只要是map就能放入
  /*  @RequestMapping("list")
    String list(Map<String ,Object> map){
        //2
        List<Dept> list=deptService.list();
        //3
        map.put("deptList",list);
         //4
        return "list";

    }*/
  /*第五种  使用约定 必需在指定目录下*/
   /* @RequestMapping("list")
    void list(Map<String ,Object> map){
        //2
        List<Dept> list=deptService.list();
        //3
        map.put("deptList",list);
        //4(没有代码  约定：当没有指明做何种响应的时候，
        // 默认请求转发到视图解析器的前缀+namespace+action+视图解析器的后缀)
    }*/
    /*第六种 attributeName默认是 按照类型做推断 */
  /*  @RequestMapping("list")
    void list(Map<String ,Object> map) {
        //2
        List<Dept> list = deptService.list();
        //3
        list.addAll(list);
    }*/
    /*第七种 约定*/
 /*   @RequestMapping("list")
    Map<String ,Object> list(){
        Map<String ,Object> map=new HashMap<>();
        //2
        List<Dept> list = deptService.list();
        //3
        map.put("deptList",list);
        return map;

    }*/

     /*请求地址进行servlet的暴露在互联网下，可以通过list进行访问*/
    //查询所有
    @RequestMapping("list")
    List<Dept> list(){


       return deptService.list();//返回值默认是要进入到request的attrubte（request,setAttrubte()）

    }
    //添加
    @RequestMapping("add")
    void add(){

    }

    @RequestMapping("save")
    //接收参数  一：将参数都写在里面 二:使用对象Dept dept
     String save(Dept dept){
       deptService.save(dept);
      //使用重定向时用视图的名字redirect：action的名字
       return "redirect:list";
    }
    //修改
    @RequestMapping("edit")
    Dept  edit(int deptno){
     return deptService.get(deptno);

    }
    //修改
    @RequestMapping("saveUpdate")
    String  edit(Dept dept){
       deptService.update(dept);
        return "redirect:list";

    }

    @RequestMapping("delete")
    int delete(int deptno){
        return deptService.delete(deptno);

    }

}

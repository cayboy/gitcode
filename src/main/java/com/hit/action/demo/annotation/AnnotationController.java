package com.hit.action.demo.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Creat by Administrator on 2018/9/9.
 */
@Controller
public class AnnotationController {
    //请求映射地址http://localhost:80/gitcode/test,其中80为默认端口
    @RequestMapping(value="/test")
    public String goTest(HttpServletRequest request){
        //输出请求URL路径
        System.out.println(request.getRequestURL());
        //返回逻辑名
        return "index";
    }
}

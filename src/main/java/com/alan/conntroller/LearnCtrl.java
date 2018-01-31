package com.alan.conntroller;

import com.alan.domain.Learn;
import com.alan.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 170090 on 2018/1/30.
 */
@Controller
public class LearnCtrl {
    // 登录请求
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map =new HashMap<String,Object>();
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        if(!userName.equals("") && password!=""){
            User user =new User(userName,password);
            request.getSession().setAttribute("user",user);
            map.put("result","1");
        }else{
            map.put("result","0");
        }
        return map;
    }


    @RequestMapping("/learn")
    public ModelAndView index(){
        //页面数据
        List<Learn> learnList =new ArrayList<Learn>();
        Learn bean =new Learn("官方参考文档","Spring Boot Reference Guide","http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        learnList.add(bean);
        bean =new Learn("官方SpriongBoot例子","官方SpriongBoot例子","https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        learnList.add(bean);
        bean =new Learn("Alan博客系列","从零开始学Spring Boot ","https://alan-js.github.io/");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/learn");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }

}

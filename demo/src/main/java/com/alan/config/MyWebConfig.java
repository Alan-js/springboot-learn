package com.alan.config;

import com.alan.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by 170090 on 2018/1/31.
 */
@Configuration
public class MyWebConfig extends WebMvcConfigurerAdapter {

    //设置登录路由
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/Login").setViewName("login");
        super.addViewControllers(registry);
    }

    /**
     * 拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/Login","/login");
        super.addInterceptors(registry);
    }


}

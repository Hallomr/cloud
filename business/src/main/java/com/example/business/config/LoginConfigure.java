package com.example.business.config;

import com.example.core.handler.LoginHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfigure implements WebMvcConfigurer {
    @Autowired
    private LoginHandler loginHandler;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 拦截器的 addPathPatterns：用于设置拦截器的过滤路径规则,会匹配mapping中的路径
         * ,excludePathPatterns：用于设置不需要拦截的过滤规则
         * */
        registry.addInterceptor(loginHandler).excludePathPatterns("/test/**");
    }
}

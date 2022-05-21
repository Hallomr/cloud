package com.example.core.handler;

import com.example.core.anno.LoginAnno;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
/**
 * 登录校验拦截器
 * */
@Component
public class LoginHandler implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(handler instanceof HandlerMethod){
           Class<?> aClass = ((HandlerMethod) handler).getMethod().getDeclaringClass();
           Annotation[] annotations = aClass.getAnnotations();
           for (Annotation annotation : annotations) {
               if(annotation instanceof LoginAnno){
                   System.out.println("---拦截---");
               }
           }
       }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}

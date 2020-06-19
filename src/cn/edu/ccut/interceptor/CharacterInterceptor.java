package cn.edu.ccut.interceptor;


import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator
 */
public class CharacterInterceptor extends HandlerInterceptorAdapter {
    /**资源请求执行之前,返回值true：访问执行Controller；返回false，不执行Controller*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("utf-8");
        return true;
    }

}

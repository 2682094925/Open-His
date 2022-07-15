package com.rhl.mcy.config.shiro;


import com.alibaba.fastjson.JSON;
import com.rhl.mcy.openhis.constant.HttpStatus;
import com.rhl.mcy.openhis.vo.AjaxResult;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * 判断用户是否已经登录
 */
public class ShiroLoginFilter extends FormAuthenticationFilter {


    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletResponse response1 = (HttpServletResponse) response;
        response1.setCharacterEncoding("UTF-8");
        response1.setContentType("application/json");
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.put("code", HttpStatus.UNAUTHORIZED);
        ajaxResult.put("msg","登录认证失效，请重新登录");
        response1.getWriter().write(JSON.toJSON(ajaxResult).toString());
        return false;
    }
}

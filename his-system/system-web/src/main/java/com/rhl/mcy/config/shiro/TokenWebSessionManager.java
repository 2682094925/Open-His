package com.rhl.mcy.config.shiro;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.Serializable;
import java.util.UUID;

public class TokenWebSessionManager extends DefaultWebSessionManager {


    @Override
    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
        String token = WebUtils.toHttp(request).getHeader("token");
        if(StringUtils.isNotEmpty(token)){
            return token;
        }
        return UUID.randomUUID().toString();
    }
}

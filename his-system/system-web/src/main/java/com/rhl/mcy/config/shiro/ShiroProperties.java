package com.rhl.mcy.config.shiro;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "shiro")
@Data
public class ShiroProperties {

    private String hashAlogrithmName = "md5";

    private Integer hashIterators = 2;

    /**
     * 放行的路径
     */
    private String [] anonUrls;

    /**
     * 拦截的路径
     */
    private String [] authcUrls;
}

package com.rhl.mcy.openhis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginBodyDto implements Serializable {
    //  用户名
    @NotNull(message = "用户名不能为空")
    private String username;
    //  密码
    @NotNull(message = "用户密码不能为空")
    private String password;
    // 验证码
    private String code;
}

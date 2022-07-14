package com.rhl.mcy.openhis.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:
 * 构造菜单返回给前台的vo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuTreeVo {
    private String id;

    private String serPath;//菜单表里面的url

    private boolean show = true; //是否显示
}


package com.rhl.mcy.openhis.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class IdGeneratorSnowFlake {
    private static final Logger log = LoggerFactory.getLogger(IdGeneratorSnowFlake.class);
    private static long workId = 0;
    private static long datacenterId = 1;
    private static Snowflake snowflake;


    static {
        try {
//            workId = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
            log.info("当前机器的工作ID为:" + workId);
            snowflake= IdUtil.createSnowflake(workId, datacenterId);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("当前机器的workId获取失败", e);
            workId = NetUtil.getLocalhostStr().hashCode();
        }
    }

    /**
     * 产生4位验证码
     * @return
     */
    public static Integer generateVerificationCode(){
        Random random = new Random();
        int randomNumber = random.nextInt(9000) + 1000;
        return randomNumber;
    }

    /**
     * 生成ID
     */
    public static synchronized Long snowflakeId() {
        return snowflake.nextId();
    }

    /**
     * 根据前缀前成ID
     */
    public static String generatorIdWithProfix(String profix) {
        return profix + snowflakeId();
    }

    public static void main(String[] args) {
        System.out.println(generatorIdWithProfix("CG"));
    }
}

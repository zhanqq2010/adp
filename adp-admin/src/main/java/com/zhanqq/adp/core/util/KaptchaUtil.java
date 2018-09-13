package com.zhanqq.adp.core.util;

import com.zhanqq.adp.config.properties.AdpProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(AdpProperties.class).getKaptchaOpen();
    }
}

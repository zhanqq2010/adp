package com.zhanqq.adp.core.constant;

/**
 * @ClassName IsMenu
 * @Description 是否是菜单的枚举
 * @Author zhanqq
 * @Date 2018/8/2817:44
 * @Version 1.0
 **/
public enum  IsMenu {
    YES(1, "是"),
    NO(0, "不是"); //不是菜单的是按钮

    int code;
    String message;

    IsMenu(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String valueOf(Integer status) {
        if (status == null) {
            return "";
        } else {
            for (IsMenu s : IsMenu.values()) {
                if (s.getCode() == status) {
                    return s.getMessage();
                }
            }
            return "";
        }
    }
}

package com.zhanqq.adp.core.util;

import com.zhanqq.adp.core.support.StrKit;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName ToolUtil
 * @Description TODO
 * @Author zhanqq
 * @Date 2018/8/2710:45
 * @Version 1.0
 **/
public class ToolUtil {

    /**
     *
     * 功能描述
     * @Author zhanqq
     * @Description 对象是否不为空(新增)
     * @Date 17:46 2018/8/28
     * @Param
     * @return
    **/
    public static boolean isNotEmpty(Object o) {
        return !isEmpty(o);
    }

    /**
     *
     * 功能描述
     * @Author zhanqq
     * @Description 对象是否为空
     * @Date 17:46 2018/8/28
     * @Param
     * @return
    **/
    public static boolean isEmpty(Object o) {
        if (o == null) {
            return true;
        }
        if (o instanceof String) {
            if (o.toString().trim().equals("")) {
                return true;
            }
        } else if (o instanceof List) {
            if (((List) o).size() == 0) {
                return true;
            }
        } else if (o instanceof Map) {
            if (((Map) o).size() == 0) {
                return true;
            }
        } else if (o instanceof Set) {
            if (((Set) o).size() == 0) {
                return true;
            }
        } else if (o instanceof Object[]) {
            if (((Object[]) o).length == 0) {
                return true;
            }
        } else if (o instanceof int[]) {
            if (((int[]) o).length == 0) {
                return true;
            }
        } else if (o instanceof long[]) {
            if (((long[]) o).length == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     *
     * 功能描述
     * @Author zhanqq
     * @Description  格式化文本
     * @Date 17:53 2018/8/28
     * @Param 文本模板，被替换的部分用 {} 表示
     * @return
    **/
    public static String format(String template, Object... values) {
        return StrKit.format(template, values);
    }



    public static String firstLetterToUpper(String value){
        if(value.isEmpty()){
            return "";
        }
        return StrKit.firstCharToUpperCase(value);

    }
}

package com.zhanqq.adp.core.beetl;

import com.zhanqq.adp.core.tag.DictSelectorTag;
import com.zhanqq.adp.core.util.KaptchaUtil;
import com.zhanqq.adp.core.util.ToolUtil;
import org.beetl.core.Context;
import org.beetl.core.Function;
import org.beetl.core.Tag;
import org.beetl.core.TagFactory;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import java.io.UnsupportedEncodingException;

public class BeetlConfiguration extends BeetlGroupUtilConfiguration {
    @Autowired
    Environment env;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    DictSelectorTag dictSelectorTag;



    @Override
    public void initOther() {
        groupTemplate.registerFunctionPackage("shiro", new ShiroExt());
        groupTemplate.registerFunctionPackage("tool", new ToolUtil());
        groupTemplate.registerFunctionPackage("kaptcha", new KaptchaUtil());
        groupTemplate.registerTagFactory("dictSelector", new TagFactory() {
            @Override
            public Tag createTag() {
                return dictSelectorTag;
            }
        });

        groupTemplate.registerFunction("env", new Function() {
            @Override
            public String call(Object[] paras, Context ctx) {
                String key = (String)paras[0];
                String value =  env.getProperty(key);
                if(value!=null) {
                    return getStr(value);
                }
                if(paras.length==2) {
                    return (String)paras[1];
                }
                return null;
            }

            protected String getStr(String str) {
                try {
                    return new String(str.getBytes("iso8859-1"),"UTF-8");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

package com.zhanqq.adp.admin.modular.system.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 唤醒DeepLink表
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-28
 */
@TableName("sys_wake_up")
public class WakeUp extends Model<WakeUp> {

    private static final long serialVersionUID = 1L;

    private String cpid;
    private String deeplink;
    @TableField("gmt_create")
    private Date gmtCreate;
    @TableField("gmt_modified")
    private Date gmtModified;


    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    protected Serializable pkVal() {
        return this.cpid;
    }

    @Override
    public String toString() {
        return "WakeUp{" +
        "cpid=" + cpid +
        ", deeplink=" + deeplink +
        ", gmtCreate=" + gmtCreate +
        ", gmtModified=" + gmtModified +
        "}";
    }
}

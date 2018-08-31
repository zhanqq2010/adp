package com.zhanqq.adp.modular.system.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * Jar信息表
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-30
 */
@TableName("sys_jarinfo")
public class Jarinfo extends Model<Jarinfo> {

    private static final long serialVersionUID = 1L;

    private String cpid;
    private String sid;
    @TableField("version_core")
    private Integer versionCore;
    private String address;
    private String result;
    private String code;
    private String md5;
    @TableField("add_time")
    private Date addTime;
    @TableField("channel_tag")
    private String channelTag;


    public String getCpid() {
        return cpid;
    }

    public void setCpid(String cpid) {
        this.cpid = cpid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getVersionCore() {
        return versionCore;
    }

    public void setVersionCore(Integer versionCore) {
        this.versionCore = versionCore;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getChannelTag() {
        return channelTag;
    }

    public void setChannelTag(String channelTag) {
        this.channelTag = channelTag;
    }

    @Override
    protected Serializable pkVal() {
        return this.cpid;
    }

    @Override
    public String toString() {
        return "Jarinfo{" +
        "cpid=" + cpid +
        ", sid=" + sid +
        ", versionCore=" + versionCore +
        ", address=" + address +
        ", result=" + result +
        ", code=" + code +
        ", md5=" + md5 +
        ", addTime=" + addTime +
        ", channelTag=" + channelTag +
        "}";
    }
}

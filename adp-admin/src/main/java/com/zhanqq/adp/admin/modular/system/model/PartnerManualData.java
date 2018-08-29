package com.zhanqq.adp.admin.modular.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 渠道手工数据表
 * </p>
 *
 * @author zhanqq
 * @since 2018-08-28
 */
@TableName("sys_partner_manual_data")
public class PartnerManualData extends Model<PartnerManualData> {

    private static final long serialVersionUID = 1L;

    /**
     * 记录序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 渠道cpid
     */
    private String cpid;
    /**
     * 项目号
     */
    private String sid;
    /**
     * 分成方式；cps,cpa
     */
    private String cpType;
    /**
     * cps分成比例
     */
    private Float cpsRate;
    /**
     * cps总价
     */
    private Float cpsTotal;
    /**
     * cpa单价
     */
    private Float cpaPrice;
    /**
     * cpa数量
     */
    private Integer cpaCount;
    /**
     * 数据日期
     */
    private Date dataDate;
    /**
     * 录入时间
     */
    private Date createTime;
    /**
     * 录入人
     */
    private Integer userId;
    /**
     * 是否展示CPA单价
     */
    private Integer isCpaPrice;
    /**
     * 货币类型（0为元，1为美元）
     */
    private Integer moneytype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getCpType() {
        return cpType;
    }

    public void setCpType(String cpType) {
        this.cpType = cpType;
    }

    public Float getCpsRate() {
        return cpsRate;
    }

    public void setCpsRate(Float cpsRate) {
        this.cpsRate = cpsRate;
    }

    public Float getCpsTotal() {
        return cpsTotal;
    }

    public void setCpsTotal(Float cpsTotal) {
        this.cpsTotal = cpsTotal;
    }

    public Float getCpaPrice() {
        return cpaPrice;
    }

    public void setCpaPrice(Float cpaPrice) {
        this.cpaPrice = cpaPrice;
    }

    public Integer getCpaCount() {
        return cpaCount;
    }

    public void setCpaCount(Integer cpaCount) {
        this.cpaCount = cpaCount;
    }

    public Date getDataDate() {
        return dataDate;
    }

    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsCpaPrice() {
        return isCpaPrice;
    }

    public void setIsCpaPrice(Integer isCpaPrice) {
        this.isCpaPrice = isCpaPrice;
    }

    public Integer getMoneytype() {
        return moneytype;
    }

    public void setMoneytype(Integer moneytype) {
        this.moneytype = moneytype;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PartnerManualData{" +
        "id=" + id +
        ", cpid=" + cpid +
        ", sid=" + sid +
        ", cpType=" + cpType +
        ", cpsRate=" + cpsRate +
        ", cpsTotal=" + cpsTotal +
        ", cpaPrice=" + cpaPrice +
        ", cpaCount=" + cpaCount +
        ", dataDate=" + dataDate +
        ", createTime=" + createTime +
        ", userId=" + userId +
        ", isCpaPrice=" + isCpaPrice +
        ", moneytype=" + moneytype +
        "}";
    }
}

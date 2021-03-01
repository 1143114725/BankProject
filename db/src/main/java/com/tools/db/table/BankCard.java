package com.tools.db.table;


import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * @author EraJieZhang
 * @data 2020/12/4
 */
@Entity
public class BankCard {
    @Id
    private Long id;
    /**
     * 银行名
     */
    private String bankName;
    /**
     * 银行卡号
     */
    private int bankNumber;
    /**
     * 最大额度
     */
    private int maxLines;
    /**
     * 账单日
     */
    private String billingData;
    /**
     * 还款日
     */
    private String payBackData;
    /**
     * 持卡人
     */
    private String cardHolder;
    /**
     * 安全码
     */
    private int safeCode;
    /**
     * 有效日期
     */
    private String effectiveData;
    /**
     * 年费规则
     */
    private String annualFeeRules;
    /**
     * 本月欠款
     */
    private int nowDebt;
    /**
     * 已出账单
     */
    private int hasBill;
    /**
     * 未出账单
     */
    private int negtiveBill;
    /**
     * 本期最低还款金额
     */
    private int minLines;
    /**
     * 是否可用 0 不可用 1 可用
     */
    private int enable;
    /**
     * 绑定用户id
     */
    private int userId;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBankName() {
        return this.bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public int getBankNumber() {
        return this.bankNumber;
    }
    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }
    public int getMaxLines() {
        return this.maxLines;
    }
    public void setMaxLines(int maxLines) {
        this.maxLines = maxLines;
    }
    public String getBillingData() {
        return this.billingData;
    }
    public void setBillingData(String billingData) {
        this.billingData = billingData;
    }
    public String getPayBackData() {
        return this.payBackData;
    }
    public void setPayBackData(String payBackData) {
        this.payBackData = payBackData;
    }
    public String getCardHolder() {
        return this.cardHolder;
    }
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
    public int getSafeCode() {
        return this.safeCode;
    }
    public void setSafeCode(int safeCode) {
        this.safeCode = safeCode;
    }
    public String getEffectiveData() {
        return this.effectiveData;
    }
    public void setEffectiveData(String effectiveData) {
        this.effectiveData = effectiveData;
    }
    public String getAnnualFeeRules() {
        return this.annualFeeRules;
    }
    public void setAnnualFeeRules(String annualFeeRules) {
        this.annualFeeRules = annualFeeRules;
    }
    public int getNowDebt() {
        return this.nowDebt;
    }
    public void setNowDebt(int nowDebt) {
        this.nowDebt = nowDebt;
    }
    public int getHasBill() {
        return this.hasBill;
    }
    public void setHasBill(int hasBill) {
        this.hasBill = hasBill;
    }
    public int getNegtiveBill() {
        return this.negtiveBill;
    }
    public void setNegtiveBill(int negtiveBill) {
        this.negtiveBill = negtiveBill;
    }
    public int getMinLines() {
        return this.minLines;
    }
    public void setMinLines(int minLines) {
        this.minLines = minLines;
    }
    public int getEnable() {
        return this.enable;
    }
    public void setEnable(int enable) {
        this.enable = enable;
    }
    public int getUserId() {
        return this.userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

}

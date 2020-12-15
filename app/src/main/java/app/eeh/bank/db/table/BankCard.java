package app.eeh.bank.db.table;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author EraJieZhang
 * @data 2020/12/4
 */
@Entity
public class BankCard {
    @Id(autoincrement = true)
    private Long id;
    /**
     * 银行名
     */
    private String bankName;
    /**
     * 银行卡号
     */
    private String bankNumber;
    /**
     * 账单金额
     */
    private String amountNum;
    /**
     * 最低还款
     */
    private String miniNum;
    /**
     * 最后还款日期
     */
    private String miniData;
    /**
     * 已还金额
     */
    private String repayment;
    /**
     * 还款日期
     */
    private String repaymentData;
    @Generated(hash = 733405650)
    public BankCard(Long id, String bankName, String bankNumber, String amountNum,
            String miniNum, String miniData, String repayment,
            String repaymentData) {
        this.id = id;
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.amountNum = amountNum;
        this.miniNum = miniNum;
        this.miniData = miniData;
        this.repayment = repayment;
        this.repaymentData = repaymentData;
    }
    @Generated(hash = 1025789730)
    public BankCard() {
    }
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
    public String getBankNumber() {
        return this.bankNumber;
    }
    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }
    public String getAmountNum() {
        return this.amountNum;
    }
    public void setAmountNum(String amountNum) {
        this.amountNum = amountNum;
    }
    public String getMiniNum() {
        return this.miniNum;
    }
    public void setMiniNum(String miniNum) {
        this.miniNum = miniNum;
    }
    public String getMiniData() {
        return this.miniData;
    }
    public void setMiniData(String miniData) {
        this.miniData = miniData;
    }
    public String getRepayment() {
        return this.repayment;
    }
    public void setRepayment(String repayment) {
        this.repayment = repayment;
    }
    public String getRepaymentData() {
        return this.repaymentData;
    }
    public void setRepaymentData(String repaymentData) {
        this.repaymentData = repaymentData;
    }



}

package app.eeh.bank.db.table;

import org.greenrobot.greendao.annotation.Id;

/**
 * @author EraJieZhang
 * @data 2020/12/4
 */
class BankCard {
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



}

package app.eeh.bank.page.edit

import android.text.TextUtils
import android.view.View
import app.eeh.bank.R
import app.eeh.bank.db.table.BankCard
import com.erajie.base.BaseActivity
import com.erajie.db.dbhelp.OperationBankCard
import kotlinx.android.synthetic.main.edit_bank_layout.*

/**
 * 编辑银行信息
 * @author EraJieZhang
 * @data 2020-12-12
 */
class EditBankActivity: BaseActivity() {

    override fun setLayout() {
        setContentView(R.layout.edit_bank_layout)
    }

    override fun initView() {
    }

    override fun initData() {
//        setCreditCardMsg
    }

    override fun setListeneer() {
        /**
         * 提交按钮
         */
        commit.setOnClickListener {
           var result = getCreditCardMsg()?.let { OperationBankCard.addBankCard(this, it) }
        }
    }

    /**
     * 获取输入的银行卡信息
     */
    private fun getCreditCardMsg():BankCard?{
        val bankCard = BankCard()
        bankCard.bankName = et_bank_name.text.toString()
        if (TextUtils.isEmpty(bankCard.bankName)){
            et_bank_name.error = "必填~~~"
            return null
        }
        bankCard.bankNumber = et_card_number.text.toString().toInt()
        bankCard.maxLines = et_max_lines.text.toString().toInt()
        bankCard.billingData = et_billing_data.text.toString()
        bankCard.payBackData = et_pay_back_data.text.toString()
        bankCard.cardHolder = et_card_holder.text.toString()
        bankCard.safeCode = et_safe_code.text.toString().toInt()
        bankCard.effectiveData = et_effective_data.text.toString()
        bankCard.annualFeeRules = et_annual_fee_rules.text.toString()
        /*以上均需验证必填等属性*/
        bankCard.nowDebt = et_now_debt.text.toString().toInt()
        bankCard.hasBill = et_has_bill.text.toString().toInt()
        bankCard.negtiveBill = et_negtive_bill.text.toString().toInt()
        bankCard.minLines = et_min_lines.text.toString().toInt()
        return bankCard
    }

    /**
     * 设置银行卡信息，并禁止使用edittext
     */
    private fun setCreditCardMsg(bankCard:BankCard){
        group.visibility = View.GONE

        et_bank_name.setText(bankCard.bankName)
        et_card_number.setText(bankCard.bankNumber)
        et_max_lines.setText(bankCard.maxLines)
        et_billing_data.setText(bankCard.billingData)
        et_pay_back_data.setText(bankCard.payBackData)
        et_card_holder.setText(bankCard.cardHolder)
        et_safe_code.setText(bankCard.safeCode)
        et_effective_data.setText(bankCard.effectiveData)

        et_annual_fee_rules.setText(bankCard.annualFeeRules)
        et_now_debt.setText(bankCard.nowDebt)
        et_has_bill.setText(bankCard.hasBill)
        et_negtive_bill.setText(bankCard.negtiveBill)
        et_min_lines.setText(bankCard.minLines)
        /*设置edittext不可用*/
        et_bank_name.isEnabled = false
        et_card_number.isEnabled = false
        et_max_lines.isEnabled = false
        et_billing_data.isEnabled = false
        et_pay_back_data.isEnabled = false
        et_card_holder.isEnabled = false
        et_safe_code.isEnabled = false
        et_effective_data.isEnabled = false
        et_annual_fee_rules.isEnabled = false
        et_now_debt.isEnabled = false
        et_has_bill.isEnabled = false
        et_negtive_bill.isEnabled = false
        et_min_lines.isEnabled = false
    }
}
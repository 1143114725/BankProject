package app.eeh.bank.edit

import android.os.Bundle
import app.eeh.bank.R
import com.erajie.base.BaseActivity

/**
 * 编辑银行信息
 * @author EraJieZhang
 * @data 2020-12-12
 */
class EditBankActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_bank_layout)
    }
}
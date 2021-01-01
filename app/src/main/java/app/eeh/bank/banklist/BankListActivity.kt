package app.eeh.bank.banklist

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import app.eeh.bank.R
import app.eeh.bank.edit.EditBankActivity
import app.eeh.bank.util.AppRTCBluetoothManager
import com.erajie.base.BaseActivity
import com.erajie.rxutils.RxImageTool
import com.erajie.rxutils.RxLogTool
import com.erajie.util.SpaceItemDecoration
import kotlinx.android.synthetic.main.banklist_layout.*


/**
 * 银行卡列表页
 * @author EraJieZhang
 * @data 2020/11/16
 */
class BankListActivity : BaseActivity() {

    private val mLogTag: String = "BankListActivity"
    private var bankAdapter: BankAdapter? = null
    private var mList: ArrayList<String> = ArrayList()
    var manager :AppRTCBluetoothManager? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.banklist_layout)
        bank_list.layoutManager = LinearLayoutManager(this)
        setdata()
        bankAdapter = BankAdapter(this, mList)
        bank_list.addItemDecoration(SpaceItemDecoration(RxImageTool.dip2px(10F)))
        bank_list.adapter = bankAdapter
        bankAdapter?.setOnItemClickListener { _, i ->
            RxLogTool.d(mLogTag, "i=$i")
            goToActivity(this, EditBankActivity::class.java)
            manager = AppRTCBluetoothManager.create(this)
            manager?.start()
        }
    }

    private fun setdata() {
        for (i in 1 until 10) {
            mList.add("")
        }
    }

    override fun onDestroy() {
        manager?.stop()
        super.onDestroy()
    }
}
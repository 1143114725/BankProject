package app.eeh.bank.banklist

import androidx.recyclerview.widget.LinearLayoutManager
import app.eeh.bank.R
import app.eeh.bank.db.table.BankCard
import app.eeh.bank.page.banklist.BankAdapter
import app.eeh.bank.page.edit.EditBankActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.erajie.base.BaseActivity
import com.erajie.global.ARouterPath
import com.erajie.rxutils.RxImageTool
import com.erajie.rxutils.RxLogTool
import com.erajie.util.SpaceItemDecoration
import kotlinx.android.synthetic.main.banklist_layout.*


/**
 * 银行卡列表页
 * @author EraJieZhang
 * @data 2020/11/16
 */
@Route(group = ARouterPath.GROUP_BANK, path = ARouterPath.BankListActivity)
class BankListActivity : BaseActivity() {

    private val mLogTag: String = "BankListActivity"
    private var bankAdapter: BankAdapter? = null
    private var mList: ArrayList<BankCard> = ArrayList()

    override fun setLayout() {
        setContentView(R.layout.banklist_layout)
    }

    override fun initView() {
        bank_list.layoutManager = LinearLayoutManager(this)
        bankAdapter = BankAdapter(this, mList)
        bank_list.addItemDecoration(SpaceItemDecoration(RxImageTool.dip2px(10F)))
        bank_list.adapter = bankAdapter
        bankAdapter?.setOnItemClickListener { _, i ->
            RxLogTool.d(mLogTag, "i=$i")
            goToActivity(this, EditBankActivity::class.java)
        }
    }

    override fun initData() {
        for (i in 1 until 10) {
            var bankCard = BankCard()
            mList.add(bankCard)
        }
        bankAdapter?.notifyDataSetChanged()
    }

    override fun setListeneer() {

    }

}


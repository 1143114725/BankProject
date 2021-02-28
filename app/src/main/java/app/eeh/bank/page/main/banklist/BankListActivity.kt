package app.eeh.bank.banklist

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import app.eeh.bank.R
import app.eeh.bank.page.main.banklist.BankAdapter
import com.alibaba.android.arouter.facade.annotation.Route
import com.erajie.arout.BaseArouteUtil
import com.erajie.base.BaseActivity
import com.erajie.db.dbhelp.OperationBankCard
import com.erajie.global.ARouterPath
import com.erajie.rxutils.RxImageTool
import com.erajie.rxutils.RxLogTool
import com.erajie.util.SpaceItemDecoration
import com.tools.db.table.BankCard
import kotlinx.android.synthetic.main.banklist_layout.*


/**
 * 银行卡列表页
 * @author EraJieZhang
 * @data 2020/11/16
 */
@Route(group = ARouterPath.GROUP_BANK, path = ARouterPath.BANK_LIST_ACTIVITY)
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
            BaseArouteUtil.returnActivity(ARouterPath.EDIT_BANK_ACTIVITY)
        }

    }

    override fun initData() {
        mList = OperationBankCard.getBankCard() as ArrayList<BankCard>
        notifyData()
    }

    override fun setListeneer() {

    }

    private fun notifyData(){
        if (mList.isNotEmpty() && mList.size > 0){
            enable_data.visibility = View.GONE
            bank_list.visibility = View.VISIBLE
        }else {
            enable_data.visibility = View.VISIBLE
            bank_list.visibility = View.GONE
        }
        bankAdapter?.notifyDataSetChanged()
    }

}


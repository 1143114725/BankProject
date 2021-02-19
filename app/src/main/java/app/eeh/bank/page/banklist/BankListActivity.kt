package app.eeh.bank.banklist

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import app.eeh.bank.R
import app.eeh.bank.db.table.BankCard
import app.eeh.bank.page.banklist.BankAdapter
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.erajie.arout.BaseArouteUtil
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
//        mList = OperationBankCard.getBankCard(this) as ArrayList<BankCard>
        for (i in 1 until 10) {
            var bankCard = BankCard()
            mList.add(bankCard)
        }
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


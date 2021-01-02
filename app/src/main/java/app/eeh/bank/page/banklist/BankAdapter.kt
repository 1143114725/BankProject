package app.eeh.bank.page.banklist

import android.content.Context
import app.eeh.bank.R
import app.eeh.bank.db.table.BankCard
import com.erajie.base.BaseRecyclerAdapter
import com.erajie.base.RecyclerViewHolder

/**
 * 银行卡列表adapter
 * @author EraJieZhang
 * @data 2020/11/16
 */
class BankAdapter(ctx: Context?, list: ArrayList<BankCard>?) : BaseRecyclerAdapter<BankCard>(ctx, list) {
    override fun getItemLayoutId(viewType: Int): Int {
       return R.layout.item_bank_msg
    }

    override fun bindData(holder: RecyclerViewHolder?, position: Int, item: BankCard?) {

    }
}
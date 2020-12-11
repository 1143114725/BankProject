package app.eeh.bank

import android.content.Context
import com.erajie.base.BaseRecyclerAdapter
import com.erajie.base.RecyclerViewHolder

/**
 *
 * @author EraJieZhang
 * @data 2020/11/16
 */
class BankAdapter(ctx: Context?, list: ArrayList<String>?) : BaseRecyclerAdapter<String>(ctx, list) {
    override fun getItemLayoutId(viewType: Int): Int {
       return R.layout.item_bank_msg
    }

    override fun bindData(holder: RecyclerViewHolder?, position: Int, item: String?) {

    }
}
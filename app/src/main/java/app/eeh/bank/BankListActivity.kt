package app.eeh.bank

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import app.eeh.bank.db.table.Student
import com.erajie.base.BaseActivity
import com.erajie.db.dbhelp.OperationStudent.Companion.addStudent
import com.erajie.db.dbhelp.OperationStudent.Companion.getStudent
import com.erajie.rxutils.RxImageTool
import com.erajie.util.SpaceItemDecoration
import kotlinx.android.synthetic.main.banklist_layout.*

/**
 *
 * @author EraJieZhang
 * @data 2020/11/16
 */
class BankListActivity : BaseActivity() {

    var bankAdapter: BankAdapter? = null
    var mList: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.banklist_layout)
        bank_list.layoutManager = LinearLayoutManager(this)
        setdata()
        bankAdapter = BankAdapter(this, mList)
        bank_list.addItemDecoration(SpaceItemDecoration(RxImageTool.dip2px(10F)))
        bank_list.adapter = bankAdapter
        bankAdapter?.setOnItemClickListener { view: View, i: Int ->
//            addStudent(this)
//            val list: List<Student> = getStudent(this)
//            Log.e("tag", list[0].toString())
//            Log.e("tag", "${list.size}")
        }
    }

    fun setdata() {
        for (i in 1 until 10) {
            mList.add("")
        }
    }
}
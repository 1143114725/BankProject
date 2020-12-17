package app.eeh.bank

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothProfile
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.erajie.base.BaseActivity
import com.erajie.rxutils.RxImageTool
import com.erajie.rxutils.RxLogTool
import com.erajie.util.SpaceItemDecoration
import kotlinx.android.synthetic.main.banklist_layout.*


/**
 *银行卡列表页
 * @author EraJieZhang
 * @data 2020/11/16
 */
class BankListActivity : BaseActivity() {

    private val mLogTag: String = "BankListActivity"
    private var bankAdapter: BankAdapter? = null
    private var mList: ArrayList<String> = ArrayList()
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
//            Thread {
//                val client: BosClient = BosUtils.initBos()
//                BosUtils.getBookNameFileName(client)
//            }.start()
//

//            goToActivity(this,EditBankActivity::class.java)
            var adapter = BluetoothAdapter.getDefaultAdapter()
            handleHeadsetStateChange(adapter)
        }
    }

    private fun setdata() {
        for (i in 1 until 10) {
            mList.add("")

        }
    }



    private fun handleHeadsetStateChange(adapter:BluetoothAdapter) {
        val intent = Intent(Intent.ACTION_HEADSET_PLUG)
        if (BluetoothProfile.STATE_CONNECTED == adapter.getProfileConnectionState(BluetoothProfile.HEADSET)) {
            intent.putExtra("state", 1)
            intent.putExtra("microphone", 1)
            this.sendBroadcast(intent)
        } else if (BluetoothProfile.STATE_DISCONNECTED == adapter.getProfileConnectionState(
                BluetoothProfile.HEADSET
            )
        ) {
            intent.putExtra("state", -1)
            this.sendBroadcast(intent)
        }
    }
}
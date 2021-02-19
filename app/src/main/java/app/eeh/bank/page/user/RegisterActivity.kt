package app.eeh.bank.page.user

import app.eeh.bank.R
import app.eeh.bank.db.table.User
import com.alibaba.android.arouter.facade.annotation.Route
import com.erajie.base.BaseActivity
import com.erajie.db.dbhelp.OperationUser
import com.erajie.global.ARouterPath
import com.erajie.rxutils.view.RxToast
import kotlinx.android.synthetic.main.register_layout.*

/**
 * 注册页面
 * @author EraJieZhang
 * @data 2021-2-15
 */
@Route(path = ARouterPath.REGISTER_ACTIVITY,group = ARouterPath.GROUP_BANK)
class RegisterActivity : BaseActivity() {
    override fun setListeneer() {
        register.setOnClickListener {
            val user = User()
            user.enable = 1
            user.userId = user_name.text.toString()
            user.passWord = pass_world.text.toString()
            val result = OperationUser.addBankCard(this, user)
            if (result > 0){
                RxToast.success("注册成功！")
            }else{
                RxToast.error("注册失败")
            }
        }
    }

    override fun initView() {
    }

    override fun initData() {

    }

    override fun setLayout() {
        setContentView(R.layout.register_layout)
    }
}
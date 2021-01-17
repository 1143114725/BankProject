package app.eeh.bank.page.user

import android.text.TextUtils
import app.eeh.bank.R
import com.erajie.base.BaseActivity
import com.erajie.rxutils.RxLogTool
import kotlinx.android.synthetic.main.login_layout.*

/**
 * 登录页面
 * @author EraJieZhang
 * @data 2021-1-17
 */
class LoginActivity : BaseActivity() {

    override fun setLayout() {
        setContentView(R.layout.login_layout)
    }

    override fun initView() {
    }

    override fun initData() {
    }


    override fun setListeneer() {
        login.setOnClickListener {
            login()
        }
    }

    /**
     * 登录账号
     */
    private fun login(){
        val userName = user_name.text
        val password = pass_world.text
        if (TextUtils.isEmpty(userName)){
            user_name.error = "账号不能为空"
            return
        }
        if (TextUtils.isEmpty(password)){
            user_name.error = "密码不能为空"
            return
        }
        RxLogTool.i("userName  = $userName  password = $password")
    }

}
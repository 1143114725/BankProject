package app.eeh.bank.page.user

import android.text.TextUtils
import app.eeh.bank.R
import com.alibaba.android.arouter.facade.annotation.Route
import com.erajie.arout.BaseArouteUtil
import com.erajie.base.BaseActivity
import com.erajie.db.dbhelp.OperationUser
import com.erajie.global.ARouterPath
import com.erajie.rxutils.RxLogTool
import com.erajie.rxutils.view.RxToast
import kotlinx.android.synthetic.main.login_layout.*

/**
 * 登录页面
 * @author EraJieZhang
 * @data 2021-1-17
 */
@Route(path = ARouterPath.LOGIN_ACTIVITY,group = ARouterPath.GROUP_BANK)
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
        register.setOnClickListener {
            BaseArouteUtil.returnActivity(ARouterPath.REGISTER_ACTIVITY)
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
        val result = OperationUser.doLogin(this,userName.toString(),password.toString() )
        if (result.isEmpty()){
            RxToast.error("登录失败！")
            return
        }
        RxToast.success("登录成功！")
        BaseArouteUtil.returnActivity(ARouterPath.BANK_LIST_ACTIVITY)
    }

}
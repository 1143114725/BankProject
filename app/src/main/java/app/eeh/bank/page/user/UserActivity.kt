package app.eeh.bank.page.user

import app.eeh.bank.R
import com.alibaba.android.arouter.facade.annotation.Route
import com.erajie.base.BaseActivity
import com.erajie.global.ARouterPath

/**
 * 个人信息页面
 * @author EraJieZhang
 * @data 2021-1-17
 */
@Route(group = ARouterPath.GROUP_BANK,path = ARouterPath.UserActivity)
class UserActivity : BaseActivity() {

    override fun setListeneer() {
    }

    override fun initView() {
    }

    override fun initData() {
    }

    override fun setLayout() {
        setContentView(R.layout.user_login)
    }
}
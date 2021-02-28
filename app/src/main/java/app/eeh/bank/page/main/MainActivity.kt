package app.eeh.bank.page.main

import androidx.viewpager2.widget.ViewPager2
import app.eeh.bank.R
import com.erajie.base.BaseActivity

/**
 *
 * @author EraJieZhang
 * @data 2021-2-28
 */
class MainActivity: BaseActivity(){
    private var viewPager2: ViewPager2? = null
    private var viewPagerAdapter :ViewPagerAdapter?=null
        override fun setListeneer() {
    }

    override fun initView() {
//        viewPager2 = findViewById(R.id.root_vp);
//        viewPagerAdapter = ViewPagerAdapter();
//        viewPager2?.adapter = viewPagerAdapter;
//        viewPager2?.orientation = ViewPager2.ORIENTATION_VERTICAL;

        showFragment(R.id.root,FragmentA())
    }

    override fun initData() {
    }

    override fun setLayout() {

        setContentView(R.layout.main_layout)
    }
}
package app.eeh.bank.page.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.eeh.bank.R
import com.erajie.base.BaseFragment
import kotlinx.android.synthetic.main.item_page.*

/**
 *
 * @author EraJieZhang
 * @data 2021-2-28
 */
class FragmentA :BaseFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_page, container, false);
//        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        RelativeLayout container = view.findViewById(R.id.container);
//        TextView tvTitle = view.findViewById(R.id.tvTitle);
//        container.setBackgroundResource(mColors.get(mPosition));
//        tvTitle.setText("Item " + mPosition);
        tvTitle.text = "123456"
    }

    override fun initData() {
    }

    override fun setLayout() {
    }

    override fun setListener() {
    }

    override fun initView(view: View?) {
    }
}
package app.eeh.bank;

import android.os.Bundle;

import com.erajie.base.BaseActivity;
import com.erajie.rxutils.RxLogTool;

/**
 * @author EraJieZhang
 * @data 2020-12-29
 */
public class TextActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RxLogTool.d("1");
        RxLogTool.d("2");
        RxLogTool.d("3");
    }
}

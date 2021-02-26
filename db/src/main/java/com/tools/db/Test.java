package com.tools.db;

import com.erajie.rxutils.view.RxToast;

/**
 * @author EraJieZhang
 * @data 2021-2-19
 */
public class Test {
    public static void add(){
        if (DbTools.Companion.getContext() == null){
            RxToast.error("error!!!");
        }else{
            RxToast.success("SUCCESS!!!");
        }
    }
}

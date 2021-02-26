package com.tools.db

import android.annotation.SuppressLint
import android.content.Context
import com.erajie.rxutils.RxCrashTool
import com.erajie.rxutils.view.RxToast

/**
 *
 * @author EraJieZhang
 * @data 2021-2-19
 */
class DbTools {
    companion object{
        @SuppressLint("StaticFieldLeak")
        private var context: Context? = null

        /**
         * 初始化工具类
         *
         * @param mContext 上下文
         */
        fun init(mContext: Context) {
            context = mContext.applicationContext
            RxCrashTool.init(context)
        }

        /**
         * 获取Context
         */
        fun getContext():Context{
            if (context == null){
                RxToast.error("DB:请先调用init()方法")
            }
            return context as Context
        }
    }
}
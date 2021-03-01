package com.tools.db

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.erajie.rxutils.RxCrashTool
import com.erajie.rxutils.view.RxToast
import com.tools.db.table.MyObjectBox
import io.objectbox.BoxStore
import io.objectbox.android.AndroidObjectBrowser

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
            initDb(mContext)
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

        // 延迟加载属性
        lateinit var boxStore: BoxStore

        fun initDb(context: Context) {
            boxStore = MyObjectBox.builder().androidContext(context).build()
            // 浏览器查看数据使用
//            if (BuildConfig.DEBUG) {
//                boxStore?.let {
//                    //可以理解为初始化连接浏览器(可以在浏览器中查看数据，下面再说)
//                    val started = AndroidObjectBrowser(boxStore).start(this)
//                    Log.i("ObjectBrowser", "Started: " + started)
//                }
//            }
        }
    }



}
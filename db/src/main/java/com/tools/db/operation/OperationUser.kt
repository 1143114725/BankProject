package com.erajie.db.dbhelp

import android.content.Context
import com.tools.db.DbTools
import com.tools.db.table.User
import com.tools.db.table.User_
import io.objectbox.Box
import io.objectbox.query.QueryBuilder


/**
 * 数据库操作文件
 * @author EraJieZhang
 * @data 2020/11/17
 */
class OperationUser {
    companion object {

        private fun getBoxStore():Box<User>{
            val boxStore = DbTools.boxStore
            return boxStore.boxFor(User::class.java)
        }

        /**
         * 添加一条数据
         */

        fun addBankCard(bankCard: User): Long {
            return getBoxStore().put(bankCard)
        }

        /**
         * 获取表中全部数据
         */
        fun getBankCard():List<User>{
            return getBoxStore().all
        }

        /**
         * 修改一条数据
         */
        fun updateBankCard(context: Context,newUser: User) {
            getBoxStore().put(newUser)
        }

        /**
         * @param context
         * @param userName 用户名
         * @param pass  密码
         * @return 查询到的list 没有返回一个空的list实例
         */
        fun doLogin(userName:String,pass:String):List<User>{

            val query: QueryBuilder<User> = getBoxStore().query()
            query.equal(User_.enable,1)
                .equal(User_.userId,userName).equal(User_.passWord,pass)
            return query.build().find()

        }




    }
}
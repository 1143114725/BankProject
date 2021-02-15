package com.erajie.db.dbhelp

import android.content.Context
import app.eeh.bank.db.DbManager
import app.eeh.bank.db.UserDao
import app.eeh.bank.db.table.User
import org.greenrobot.greendao.query.WhereCondition

/**
 * 数据库操作文件
 * @author EraJieZhang
 * @data 2020/11/17
 */
class OperationUser {
    companion object {

        /**
         * 添加一条数据
         */
        fun addBankCard(context: Context, bankCard: User): Long {
            val result = DbManager.getDaoSession(context).userDao.insert(bankCard)
            DbManager.closeConnection()
            return result
        }

        /**
         * 根据条件获取数据
         */
        fun getBankCardWhereAge(context: Context, where: WhereCondition):List<User>{
            DbManager.getDaoSession(context).userDao.detachAll()
            return DbManager.getDaoSession(context).userDao.queryBuilder().where(where).list()
        }

        /**
         * 获取表中全部数据
         */
        fun getBankCard(context: Context):List<User>{
            return getBankCardWhereAge(context, UserDao.Properties.Enable.eq(1))
        }

        /**
         * 修改一条数据
         */
        fun updateBankCard(context: Context,user: User) {
            DbManager.getDaoSession(context).userDao.update(user)
        }

        /**
         * @param context
         * @param userName 用户名
         * @param pass  密码
         * @return 查询到的list 没有返回一个空的list实例
         */
        fun doLogin(context: Context,userName:String,pass:String):List<User>{
            DbManager.getDaoSession(context).userDao.detachAll()
            val userBuilder = DbManager.getDaoSession(context).userDao.queryBuilder()
            userBuilder.where(UserDao.Properties.Enable.eq(1))
            userBuilder.and(UserDao.Properties.UserId.eq(userName),UserDao.Properties.PassWord.eq(pass))

            return if(userBuilder.list() != null) userBuilder.list() else ArrayList()
        }




    }
}
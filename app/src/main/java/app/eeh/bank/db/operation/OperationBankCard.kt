package com.erajie.db.dbhelp

import android.content.Context
import app.eeh.bank.db.BankCardDao
import app.eeh.bank.db.DbManager
import app.eeh.bank.db.table.BankCard
import org.greenrobot.greendao.query.WhereCondition

/**
 * 数据库操作文件
 * @author EraJieZhang
 * @data 2020/11/17
 */
class OperationBankCard {
    companion object {

        /**
         * 添加一条数据
         */
        fun addBankCard(context: Context, bankCard: BankCard): Long {
            val result = DbManager.getDaoSession(context).bankCardDao.insert(bankCard)
            DbManager.closeConnection()
            return result
        }

        /**
         * 根据条件获取数据
         */
        fun getBankCardWhereAge(context: Context, where: WhereCondition):List<BankCard>{
            DbManager.getDaoSession(context).bankCardDao.detachAll()
            return DbManager.getDaoSession(context).bankCardDao.queryBuilder().where(where).list()
        }

        /**
         * 获取表中全部数据
         */
        fun getBankCard(context: Context):List<BankCard>{
            return getBankCardWhereAge(context, BankCardDao.Properties.Enable.eq(1))
        }

        /**
         * 修改一条数据
         */
        fun updateBankCard(context: Context,bankCard: BankCard) {
            DbManager.getDaoSession(context).bankCardDao.update(bankCard)
        }

    }
}
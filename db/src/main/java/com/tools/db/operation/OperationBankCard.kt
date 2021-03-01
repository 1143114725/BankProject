package com.erajie.db.dbhelp

import android.content.Context
import com.tools.db.DbTools
import com.tools.db.table.BankCard
import com.tools.db.table.User
import io.objectbox.Box

/**
 * 数据库操作文件
 * @author EraJieZhang
 * @data 2020/11/17
 */
class OperationBankCard {
    companion object {
        private fun getBoxStore(): Box<BankCard> {
            val boxStore = DbTools.boxStore
            return boxStore.boxFor(BankCard::class.java)
        }
        /**
         * 添加一条数据
         */
        fun addBankCard(bankCard: BankCard): Long {
            return getBoxStore().put(bankCard)
        }

        /**
         * 获取表中全部数据
         */
        fun getBankCard():List<BankCard>{
            return getBoxStore().all
        }

        /**
         * 修改一条数据
         */
        fun updateBankCard(context: Context,bankCard: BankCard) {
            getBoxStore().put()
        }

    }
}
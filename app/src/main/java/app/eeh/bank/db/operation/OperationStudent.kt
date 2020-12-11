package com.erajie.db.dbhelp

import android.content.Context
import app.eeh.bank.db.DbManager
import app.eeh.bank.db.StudentDao
import app.eeh.bank.db.table.Student
import org.greenrobot.greendao.query.WhereCondition

/**
 *
 * @author EraJieZhang
 * @data 2020/11/17
 */
class OperationStudent {
    companion object {
        fun addStudent(context: Context) {
            val student = Student()
            student.age = 12
            student.name = "name"
            student.num = "13022225555"
            DbManager.getDaoSession(context).studentDao.insert(student)
        }

        fun getStudentWhereAge(context: Context, where: WhereCondition):List<Student>{
            return DbManager.getDaoSession(context).studentDao.queryBuilder().where(where).list()
        }
        fun getStudent(context: Context):List<Student>{
            return getStudentWhereAge(context, StudentDao.Properties.Id.eq(1))
        }

        fun updateStudent(context: Context){
            val student = Student()
            student.age = 12
            student.name = "name"
            student.num = "13022225555"
            DbManager.getDaoSession(context).update(student)
        }

    }
}
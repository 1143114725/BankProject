package app.eeh.bank.util

import app.eeh.bank.util.MmkvUtils.Companion.mv
import com.tencent.mmkv.MMKV


/**
 * 初始化MMKV   在Application  String rootDir = MMKV.initialize(this);
 * 测试一下git 上传
 * @author EraJieZhang
 * @data 2020-12-14
 */
class MmkvUtils {
    companion object{

        var mv: MMKV? = null

        fun getMMKV(): EnCodeMMKV {
            if (mv == null){
                mv = MMKV.defaultMMKV();
            }
            return EnCodeMMKV()
        }

    }
}

class EnCodeMMKV{
    /**
     * 保存基本数据
     */
    fun encode(key: String?, value: Any) {
        if (value is String) {
            MmkvUtils.mv?.encode(key, value)
        } else if (value is Int) {
            MmkvUtils.mv?.encode(key, value)
        } else if (value is Boolean) {
            MmkvUtils.mv?.encode(key, value)
        } else if (value is Float) {
            MmkvUtils.mv?.encode(key, value)
        } else if (value is Long) {
            MmkvUtils.mv?.encode(key, value)
        } else if (value is Double) {
            MmkvUtils.mv?.encode(key, value)
        } else if (value is ByteArray) {
            MmkvUtils.mv?.encode(key, value)
        } else {
            MmkvUtils.mv?.encode(key, value.toString())
        }
    }

    /**
     * 得到保存数据的方法，我们根据默认值得到保存的数据的具体类型，然后调用相对于的方法获取值
     */
    fun decodeInt(key: String?): Int? {
        return mv?.decodeInt(key, 0)
    }

    fun decodeDouble(key: String?): Double? {
        return mv?.decodeDouble(key, 0.00)
    }

    fun decodeLong(key: String?): Long? {
        return mv?.decodeLong(key, 0L)
    }

    fun decodeBoolean(key: String?): Boolean? {
        return mv?.decodeBool(key, false)
    }

    fun decodeFloat(key: String?): Float? {
        return mv?.decodeFloat(key, 0f)
    }

    fun decodeBytes(key: String?): ByteArray? {
        return mv?.decodeBytes(key)
    }

    fun decodeString(key: String?): String? {
        return mv?.decodeString(key, "")
    }

    /**
     * 移除某个key对
     *
     * @param key
     */
    fun removeKey(key: String?) {
        mv?.removeValueForKey(key)
    }

    /**
     * 清除所有key
     */
    fun clearAll() {
        mv?.clearAll()
    }
}
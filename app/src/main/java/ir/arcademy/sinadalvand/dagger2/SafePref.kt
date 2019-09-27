package ir.arcademy.sinadalvand.dagger2

import android.content.Context
import android.util.Log
import javax.inject.Inject

class SafePref @Inject constructor(val context: Context, val zcript: Zcript) {

    private val pref = context.getSharedPreferences("dagger_pref", Context.MODE_PRIVATE)

    private val editor = pref.edit()


    fun put(key: String, value: String) {
        val encryptedString = zcript.encrypt(value)
        Log.e("SafePref", "Encrypted Value is: ${encryptedString}")
        editor.putString(key, encryptedString)
        editor.commit()
    }


    fun get(key: String, default: String): String {
        return zcript.decrypt(pref.getString(key, default) ?: default)
    }


}
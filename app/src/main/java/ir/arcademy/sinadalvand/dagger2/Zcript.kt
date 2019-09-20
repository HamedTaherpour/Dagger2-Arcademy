package ir.arcademy.sinadalvand.dagger2

import android.util.Log
import javax.inject.Inject

class Zcript @Inject constructor(val zsecure: Zsecure) {

    @Inject
    var zsecure: Zsecure? = null


    fun encrypt(str: String): String {
        return str
    }

    fun decrypt(str: String): String {
        Log.e("Dagger2", "Decrypt run ...  Key: ${zsecure?.Z_KEY}")
        return str
    }


    @Inject
    fun ZsecureInject(zsecure: Zsecure) {
        this.zsecure = zsecure
    }

}
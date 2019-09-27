package ir.arcademy.sinadalvand.dagger2

import android.util.Base64
import android.util.Log
import javax.inject.Inject

class Zcript @Inject constructor() {


    var zsecure: Zsecure? = null


    // arcademy ==> Qxlkacmklv=
    fun encrypt(str: String): String {
        return Base64.encodeToString(str.toByteArray(), Base64.DEFAULT)
    }


    fun decrypt(str: String): String {
        return String(Base64.decode(str, Base64.DEFAULT))
    }


    @Inject
    fun ZsecureInject(zsecure: Zsecure) {
        this.zsecure = zsecure
    }

}
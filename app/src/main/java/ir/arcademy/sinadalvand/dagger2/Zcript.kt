package ir.arcademy.sinadalvand.dagger2

import android.util.Base64
import android.util.Log
import ir.arcademy.sinadalvand.dagger2.di.qualifier.CustomZsecureName
import javax.inject.Inject
import javax.inject.Named

class Zcript @Inject constructor() {


    var zsecure: Zsecure? = null


    // arcademy ==> Qxlkacmklv=
    fun encrypt(str: String): String {
        Log.e("Zcript Log","Encryption done by key=${zsecure?.Z_KEY}")
        return Base64.encodeToString(str.toByteArray(), Base64.DEFAULT)
    }


    fun decrypt(str: String): String {
        return String(Base64.decode(str, Base64.DEFAULT))
    }


    @Inject
    fun ZsecureInject( @Named("Zsecure2") zsecure: Zsecure) {
        this.zsecure = zsecure
    }

}
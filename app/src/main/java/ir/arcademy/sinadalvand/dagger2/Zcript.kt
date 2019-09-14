package ir.arcademy.sinadalvand.dagger2

import android.util.Log
import javax.inject.Inject

class Zcript @Inject constructor() {


    fun encrypt(str:String):String{
        return str
    }

    fun decrypt(str:String):String{
        Log.e("Dagger2","Decrypt run ...")
        return str
    }


}
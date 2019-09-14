package ir.arcademy.sinadalvand.dagger2

import android.app.Application

class DaggerApplication:Application() {

    companion object{
        val Z_KEY = "123456789"
        val Z_IV = "123456"
        val zcript = Zcript(Z_KEY, Z_IV)
    }

    override fun onCreate() {
        super.onCreate()
    }
}
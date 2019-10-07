package ir.arcademy.sinadalvand.dagger2

import android.app.Application
import ir.arcademy.sinadalvand.dagger2.di.ArcademyComponent
import ir.arcademy.sinadalvand.dagger2.di.DaggerArcademyComponent

class DaggerApplication:Application() {



   lateinit var daggerComponent:ArcademyComponent


    override fun onCreate() {
        super.onCreate()

        daggerComponent = DaggerArcademyComponent.builder().setContext(this).build()
    }
}
package ir.arcademy.sinadalvand.dagger2

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ir.arcademy.sinadalvand.dagger2.di.ArcademyComponent
import ir.arcademy.sinadalvand.dagger2.di.DaggerArcademyComponent

class ArcademyApplication : DaggerApplication() {


    override fun onCreate() {
        super.onCreate()


    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerArcademyComponent.factory().create(this)
    }
}
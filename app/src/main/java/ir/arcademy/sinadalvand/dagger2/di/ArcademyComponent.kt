package ir.arcademy.sinadalvand.dagger2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import ir.arcademy.sinadalvand.dagger2.ArcademyApplication
import ir.arcademy.sinadalvand.dagger2.SafePref
import ir.arcademy.sinadalvand.dagger2.Zcript
import ir.arcademy.sinadalvand.dagger2.di.module.*
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ZcriptModule::class, ZsecureModule::class, TempModule1::class, TempModule2::class, ActivityModule::class])
interface ArcademyComponent : AndroidInjector<ArcademyApplication> {

    
    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): ArcademyComponent
    }
}
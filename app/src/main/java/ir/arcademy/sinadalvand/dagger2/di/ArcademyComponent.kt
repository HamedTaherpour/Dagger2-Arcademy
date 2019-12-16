package ir.arcademy.sinadalvand.dagger2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ir.arcademy.sinadalvand.dagger2.SafePref
import ir.arcademy.sinadalvand.dagger2.Zcript
import ir.arcademy.sinadalvand.dagger2.di.module.*
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [ZcriptModule::class, ZsecureModule::class,TempModule1::class,TempModule2::class])
interface ArcademyComponent {

    fun getActivityComponent(): ActivityComponent.Builder


    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): ArcademyComponent
    }
}
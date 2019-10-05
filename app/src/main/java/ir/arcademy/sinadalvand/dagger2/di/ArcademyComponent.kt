package ir.arcademy.sinadalvand.dagger2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ir.arcademy.sinadalvand.dagger2.MainActivity
import ir.arcademy.sinadalvand.dagger2.SafePref
import ir.arcademy.sinadalvand.dagger2.SecondActivity
import ir.arcademy.sinadalvand.dagger2.Zcript
import ir.arcademy.sinadalvand.dagger2.di.module.ApplicationModule
import javax.inject.Named

@Component(modules = [ApplicationModule::class])
interface ArcademyComponent {


    fun getZcript(): Zcript

    @Named("safepref1")
    fun getSafePref(): SafePref

    @Named("safepref2")
    fun getSafePref2(): SafePref


    fun mainActivityInject(actvity: MainActivity)


    fun secondActivityInject(activity:SecondActivity)


    @Component.Builder
    interface Builder {

        @BindsInstance
        fun setContext(context: Context): Builder

        fun build(): ArcademyComponent
    }
}
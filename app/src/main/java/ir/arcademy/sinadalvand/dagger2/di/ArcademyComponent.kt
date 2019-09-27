package ir.arcademy.sinadalvand.dagger2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ir.arcademy.sinadalvand.dagger2.SafePref
import ir.arcademy.sinadalvand.dagger2.Zcript
import ir.arcademy.sinadalvand.dagger2.di.module.ApplicationModule

@Component(modules = [ApplicationModule::class])
interface ArcademyComponent {


    fun getZcript(): Zcript

    fun getSafePref(): SafePref


    @Component.Builder
    interface Builder {

        @BindsInstance
        fun setContext(context: Context): Builder

        fun build(): ArcademyComponent
    }
}
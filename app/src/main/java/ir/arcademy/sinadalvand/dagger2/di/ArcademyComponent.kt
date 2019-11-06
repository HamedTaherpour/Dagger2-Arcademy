package ir.arcademy.sinadalvand.dagger2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ir.arcademy.sinadalvand.dagger2.SafePref
import ir.arcademy.sinadalvand.dagger2.Zcript
import ir.arcademy.sinadalvand.dagger2.di.module.SafePrefModule
import ir.arcademy.sinadalvand.dagger2.di.module.ZcriptModule
import ir.arcademy.sinadalvand.dagger2.di.module.ZsecureModule
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [ZcriptModule::class, ZsecureModule::class])
interface ArcademyComponent {

    @Named("Zcript1")
    fun getZcript(): Zcript

    fun getContext(): Context


    @Component.Builder
    interface Builder {

        @BindsInstance
        fun setContext(context: Context): Builder

        fun build(): ArcademyComponent
    }
}
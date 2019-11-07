package ir.arcademy.sinadalvand.dagger2.di

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import ir.arcademy.sinadalvand.dagger2.MainActivity
import ir.arcademy.sinadalvand.dagger2.SecondActivity
import ir.arcademy.sinadalvand.dagger2.di.module.SafePrefModule
import ir.arcademy.sinadalvand.dagger2.di.scope.ActivityScope

@ActivityScope
@Subcomponent(modules = [SafePrefModule::class])
interface ActivityComponent {


    fun mainActivityInject(actvity: MainActivity)


    fun secondActivityInject(activity: SecondActivity)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun getBlaBlaString(str: String): Builder

        fun build(): ActivityComponent

    }


}
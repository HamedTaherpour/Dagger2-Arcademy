package ir.arcademy.sinadalvand.dagger2.di

import dagger.Component
import ir.arcademy.sinadalvand.dagger2.MainActivity
import ir.arcademy.sinadalvand.dagger2.SecondActivity
import ir.arcademy.sinadalvand.dagger2.di.module.SafePrefModule

@Component(modules = [SafePrefModule::class])
interface ActivityComponent {


    fun mainActivityInject(actvity: MainActivity)


    fun secondActivityInject(activity: SecondActivity)
}
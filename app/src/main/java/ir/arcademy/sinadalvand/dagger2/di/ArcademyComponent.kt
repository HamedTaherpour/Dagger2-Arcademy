package ir.arcademy.sinadalvand.dagger2.di

import dagger.Component
import ir.arcademy.sinadalvand.dagger2.Zcript
import ir.arcademy.sinadalvand.dagger2.di.module.ApplicationModule

@Component(modules = [ApplicationModule::class])
interface ArcademyComponent {


    fun getZcript(): Zcript

}
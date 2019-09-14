package ir.arcademy.sinadalvand.dagger2.di

import dagger.Component
import ir.arcademy.sinadalvand.dagger2.Zcript

@Component
interface ArcademyComponent {


    fun getZcript():Zcript

}
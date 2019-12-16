package ir.arcademy.sinadalvand.dagger2.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.*
import ir.arcademy.sinadalvand.dagger2.Zsecure

@Module
class TempModule1 {

    @Provides
    @IntoMap
    @StringKey("zsc1")
    fun provideZsecure():Zsecure{
        val zsec2 = Zsecure()
        zsec2.Z_KEY = "8888"
        return zsec2
    }
}
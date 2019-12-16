package ir.arcademy.sinadalvand.dagger2.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey
import ir.arcademy.sinadalvand.dagger2.Zsecure

@Module
class TempModule2 {


    @Provides
    @IntoMap
    @StringKey("zsc2")
    fun provideZsecure(): Zsecure {
        val zsec = Zsecure()
        zsec.Z_KEY = "9999"
        return zsec
    }
}
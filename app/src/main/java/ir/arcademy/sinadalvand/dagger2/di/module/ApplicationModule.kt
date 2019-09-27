package ir.arcademy.sinadalvand.dagger2.di.module

import dagger.Module
import dagger.Provides
import ir.arcademy.sinadalvand.dagger2.Zsecure

@Module
class ApplicationModule {

    @Provides
    fun getZsecure():Zsecure{
        val zsecure = Zsecure()
        zsecure.Z_KEY = "5464"
        return zsecure
    }


}
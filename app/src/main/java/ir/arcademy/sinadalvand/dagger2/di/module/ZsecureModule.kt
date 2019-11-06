package ir.arcademy.sinadalvand.dagger2.di.module

import dagger.Module
import dagger.Provides
import ir.arcademy.sinadalvand.dagger2.Zsecure
import javax.inject.Named

@Module
class ZsecureModule {

    @Named("Zsecure1")
    @Provides
    fun getZsecure(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "5464"
        return zsecure
    }


    @Named("Zsecure2")
    @Provides
    fun getZsecure2(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "111111"
        return zsecure
    }
}
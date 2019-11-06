package ir.arcademy.sinadalvand.dagger2.di.module

import dagger.Module
import dagger.Provides
import ir.arcademy.sinadalvand.dagger2.Zcript
import ir.arcademy.sinadalvand.dagger2.Zsecure
import javax.inject.Named

@Module
class ZcriptModule {

    @Named("Zcript1")
    @Provides
    fun getZcript1(@Named("Zsecure1") zsecure: Zsecure): Zcript {
        val zcript = Zcript()
        zcript.ZsecureInject(zsecure)
        return zcript
    }


    @Named("Zcript2")
    @Provides
    fun getZcript2(@Named("Zsecure2") zsecure: Zsecure): Zcript {
        val Zcript = Zcript()
        Zcript.ZsecureInject(zsecure)
        return Zcript
    }

}
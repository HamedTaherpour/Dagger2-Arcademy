package ir.arcademy.sinadalvand.dagger2.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ir.arcademy.sinadalvand.dagger2.SafePref
import ir.arcademy.sinadalvand.dagger2.Zcript
import ir.arcademy.sinadalvand.dagger2.Zsecure
import ir.arcademy.sinadalvand.dagger2.di.qualifier.CustomZsecureName
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApplicationModule {

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


    @Singleton
    @Named("safepref1")
    @Provides
    fun getSafePref1(context: Context, @Named("Zcript1") zcript: Zcript): SafePref {
        return SafePref(context, zcript)
    }

    @Named("safepref2")
    @Provides
    fun getSafepref2(context: Context, @Named("Zcript2") zcript: Zcript): SafePref {
        return SafePref(context, zcript)
    }


}
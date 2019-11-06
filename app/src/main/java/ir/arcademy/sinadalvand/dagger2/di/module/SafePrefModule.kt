package ir.arcademy.sinadalvand.dagger2.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ir.arcademy.sinadalvand.dagger2.SafePref
import ir.arcademy.sinadalvand.dagger2.Zcript
import ir.arcademy.sinadalvand.dagger2.Zsecure
import ir.arcademy.sinadalvand.dagger2.di.qualifier.CustomZsecureName
import ir.arcademy.sinadalvand.dagger2.di.scope.ActivityScope
import javax.inject.Named
import javax.inject.Singleton

@Module
class SafePrefModule {

    @ActivityScope
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
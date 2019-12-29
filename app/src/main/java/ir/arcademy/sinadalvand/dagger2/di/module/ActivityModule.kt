package ir.arcademy.sinadalvand.dagger2.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ir.arcademy.sinadalvand.dagger2.MainActivity
import ir.arcademy.sinadalvand.dagger2.SecondActivity
import ir.arcademy.sinadalvand.dagger2.di.scope.ActivityScope

@Module
abstract class ActivityModule {


    @ActivityScope
    @ContributesAndroidInjector(modules = [SafePrefModule::class])
    abstract fun provideMainAcitivty(): MainActivity


    @ActivityScope
    @ContributesAndroidInjector(modules = [SafePrefModule::class])
    abstract fun provideSecondActivity(): SecondActivity


}
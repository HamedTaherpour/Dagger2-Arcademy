package ir.arcademy.sinadalvand.dagger2.di.module

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import ir.arcademy.sinadalvand.dagger2.di.keys.ViewModelKey
import ir.arcademy.sinadalvand.dagger2.viewmodels.MainActivityViewModel
import ir.arcademy.sinadalvand.dagger2.viewmodels.SecondActivityViewModel

@Module
abstract class ViewModelModule {


    @Binds
    @ViewModelKey(MainActivityViewModel::class)
    @IntoMap
    abstract fun provideMainViewModel(vm: MainActivityViewModel): ViewModel


    @Binds
    @ViewModelKey(SecondActivityViewModel::class)
    @IntoMap
    abstract fun provideSecondViewModel(vm: SecondActivityViewModel): ViewModel
}
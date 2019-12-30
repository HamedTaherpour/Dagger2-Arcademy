package ir.arcademy.sinadalvand.dagger2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.arcademy.sinadalvand.dagger2.viewmodels.MainActivityViewModel
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class ViewModelInjector @Inject constructor(val map:Map<Class<out ViewModel>,@JvmSuppressWildcards Provider<ViewModel>>) : ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return map[modelClass]!!.get() as T
    }
}
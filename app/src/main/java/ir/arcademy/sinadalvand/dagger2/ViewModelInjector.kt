package ir.arcademy.sinadalvand.dagger2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ir.arcademy.sinadalvand.dagger2.viewmodels.MainActivityViewModel

class ViewModelInjector(val vm: MainActivityViewModel) : ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return vm as T
    }
}
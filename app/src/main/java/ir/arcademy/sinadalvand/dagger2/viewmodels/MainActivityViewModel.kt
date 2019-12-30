package ir.arcademy.sinadalvand.dagger2.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import ir.arcademy.sinadalvand.dagger2.SafePref
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(val safepref:SafePref) : ViewModel() {

    init {
        Log.e("MainActivityViewModel","init")
    }

    fun printSafePref(){
        Log.e("MainActivityViewModel","Safepref: $safepref")
    }
}
package ir.arcademy.sinadalvand.dagger2.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SecondActivityViewModel @Inject constructor() : ViewModel() {

    init {
        Log.e("SecondActivityViewModel","init")
    }

    fun printSafePref(){
        Log.e("SecondActivityViewModel","Safepref")
    }
}
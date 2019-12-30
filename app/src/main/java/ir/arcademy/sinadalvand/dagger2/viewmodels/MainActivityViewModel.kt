package ir.arcademy.sinadalvand.dagger2.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import ir.arcademy.sinadalvand.dagger2.SafePref

class MainActivityViewModel(val safepref:SafePref) : ViewModel() {

    fun printSafePref(){
        Log.e("MainActivityViewModel","Safepref: $safepref")
    }
}
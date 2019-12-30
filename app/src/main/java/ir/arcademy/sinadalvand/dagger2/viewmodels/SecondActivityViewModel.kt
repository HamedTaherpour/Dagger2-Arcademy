package ir.arcademy.sinadalvand.dagger2.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel

class SecondActivityViewModel : ViewModel() {
    fun printSafePref(){
        Log.e("SecondActivityViewModel","Safepref")
    }
}
package ir.arcademy.sinadalvand.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject
import javax.inject.Named

class SecondActivity : AppCompatActivity() {

    @Inject
    @field:Named("safepref1")
    lateinit var autoSafePref: SafePref


    @Inject
    @field:Named("safepref1")
    lateinit var autoSafePref2: SafePref



    @Inject
    @field:Named("Zcript1")
    lateinit var zcript: Zcript


    override fun onCreate(savedInstanceState: Bundle?) {
//        (applicationContext as DaggerApplication).daggerComponent.secondActivityInject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        Log.e("SecondActivity","safepref1: $autoSafePref    safepref2: $autoSafePref2")

    }

}

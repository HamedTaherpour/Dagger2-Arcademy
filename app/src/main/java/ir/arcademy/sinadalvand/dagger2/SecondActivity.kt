package ir.arcademy.sinadalvand.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.arcademy.sinadalvand.dagger2.di.DaggerArcademyComponent
import javax.inject.Inject
import javax.inject.Named

class SecondActivity : AppCompatActivity() {

    @Inject
    @field:Named("safepref1")
    lateinit var autoSafePref: SafePref


    @Inject
    @field:Named("safepref1")
    lateinit var autoSafePref2: SafePref


    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as DaggerApplication).daggerComponent.secondActivityInject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        Log.e("SecondActivity","safepref1: $autoSafePref    safepref2: $autoSafePref2")

    }

}

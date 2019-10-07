package ir.arcademy.sinadalvand.dagger2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ir.arcademy.sinadalvand.dagger2.di.DaggerArcademyComponent
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Qualifier


class MainActivity : AppCompatActivity() {

    @Inject
    @field:Named("safepref1")
    lateinit var autoSafePref: SafePref


    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as DaggerApplication).daggerComponent.mainActivityInject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        autoSafePref.put("key", "Arcademy")


//        val safePref = component.getSafePref()
//
//        safePref.put("key", "arcademy")
//
//
//        val value = safePref.get("key", "")
//        Log.e("MainActivity", "Value is : ${value}")
//
//
//        val safePref2 = component.getSafePref2()
//        safePref2.put("key2", "arcademy2")


        button.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

    }
}

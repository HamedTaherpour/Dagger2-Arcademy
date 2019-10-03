package ir.arcademy.sinadalvand.dagger2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ir.arcademy.sinadalvand.dagger2.di.DaggerArcademyComponent
import java.util.*
import javax.inject.Qualifier


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerArcademyComponent.builder().setContext(baseContext).build()


        val safePref = component.getSafePref()

        safePref.put("key", "arcademy")


        val value = safePref.get("key", "")
        Log.e("MainActivity", "Value is : ${value}")



        val safePref2 = component.getSafePref2()
        safePref2.put("key2","arcademy2")

    }
}

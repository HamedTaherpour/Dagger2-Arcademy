package ir.arcademy.sinadalvand.dagger2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.HashMap
import java.util.HashSet
import javax.inject.Inject
import javax.inject.Named


class MainActivity : AppCompatActivity() {

    @Inject
    @field:Named("safepref1")
    lateinit var autoSafePref: SafePref


    @Inject
    @field:Named("safepref1")
    lateinit var autoSafePref2: SafePref


    @Inject
    @field:Named("Zcript1")
    lateinit var zcript: Zcript

    @Inject
    lateinit var zsecures :Map<String,Zsecure>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent = (applicationContext as DaggerApplication).daggerComponent.getActivityComponent()
        activityComponent.getBlaBlaString("sadasd").build().mainActivityInject(this)

        Log.e("MainActivity","safepref1: $autoSafePref    safepref2: $autoSafePref2    zcript: $zcript")



        button.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }


        for (i in zsecures){
            Log.e("App",i.key+":"+i.value.Z_KEY)
        }



    }
}

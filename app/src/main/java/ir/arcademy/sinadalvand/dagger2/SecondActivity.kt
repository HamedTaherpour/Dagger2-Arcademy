package ir.arcademy.sinadalvand.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.arcademy.sinadalvand.dagger2.di.DaggerArcademyComponent
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var safePref: SafePref


    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as DaggerApplication).daggerComponent.secondActivityInject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        safePref.put("blabla","Arcademy2")

    }

}

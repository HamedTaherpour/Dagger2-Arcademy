package ir.arcademy.sinadalvand.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.arcademy.sinadalvand.dagger2.di.DaggerArcademyComponent
import java.util.*


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zcript = DaggerArcademyComponent.create().getZcript()
        zcript.decrypt("")



    }
}

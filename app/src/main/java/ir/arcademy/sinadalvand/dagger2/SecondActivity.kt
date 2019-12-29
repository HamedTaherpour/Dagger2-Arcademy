package ir.arcademy.sinadalvand.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject
import javax.inject.Named

class SecondActivity : DaggerAppCompatActivity() {

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
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.e(
            "SecondActivity",
            "safepref1: $autoSafePref    safepref2: $autoSafePref2    zcript: $zcript"
        )

    }

}

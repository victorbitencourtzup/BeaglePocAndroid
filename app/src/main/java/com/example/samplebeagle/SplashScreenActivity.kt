package com.example.samplebeagle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import br.com.zup.beagle.android.preview.PreviewActivity
import br.com.zup.beagle.android.view.BeagleActivity
import br.com.zup.beagle.android.view.ScreenRequest
import com.example.samplebeagle.R

class SplashScreenActivity : AppCompatActivity(), Runnable{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aplash_screen)

       Handler().postDelayed(this, 2000)
    }

    override fun run() {
        val intent = BeagleActivity.newIntent(this, ScreenRequest("/app/samples"))
        //val intent = BeagleActivity.newIntent(this, ScreenRequest("/home"))
        startActivity(intent)
        finish()
    }
}


package com.ismailhakkiaydin.weather

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.palette.graphics.Palette
import com.ismailhakkiaydin.weather.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash)



    }

    override fun onResume() {

        var animCloud = AnimationUtils.loadAnimation(this, R.anim.amin_splash_cloud)
        var animSun = AnimationUtils.loadAnimation(this, R.anim.anim_splash_sun)

        dataBinding.imgSplashCloud.animation = animCloud
        dataBinding.imgSplashSun.animation = animSun

        object : CountDownTimer(3000, 200) {

            override fun onFinish() {
                var intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

            override fun onTick(millisUntilFinished: Long) {

            }
        }.start()
        super.onResume()
    }
}

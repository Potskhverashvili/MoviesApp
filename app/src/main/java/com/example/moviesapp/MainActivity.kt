package com.example.moviesapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().apply {
            //-- Keep Splash Screen --
            setKeepOnScreenCondition {
                !viewModel.isReady.value
            }
        }
        setContentView(R.layout.activity_main)
    }
}
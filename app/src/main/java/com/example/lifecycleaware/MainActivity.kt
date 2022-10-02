package com.example.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        lifecycle.addObserver(Observer())
        Log.d("Main", "onCreate: Activity")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Main", "onStart: Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main", "onResume: Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main", "onPause: Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main", "onStop: Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main", "onDestroy: Activity")
    }

}
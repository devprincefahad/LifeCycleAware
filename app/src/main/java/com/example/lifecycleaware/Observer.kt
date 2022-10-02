package com.example.lifecycleaware

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class Observer : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d("Main", "onCreate: Observer")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d("Main", "onStart: Observer")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("Main", "onResume: Observer")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("Main", "onPause: Observer")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d("Main", "onStop: Observer")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d("Main", "onDestroy: Observer")
    }

}
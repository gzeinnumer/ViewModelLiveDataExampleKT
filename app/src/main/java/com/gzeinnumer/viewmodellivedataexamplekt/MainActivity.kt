package com.gzeinnumer.viewmodellivedataexamplekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    // Use the 'by viewModels()' Kotlin property delegate
    // from the activity-ktx artifact
    private val model: MainVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model.currentName.value = "Hallo GZeinNumer"

        model.currentName.observe(this, Observer {
            Log.d(TAG, "onCreate: $it")
        })
    }
}
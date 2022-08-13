package com.vjchauhan.unittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.v("Activity----2","Create")

    }


    override fun onResume() {
        super.onResume()
        Log.v("Activity----2","Resume")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Activity----2","Stop")
    }

    override fun onStart() {
        super.onStart()
        Log.v("Activity----2","Start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("Activity----2","Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Activity----2","Destroy")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.v("Activity----2","BackPressed")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Activity----2","Pause")
    }

}
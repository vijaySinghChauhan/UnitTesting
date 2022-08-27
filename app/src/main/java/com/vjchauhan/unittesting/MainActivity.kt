package com.vjchauhan.unittesting

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.vjchauhan.unittesting.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
     var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.v("Activity----1","Create")

        binding.button.setOnClickListener {
            val frame = FrameLayout(this)

            if (savedInstanceState == null) {
             var mFragment = BlankFragment()
//                val ft: FragmentTransaction = fragmentManager.beginTransaction()
//                ft.add(frame.getId(), mFragment).commit()
            }

            setContentView(frame)

       //     startActivity(Intent(this,SecondActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        Log.v("Activity----1","Resume")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Activity----1","Stop")
    }

    override fun onStart() {
        super.onStart()
        Log.v("Activity----1","Start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("Activity1----","Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Activity----1","Destroy")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.v("Activity----1","BackPressed")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Activity----1","Pause")
    }

}
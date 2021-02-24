package com.www.roto.nav.rotonav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Build
import android.os.Handler
import android.view.WindowManager



@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   //     if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
     //       getWindow().getAttributes().layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
  //      }

    //    window.setFlags(
      //          WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //        WindowManager.LayoutParams.FLAG_FULLSCREEN
     //   )
        Handler().postDelayed({
            val intent = Intent(this, Authentication::class.java)
            startActivity(intent)
            finish()
        },1000)
    }

}



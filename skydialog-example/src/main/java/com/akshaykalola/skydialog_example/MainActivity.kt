package com.akshaykalola.skydialog_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.akshaykalola.skydialog.SkyDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialog = SkyDialog(this)

        dialog.show()

        Handler().postDelayed({
            dialog.dismiss()
        }, 5000)
    }
}

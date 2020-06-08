package com.akshaykalola.skydialog_example

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.akshaykalola.skydialog.SkyDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialog = SkyDialog(this)

        dialog.show()

        textView.setOnClickListener {
            dialog.show("Hello...")
            dialog.setCanceledOnTouchOutside(false)
        }

        Handler().postDelayed({
            dialog.dismiss()
        }, 5000)
    }
}

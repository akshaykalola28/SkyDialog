package com.akshaykalola.skydialog

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.dialog_progress.view.*

class SkyDialog(mContext: Context) {

    var view: View? = null
    var rootView: ViewGroup? = null
    var isShowing: Boolean = false

    init {
        rootView = ((mContext as Activity).window.decorView.rootView!! as ViewGroup)
        view = LayoutInflater.from(mContext)
            .inflate(R.layout.dialog_progress, rootView, false)

        view!!.mainLoadingView.setOnClickListener {
            //For disable outside views
        }
    }

    fun show(message: String = "Please Wait...") {
        rootView!!.removeView(view)
        view!!.messageTextView.text = message
        rootView!!.addView(view)
        isShowing = true
    }

    fun message(message: String) {
        if (isShowing) {
            view!!.messageTextView.text = message
        }
    }

    fun dismiss() {
        rootView!!.removeView(view)
        isShowing = false
    }
}
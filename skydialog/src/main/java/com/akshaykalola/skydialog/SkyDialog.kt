package com.akshaykalola.skydialog

import android.app.Activity
import android.content.Context
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.dialog_progress.view.*

class SkyDialog(mContext: Context) {

    private val builder = AlertDialog.Builder(mContext)
    private val alertDialog: AlertDialog
    private var dialogView: View? = null
    var isShowing: Boolean = false

    init {
        dialogView =
            (mContext as Activity).layoutInflater.inflate(R.layout.dialog_progress, null, false)
        builder.setView(dialogView)
        alertDialog = builder.create()
        alertDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
    }

    fun show(message: String = "Please Wait...") {
        alertDialog.dismiss()
        dialogView?.messageTextView?.text = message
        alertDialog.show()
        isShowing = true
    }

    fun setCanceledOnTouchOutside(cancel: Boolean) {
        alertDialog.setCanceledOnTouchOutside(cancel)
    }

    fun message(message: String) {
        if (isShowing) {
            dialogView?.messageTextView?.text = message
        }
    }

    fun dismiss() {
        alertDialog.dismiss()
        isShowing = false
    }
}
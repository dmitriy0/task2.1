package com.example.task21

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.util.Log.INFO
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import java.util.logging.Level.INFO

class MyAlertDialog: DialogFragment(){

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        Log.i("Message","dialog canceled")

        val builder = AlertDialog.Builder(requireActivity())
        builder.setTitle("Something message")
            .setMessage("abracadabra")
            .setPositiveButton("confirm") {
                    dialog, id ->  dialog.cancel()
            }
        return builder.create()
    }

    override fun onCancel(dialog: DialogInterface) {
        Log.i("Message","dialog canceled")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Message","dialog paused")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Message","dialog resumed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Message","dialog destroyed")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Message","dialog stopped")

    }
}
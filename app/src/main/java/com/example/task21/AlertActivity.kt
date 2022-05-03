package com.example.task21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class AlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
        Log.i("message", "Created")

        val button = findViewById<Button>(R.id.alert_dialog_button)

        button.setOnClickListener(View.OnClickListener {
            val myDialogFragment = MyAlertDialog()
            val manager = supportFragmentManager
            myDialogFragment.show(manager, "myDialog")
        })
    }

    override fun onStart() {
        super.onStart()
        Log.i("message", "Started")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("message", "Destroyed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("message", "Paused")
    }

    override fun onResume() {
        super.onResume()
        Log.i("message", "Resumed")
    }

    override fun onStop() {
        super.onStop()
        Log.i("message", "Stopped")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("message", "Restarted")
    }
}
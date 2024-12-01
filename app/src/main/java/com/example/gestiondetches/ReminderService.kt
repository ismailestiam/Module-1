package com.example.gestiondetches

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class ReminderService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val taskName = intent?.getStringExtra("task_name")
        taskName?.let {
            Toast.makeText(this, "Rappel : $taskName", Toast.LENGTH_LONG).show()
        }
        return START_STICKY
    }
}

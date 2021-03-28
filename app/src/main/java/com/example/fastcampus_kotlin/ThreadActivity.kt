package com.example.fastcampus_kotlin

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        val threadBtn = findViewById<Button>(R.id.threadBtn)

        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }
        }

        val thread: Thread = Thread(runnable)

        threadBtn.setOnClickListener {
            thread.start()
        }


        Thread(object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread2 is made")
            }
        }).start()

        Thread {
            Log.d("thread-1", "Thread3 is made")
            Thread.sleep(2000)
            // threadBtn.setBackgroundColor(getColor(R.color.black))  // ERROR - UI 관련 작업은 메인 쓰레드에서만 가능
            runOnUiThread {  // UI 작업은 이렇게! 메인쓰레드로!
                threadBtn.setBackgroundColor(getColor(R.color.black))
            }
        }.start()
    }
}
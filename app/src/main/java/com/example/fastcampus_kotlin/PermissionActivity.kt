package com.example.fastcampus_kotlin

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class PermissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        val permissionBtn = findViewById<Button>(R.id.ask)

        permissionBtn.setOnClickListener {
            val cameraPermissionCheck = ContextCompat.checkSelfPermission(
                this@PermissionActivity,
                android.Manifest.permission.CAMERA
            )
            if (cameraPermissionCheck != PackageManager.PERMISSION_GRANTED){
                // 권한이 없는 경우
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.CAMERA),
                    1000
                )
            } else {
                // 권한이 있는 경우
                Log.d("permission", "권한이 이미 있음")
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode == 1000) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // 승낙
               Log.d("permission", "승낙")
            } else {
                Log.d("permission", "거부")
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }
}
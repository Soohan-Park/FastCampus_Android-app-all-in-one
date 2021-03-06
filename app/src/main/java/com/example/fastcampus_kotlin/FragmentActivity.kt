package com.example.fastcampus_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.FragmentManager

class FragmentActivity : AppCompatActivity(), FragmentOne.onDataPassListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_cycle", "onCreate")

        val fragmentOne: FragmentOne = FragmentOne()
        // Fragment에 데이터를 넣어주는 방법
        val bundle: Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle

        var button: Button = findViewById(R.id.naogiBtn)
        button.setOnClickListener {
            // Fragment 동적으로 작동하는 방법
            // Fragment 붙이는 방법 replace/add
            val fragmentManager: FragmentManager = supportFragmentManager

            // Transaction (작업의 단위)
            // 시작과 끝이 있다!!
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()

            // 끝을 내는 방법
            // 1. commit    -> 시간될 때 해줘 (좀 더 안정적)
            // 2. commitNow -> 지금 당장 해
        }

        var button2: Button = findViewById(R.id.sarazigiBtn)
        button2.setOnClickListener {
            // Fragmemt remove/detach 방법
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()


        }
    }

    override fun onDataPass(data: String?) {
        Log.d("pass", data.toString())
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("life_cycle", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle", "onDestory")
    }
}
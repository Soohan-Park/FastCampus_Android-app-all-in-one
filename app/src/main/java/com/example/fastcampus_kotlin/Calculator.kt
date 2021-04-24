package com.example.fastcampus_kotlin

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Calculator : AppCompatActivity() {
    var calcCurNum: String = "0"
    var calcResNum: Int = 0


    // SET APP LIFE CYCLE
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("lifeCycle", "onCreating..")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        // GET VIEWS
        val calcCurr: TextView = findViewById(R.id.curr)
        val calcKeypadClear: TextView = findViewById(R.id.keypad_clear)
        val calcKeypadPlus: TextView = findViewById(R.id.keypad_plus)
        val calcKeypadOne: TextView = findViewById(R.id.keypad_one)
        val calcKeypadTwo: TextView = findViewById(R.id.keypad_two)
        val calcKeypadThree: TextView = findViewById(R.id.keypad_three)
        val calcKeypadFour: TextView = findViewById(R.id.keypad_four)
        val calcKeypadFive: TextView = findViewById(R.id.keypad_five)
        val calcKeypadSix: TextView = findViewById(R.id.keypad_six)
        val calcKeypadSeven: TextView = findViewById(R.id.keypad_seven)
        val calcKeypadEight: TextView = findViewById(R.id.keypad_eight)
        val calcKeypadNine: TextView = findViewById(R.id.keypad_nine)
        val calcKeypadZero: TextView = findViewById(R.id.keypad_zero)

        // func in func
        fun initCur() {
            calcCurNum = "0"
            calcResNum = 0
            calcCurr.setText("0")
        }

        fun summCur() {
            calcResNum += calcCurNum.toInt()
            calcCurNum = "0"

            calcCurr.setText(calcResNum.toString())
        }

        /////

        initCur()

        // SET LISTENERs
        val clickedNum = object : View.OnClickListener {
            override fun onClick(v: View?) {
                val targetNum = (v as TextView).text.toString()

                if (calcCurNum.equals("0")) calcCurNum = targetNum
                else calcCurNum += targetNum

                calcCurr.setText(calcCurNum)
            }
        }
        calcKeypadOne.setOnClickListener(clickedNum)
        calcKeypadTwo.setOnClickListener(clickedNum)
        calcKeypadThree.setOnClickListener(clickedNum)
        calcKeypadFour.setOnClickListener(clickedNum)
        calcKeypadFive.setOnClickListener(clickedNum)
        calcKeypadSix.setOnClickListener(clickedNum)
        calcKeypadSeven.setOnClickListener(clickedNum)
        calcKeypadEight.setOnClickListener(clickedNum)
        calcKeypadNine.setOnClickListener(clickedNum)
        calcKeypadZero.setOnClickListener(clickedNum)

        val clickedFunc = object : View.OnClickListener {
            override fun onClick(v: View?) {
                val targetFunc = (v as TextView).text.toString()

                if (targetFunc.equals("CA")) initCur()
                else if (targetFunc.equals("+")) summCur()
            }
        }
        calcKeypadClear.setOnClickListener(clickedFunc)
        calcKeypadPlus.setOnClickListener(clickedFunc)

    }


}
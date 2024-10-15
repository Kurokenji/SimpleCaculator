package com.example.caculatorview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
        lateinit var textReuslt: TextView
        var state: Int = 1
        var op: Int = 0
        var op1: Int = 0
        var op2: Int = 0

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            textReuslt = findViewById(R.id.textView1)
            findViewById<Button>(R.id.button0).setOnClickListener(this)
            findViewById<Button>(R.id.button1).setOnClickListener(this)
            findViewById<Button>(R.id.button2).setOnClickListener(this)
            findViewById<Button>(R.id.button3).setOnClickListener(this)
            findViewById<Button>(R.id.button4).setOnClickListener(this)
            findViewById<Button>(R.id.button5).setOnClickListener(this)
            findViewById<Button>(R.id.button6).setOnClickListener(this)
            findViewById<Button>(R.id.button7).setOnClickListener(this)
            findViewById<Button>(R.id.button8).setOnClickListener(this)
            findViewById<Button>(R.id.button9).setOnClickListener(this)
            findViewById<Button>(R.id.button11).setOnClickListener(this)
            findViewById<Button>(R.id.button12).setOnClickListener(this)
            findViewById<Button>(R.id.button13).setOnClickListener(this)
            findViewById<Button>(R.id.button14).setOnClickListener(this)
            findViewById<Button>(R.id.button15).setOnClickListener(this)
            findViewById<Button>(R.id.button21).setOnClickListener(this)
            findViewById<Button>(R.id.button22).setOnClickListener(this)
            findViewById<Button>(R.id.button23).setOnClickListener(this)
        }

        fun addDigit(c: Int) {
            if (state == 1) {
                op1 = op1 * 10 + c
                textReuslt.text = "$op1"
            } else {
                op2 = op2 * 10 + c
                textReuslt.text = "$op2"
            }
        }

        override fun onClick(p0: View?) {
            val id = p0?.id
            if (id == R.id.button0) {
                addDigit(0)
            } else if (id == R.id.button1) {
                addDigit(1)
            } else if (id == R.id.button2) {
                addDigit(2)
            } else if (id == R.id.button3) {
                addDigit(3)
            } else if (id == R.id.button4) {
                addDigit(4)
            } else if (id == R.id.button5) {
                addDigit(5)
            } else if (id == R.id.button6) {
                addDigit(6)
            } else if (id == R.id.button7) {
                addDigit(7)
            } else if (id == R.id.button8) {
                addDigit(8)
            } else if (id == R.id.button9) {
                addDigit(9)
            } else if (id == R.id.button21) { // C
                op1 = 0
                op2 = 0
                op = 0
                state = 1
                textReuslt.text = "0"
            } else if (id == R.id.button22) { //CE
                if (state == 1) {
                    op1 = 0
                    textReuslt.text = "$op1"
                } else {
                    op2 = 0
                    textReuslt.text = "$op2"
                }
            } else if (id == R.id.button23) { //backspace
                if (state == 1) {
                    op1 = op1/10
                    textReuslt.text = "$op1"
                } else {
                    op2 = op2/10
                    textReuslt.text = "$op2"
                }
            } else if (id == R.id.button11) { // cong
                op = 1
                state = 2
            } else if (id == R.id.button12) { // tru
                op = 2
                state = 2
            } else if (id == R.id.button13) { // nhan
                op = 3
                state = 2
            } else if (id == R.id.button14) { // chia
                op = 4
                state = 2
            } else if (id == R.id.button15) {
                var result = 0
                if (op == 1) {
                    result = op1 + op2
                }
                else if (op == 2) {
                    result = op1 - op2
                }
                else if (op == 3) {
                    result = op1 * op2
                }
                else if (op == 4) {
                    result = op1 / op2
                }
                textReuslt.text = "$result"
                op1 = 0
                op2 = 0
                op = 0
                state = 1
            }

        }
}
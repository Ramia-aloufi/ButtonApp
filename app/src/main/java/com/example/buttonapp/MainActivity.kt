package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            num += 1
            textView.text = "$num"
        }

        button2.setOnClickListener {
            num -= 1
            textView.text = "$num"
        }

        if(num > 0){
            textView.setTextColor(Color.GREEN)
        }else if(num < 0){
            textView.setTextColor(Color.RED)
        }else{
            textView.setTextColor(Color.BLACK)
        }
    }
}
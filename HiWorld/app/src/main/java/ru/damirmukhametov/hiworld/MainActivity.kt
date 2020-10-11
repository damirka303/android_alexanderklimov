package ru.damirmukhametov.hiworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View


class MainActivity : AppCompatActivity() {

    private lateinit var mHiTextView: TextView
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mHiTextView = findViewById(R.id.textView)
    }

     fun onClick(view: View){
        mHiTextView.setText("Hello Kitty!")
    }

    fun onClickListener(view: View){
        mHiTextView.text = "Я насчитал ${++counter}"
    }



}

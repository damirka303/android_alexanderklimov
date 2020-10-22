package ru.damirmukhametov.toastproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button)
        button.setOnClickListener{
            val text = "пора кормить кота"
            val buration = Toast.LENGTH_LONG

            val tost = Toast.makeText(applicationContext,text,buration).show()
        }
    }
}
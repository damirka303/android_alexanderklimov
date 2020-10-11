package ru.damirmukhametov.trafficlights

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        buttonRed.setOnClickListener {
            textView.text = resources.getText(R.string.btTextRed)
            root_layaut.setBackgroundColor(resources.getColor(R.color.colorRed))
        }
        buttonYellou.setOnClickListener {
            textView.text = resources.getText(R.string.btTextYellou)
            root_layaut.setBackgroundColor(resources.getColor(R.color.colorYellou))
        }
        buttonGreen.setOnClickListener {
            textView.text = resources.getText(R.string.btTextGreen)
            root_layaut.setBackgroundColor(resources.getColor(R.color.colorGreen))
        }*/
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.buttonRed -> {
                textView.text = resources.getText(R.string.btTextRed)
                root_layaut.setBackgroundColor(resources.getColor(R.color.colorRed))
            }
            R.id.buttonYellou -> {
                textView.text = resources.getText(R.string.btTextYellou)
                root_layaut.setBackgroundColor(resources.getColor(R.color.colorYellou))
            }
            R.id.buttonGreen -> {
                textView.text = resources.getText(R.string.btTextGreen)
                root_layaut.setBackgroundColor(resources.getColor(R.color.colorGreen))
            }
        }
    }


}
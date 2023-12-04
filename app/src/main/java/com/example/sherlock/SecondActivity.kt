package com.example.sherlock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup

const val THIEF = "ru.alexanderklimov.sherlock.THIEF"

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        val radioGroup : RadioGroup = findViewById(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { _, optionId ->
            val answerIntent = Intent()
            when (optionId) {
                R.id.radio_dog -> answerIntent.putExtra(THIEF, "Пёсик")
                R.id.radio_crow -> answerIntent.putExtra(THIEF, "Ворона")
                R.id.radio_cat -> answerIntent.putExtra(THIEF, "Лошадь Пржевальского")
            }

            setResult(RESULT_OK, answerIntent)
            finish()
        }
    }
}
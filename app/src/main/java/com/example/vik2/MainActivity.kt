package com.example.vik2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Переменные для обращения ко всем элементам интерфейса
        val divideButton: Button = findViewById(R.id.button2)
        val addButton: Button = findViewById(R.id.button)
        val editText1: EditText = findViewById(R.id.editTextNumber)
        val editText2: EditText = findViewById(R.id.editTextNumber2)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        // Обработчик нажатия на кнопку "Сложить"
        addButton.setOnClickListener {
            val num1 = editText1.text.toString().toDoubleOrNull()
            val num2 = editText2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val result = num1 + num2
                resultTextView.text = "Результат сложения: $result"
            } else {
                resultTextView.text = "Введите корректные числа"
            }
        }

        // Обработчик нажатия на кнопку "Разделить"
        divideButton.setOnClickListener {
            val num1 = editText1.text.toString().toDoubleOrNull()
            val num2 = editText2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    resultTextView.text = "Результат деления: $result"
                } else {
                    resultTextView.text = "Деление на ноль невозможно"
                }
            } else {
                resultTextView.text = "Введите корректные числа"
            }
        }


    }
}

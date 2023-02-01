package com.example.clase03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

private const val TAG = "NOTIFICACION"

class MainActivity : AppCompatActivity() {

    private lateinit var txtNumber1: EditText
    private lateinit var txtNumber2: EditText
    private lateinit var button2: Button
    private lateinit var resultado: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Ha sido llamado el metodo onCreate")

        txtNumber1 = findViewById(R.id.txtNumber1)
        txtNumber2 = findViewById(R.id.txtNumber2)
        button2 = findViewById(R.id.button2)
        resultado = findViewById(R.id.resultado)

        button2.setOnClickListener {
            this.sumar(txtNumber1.text.toString().trim(), txtNumber2.text.toString().trim())
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Ha sido llamado el metodo onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Ha sido llamado el metodo onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Ha sido llamado el metodo onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Ha sido llamado el metodo onStop")
    }

    //crtl alt L es para prettier
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Ha sido llamado el metodo onDesroy")
    }

    fun sumar(num1: String, num2: String) {
        var producto: Int
        if (num1.toString().isEmpty() || num2.toString().isEmpty()) {
            Toast.makeText(this, "Debe completar los datos", Toast.LENGTH_SHORT).show()
        } else {
            producto = Integer.parseInt(num1) + Integer.parseInt(num2)
            Toast.makeText(
                this,
                "El resultado de ${num1}+${num2} = ${producto}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
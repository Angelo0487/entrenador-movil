package com.example.angelo_guzman_2026_04_11

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Log de advertencia al abrir la app
        Log.w("APP_INICIO", "La aplicación ha sido iniciada")

        val deporte = findViewById<EditText>(R.id.etDeporte)
        val tiempo = findViewById<EditText>(R.id.etTiempo)
        val boton = findViewById<Button>(R.id.btnEntrenar)

        boton.setOnClickListener {
            val deporteTexto = deporte.text.toString().trim()
            val tiempoTexto = tiempo.text.toString().trim()

            // Validación de campos vacíos
            if (deporteTexto.isEmpty() || tiempoTexto.isEmpty()) {
                Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            val mensaje = "Entrenamiento: $deporteTexto por $tiempoTexto minutos"

            // Mostrar alerta (Toast)
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

            // Mostrar en Logcat
            Log.i("ENTRENAMIENTO", mensaje)
        }
    }
}
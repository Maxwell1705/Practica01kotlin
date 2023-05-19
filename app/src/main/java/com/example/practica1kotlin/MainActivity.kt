package com.example.practica1kotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnSaludar: Button
    private lateinit var txtNombre: EditText
    private lateinit var lblSaludar: TextView
    private lateinit var btnLimpiar: Button
    private lateinit var btnSalir: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // relacionar los objetos
        btnSaludar = findViewById(R.id.btnSaludo)
        txtNombre = findViewById(R.id.txtSaludo2)
        lblSaludar = findViewById(R.id.lblSaludo)
        btnLimpiar = findViewById(R.id.btnLimpio)
        btnSalir = findViewById(R.id.btnSal)

        // Presionar botón Saludar
        btnSaludar.setOnClickListener {
            if (txtNombre.text.toString().isEmpty()) {
                Toast.makeText(this, "Escriba un nombre", Toast.LENGTH_SHORT).show()
            } else {
                val str = "Hola ${txtNombre.text.toString()} ¿cómo estás?"
                lblSaludar.text = str
            }
        }

        // Presionar botón Limpiar
        btnLimpiar.setOnClickListener {
            lblSaludar.text = ""
        }

        // Presionar botón Salir
        btnSalir.setOnClickListener {
            finish()
            System.exit(0)
        }

    }
}
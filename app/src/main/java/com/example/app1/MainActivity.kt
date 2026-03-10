package com.example.app1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listCarreras)

        val carreras = arrayOf(
            "Ingeniería",
            "Medicina",
            "Derecho",
            "Arquitectura",
            "Administración"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            carreras
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val carrera = carreras[position]

            Toast.makeText(
                this,
                "Seleccionaste: $carrera",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
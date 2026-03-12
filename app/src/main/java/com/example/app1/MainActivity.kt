package com.example.app1

import android.os.Bundle
import android.view.Gravity
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

        val adapter = object : ArrayAdapter<String>(
            this,
            R.layout.item_carrera,
            R.id.txtCarrera,
            carreras
        ) {}

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->

            val carrera = carreras[position]

            val toast = Toast.makeText(
                this,
                "Seleccionaste: $carrera",
                Toast.LENGTH_SHORT
            )

            toast.setGravity(Gravity.TOP, 0, 150)
            toast.show()
        }
    }
}
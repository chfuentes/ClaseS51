package com.cfuentes.clases51

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var botonSaludo : Button
    lateinit var textoSaludo : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textoSaludo = findViewById(R.id.et_Saludo)
        botonSaludo = findViewById(R.id.bt_Saludo)
        botonSaludo.setOnClickListener {
            saludar()
        }
    }

    override fun onResume() {
        super.onResume()
        textoSaludo.setText("")
    }

    private fun saludar() {
        val miSaludo = textoSaludo.text.toString().trim()
        //Toast.makeText(this,"Hola $miSaludo",Toast.LENGTH_SHORT).show()
        val i = Intent(this,SaludoActivity::class.java)
        i.putExtra("msjSaludo",miSaludo)
        startActivity(i)
    }
}
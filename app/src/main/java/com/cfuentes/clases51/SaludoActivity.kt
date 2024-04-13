package com.cfuentes.clases51

import android.graphics.Color
import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SaludoActivity : AppCompatActivity() {
    lateinit var textoSaludo : TextView
    lateinit var botonVolver : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        var recibeSaludo = intent.extras?.getString("msjSaludo")?:"NADA"
        if (TextUtils.isEmpty(recibeSaludo)) {
            recibeSaludo = "EL usuario no ingreso un saludo"
        }
        textoSaludo = findViewById(R.id.tv_Saludo)
        textoSaludo.text = recibeSaludo
        textoSaludo.setTextColor(Color.GREEN)
        textoSaludo.gravity = Gravity.LEFT
        textoSaludo.setTextSize(30F)
        botonVolver = findViewById(R.id.bt_Volver)
        botonVolver.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        //Toast.makeText(this,"$recibeSaludo",Toast.LENGTH_SHORT).show()
    }
}
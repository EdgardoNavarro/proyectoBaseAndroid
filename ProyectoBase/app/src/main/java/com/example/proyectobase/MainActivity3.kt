package com.example.proyectobase

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase.funciones.OpMatematicas

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val edETNumber1:EditText=findViewById(R.id.ETNumber1)
        val edETNumber2:EditText=findViewById(R.id.ETNumber2)
        val ETResultado: TextView=findViewById(R.id.ETResultado)
        val btn_calcular:Button=findViewById(R.id.btnCalcular)


        btn_calcular.setOnClickListener{
            var numeroUno:Int = edETNumber1.text.toString().toIntOrNull()?:0
            var numeroDos:Int = edETNumber2.text.toString().toIntOrNull()?:0

            ETResultado.text= OpMatematicas.dividirValores(numeroUno, numeroDos)
        }






        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
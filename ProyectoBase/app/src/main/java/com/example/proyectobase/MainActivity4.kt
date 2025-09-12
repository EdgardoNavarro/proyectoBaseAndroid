package com.example.proyectobase

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase.funciones.OpMatematicas

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)


        //val valor1: EditText = findViewById(R.id.et_number1)
        //val valor2: EditText = findViewById(R.id.et_number2)
        //val txResultado: TextView = findViewById(R.id.et_resultado)
        val btn_2 : Button= findViewById(R.id.btn_2)
        val spOperaciones:Spinner=findViewById(R.id.sp_mat)
        val list_ser:ListView=findViewById(R.id.lista_series)
        val btn_3 : Button= findViewById(R.id.btn_3)

        val opcionesSpinner= arrayOf(
            "Sumar"
            , "Restar"
            , "Multiplicar"
            , "Hola Mundo"
            , "Dividir"
        )
        //adaptador de array


        val adaptador = ArrayAdapter( this //contexto
        , android.R.layout.simple_list_item_1 //elementos listview
        , opcionesSpinner )

        spOperaciones.adapter=adaptador

        val opcionesListView = arrayOf(
            "opcion 1"
            , "opcion 2"
            , "opcion 3"

        )

        val adaptador_list = ArrayAdapter(this, android.R.layout.simple_list_item_1
        , opcionesListView)
        btn_2.setOnClickListener{
            var str_op_selected = spOperaciones.selectedItem.toString()
            val toast = Toast.makeText(this, str_op_selected
                ,
                 Toast.LENGTH_SHORT)
            toast.show()
        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
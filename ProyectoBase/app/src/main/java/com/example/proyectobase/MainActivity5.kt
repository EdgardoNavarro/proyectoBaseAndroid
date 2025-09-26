package com.example.proyectobase

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase.ApiRegiones.CargarRegionComunaAPI

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)

        val spnRegion: Spinner = findViewById(R.id.spn_regiones)
        val spnComuna: Spinner = findViewById(R.id.spn_comunas)
        val btnHacerAlgo: Button = findViewById(R.id.btn_hacer_algo)

        CargarRegionComunaAPI.cargarRegionComuna(this, spnRegion)
        CargarRegionComunaAPI.cargarRegionComuna2(this,spnComuna)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
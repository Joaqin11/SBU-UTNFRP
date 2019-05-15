package com.pruebas.joqin11.sbu_utnfrp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        getMenuInflater().inflate(R.menu.menuapp, menu)
        return true
    }

    override fun onCreateItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.asistencia_docente -> {
                Toast.makeText(this, "Asistencia Docente", Toast.LENGTH_SHORT).show()
                return true
            }
        }
    }
}

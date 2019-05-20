package com.pruebas.joqin11.sbu_utnfrp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {

    private val urlInicio: String = "http://www.frp.utn.edu.ar/info2/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview_Noticias.settings.javaScriptEnabled = true

        webview_Noticias.webViewClient = object : WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {
                webview_Noticias.loadUrl("javascript:(function(){" +
                    "document.getElementsByClassName('td_uid_4_5cdcc451cbd3f')[0].style.display = none; " +
                        "})()")
                //super.onPageFinished(view, url)
            }
        }
        webview_Noticias.loadUrl(urlInicio)
        

    }

    override fun onBackPressed() {
        if(webview_Noticias.canGoBack()){
            webview_Noticias.goBack()
        }
        else
        {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        getMenuInflater().inflate(R.menu.menuapp, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.asistencia_docente -> {
                Toast.makeText(this, "Asistencia Docente", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.becas -> {
                Toast.makeText(this, "Becas", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.calendario_academico -> {
                Toast.makeText(this, "Calendario Academico", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.cursos -> {
                Toast.makeText(this, "Cursos", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.estado_academico -> {
                Toast.makeText(this, "Estado Academico", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.formularios -> {
                Toast.makeText(this, "Formularios", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.login -> {
                Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.ofertas_academicas -> {
                Toast.makeText(this, "Ofertas Academicas", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.pasantia_ofertas_laborales -> {
                Toast.makeText(this, "Pasantias y Ofertas Laborales", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.reglamento_de_estudios -> {
                Toast.makeText(this, "Reglamento de Estudios", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}

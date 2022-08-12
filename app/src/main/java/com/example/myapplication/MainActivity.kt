package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun acessarRecuperacaoFotos(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }

    fun utilizandoMaps(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }

    fun localizacaoLocationApi(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }

    fun rotas(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }

    fun pontosInteressantes(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }

    fun usandoWebview(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }

    fun audioManager(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }

    fun videoMediaPlayer(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }

    fun acessarAnimacao(view: View) {
        val intent = Intent(this, RecuperacaoFotosActivity::class.java)
        startActivity(intent)
    }
}
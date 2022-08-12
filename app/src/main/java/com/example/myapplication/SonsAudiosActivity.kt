package com.example.myapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SonsAudiosActivity : AppCompatActivity() {
    var cow: MediaPlayer? = null
    var dog: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sons_audios)

        // criação dos audio
        cow = MediaPlayer.create(this, R.raw.cow)
        dog = MediaPlayer.create(this, R.raw.dog)
    }
    // função que inicia o audio vaca
    fun soundCow(view: View) {
        cow!!.start()
    }
    // função que inicia o audio cachorro
    fun soundDog(view: View) {
        dog!!.start()
    }
}
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
        cow = MediaPlayer.create(this, R.raw.cow)
        dog = MediaPlayer.create(this, R.raw.dog)
    }
    fun soundCow(view: View) {
        cow!!.start()
    }
    fun soundDog(view: View) {
        dog!!.start()
    }
}
package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController

class VideoMediaPlayerActivity : AppCompatActivity() {
    private var uri: Uri? = null
    private var isContinuously = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_media_player)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(vv)
        val uriPath = ""
        uri = Uri.parse(uriPath)
        vv!!.setOnCompletetionListener {
            if (isContinuously) {
                vv!!.start()
            }
        }
        btnstop!!.setOnClickListener { vv!!.pause() }
        btnplay!!.setOnClickListener { vv!!.start() }
        btnonce!!.setOnClickListener {
            isContinuously = false
            progress!!.visibility = View.VISIBLE
            vv!!.setMediaController(mediaController)
            vv!!.setVideoURI(uri)
            vv!!.requestFocus()
            vv!!.start()
        }
        btnconti!!.setOnClickListener {
            isContinuously = true
            progress!!.visibility = View.VISIBLE
            vv!!.setMediaController(mediaController)
            vv!!.setVideoURI(uri)
            vv!!.requestFocus()
            vv!!.start()
        }
        vv!!.setOnPreparedListener { progress!!.visibility = View.GONE }

    }
}
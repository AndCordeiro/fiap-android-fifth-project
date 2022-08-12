package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_recuperacao_fotos.*

class RecuperacaoFotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperacao_fotos)

        val equipes = arrayOf("Leão", "Pinguin", "Urso", "Girafa", "Tigre", "Rato")

        textView1.text = equipes[0]
        textView2.text = equipes[1]
        textView3.text = equipes[2]
        textView4.text = equipes[3]
        textView5.text = equipes[4]
        textView6.text = equipes[5]

        val i1 = ""
        val i2 = ""
        val i3 = ""
        val i4 = ""
        val i5 = ""
        val i6 = ""

        Glide.with(this).load(i1).into(imageView1!!)
        Glide.with(this).load(i2).into(imageView2!!)
        Glide.with(this).load(i3).into(imageView3!!)
        Glide.with(this).load(i4).into(imageView4!!)
        Glide.with(this).load(i5).into(imageView5!!)
        Glide.with(this).load(i6).into(imageView6!!)
    }
}
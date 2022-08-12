package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_recuperacao_fotos.*

class RecuperacaoFotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperacao_fotos)

        // nomes dos animais
        val equipes = arrayOf("Leão", "Pinguin", "Urso", "Girafa", "Tigre", "Rato")

        // set dos nomes no textview
        textView1.text = equipes[0]
        textView2.text = equipes[1]
        textView3.text = equipes[2]
        textView4.text = equipes[3]
        textView5.text = equipes[4]
        textView6.text = equipes[5]

        // Link das imagens
        val i1 = "https://static.todamateria.com.br/upload/le/ao/leaojuba-cke.jpg"
        val i2 = "https://upload.wikimedia.org/wikipedia/commons/3/3b/Humboldt-Pinguin.jpg"
        val i3 = "https://veja.abril.com.br/wp-content/uploads/2019/05/mundo-urso-pardo-20181227-002-copy-1.jpg"
        val i4 = "https://www.hypeness.com.br/1/2020/11/00e0a6b2-647.jpg"
        val i5 = "https://www.worldanimalprotection.org.br/sites/default/files/styles/600x400/public/media/1008357-flip.jpg?h=35582878&itok=YspoJbqd"
        val i6 = "https://classic.exame.com/wp-content/uploads/2016/09/size_960_16_9_rato1.jpg?quality=70&strip=info&w=960"

        // recuperação das imagens
        Glide.with(this).load(i1).into(imageView1!!)
        Glide.with(this).load(i2).into(imageView2!!)
        Glide.with(this).load(i3).into(imageView3!!)
        Glide.with(this).load(i4).into(imageView4!!)
        Glide.with(this).load(i5).into(imageView5!!)
        Glide.with(this).load(i6).into(imageView6!!)
    }
}
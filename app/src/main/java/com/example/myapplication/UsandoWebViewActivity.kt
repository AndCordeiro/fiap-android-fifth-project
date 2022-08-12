package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recuperacao_fotos.*
import kotlinx.android.synthetic.main.activity_usando_web_view.*

class UsandoWebViewActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usando_web_view)

        // tratamento do webview
        webview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                url: String?
            ): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }

        // ativando js
        webview!!.settings.javaScriptEnabled = true
        // site a abrir no webview
        webview!!.loadUrl("https://www.fiap.com.br")
    }
}
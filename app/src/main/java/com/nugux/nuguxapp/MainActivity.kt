package com.nugux.nuguxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    lateinit var webview:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webview = findViewById<WebView>(R.id.webview)
        webview.settings.javaScriptEnabled = true
        webview.loadUrl(getString(R.string.server))
    }
}
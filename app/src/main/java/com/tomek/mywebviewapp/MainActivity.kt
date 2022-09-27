package com.tomek.mywebviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webview)

        webView.webViewClient = MainWebViewClient()

        // OPTIONS That you can uncomment
        //webView.settings.javaScriptEnabled = true
        //webView.settings.allowFileAccess = true
        //webView.settings.allowContentAccess = true

        val extraHeaders = mapOf("Authorization" to "Bearer zzzzzEnterYourTokenHerezzzz")
        webView.loadUrl("https://fairtiq.com", extraHeaders)

    }
}

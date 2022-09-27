package com.tomek.mywebviewapp

import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MainWebViewClient: WebViewClient() {

    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
        view?.loadUrl(request?.url.toString())
        return true
    }
}

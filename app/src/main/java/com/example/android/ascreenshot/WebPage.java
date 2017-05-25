package com.example.android.ascreenshot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebPage extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        Intent intent = getIntent();
        String data = intent.getStringExtra("www");
        WebView webView = (WebView)findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        // 当网页跳转时，令目标网页仍然在当前 WebView 中显示
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://" + data);
    }
}

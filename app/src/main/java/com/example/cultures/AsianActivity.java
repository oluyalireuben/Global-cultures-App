package com.example.cultures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class AsianActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asian);

        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.youtube.com/results?search_query=Asian+culture+and+traditions");
    }
}
package com.example.webviewcontrol;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        WebView mywebview = findViewById(R.id.webView);

        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.getSettings().setDomStorageEnabled(true);

        mywebview.setWebViewClient(new WebViewClient());

        mywebview.loadUrl("https://vardhaman.org/");
    }
}

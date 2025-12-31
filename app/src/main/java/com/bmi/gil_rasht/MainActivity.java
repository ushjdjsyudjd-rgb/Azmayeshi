package com.bmi.gil_rasht;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(this);
        setContentView(myWebView);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true); // فعال سازی جاوااسکریپت برای چت و فرم
        webSettings.setDomStorageEnabled(true); // برای ذخیره پیام‌های چت در حافظه
        webSettings.setBuiltInZoomControls(false); // غیرفعال کردن زوم دستی
        webSettings.setDisplayZoomControls(false);

        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("file:///android_asset/index.html");
    }
}

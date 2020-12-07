package com.example.exchangestudentapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;

public class traductor extends AppCompatActivity {

    private WebView viewTraductor;
    private String url= "https://translate.google.com/";
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traductor);
        back = findViewById(R.id.backButtonTraductor);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(traductor.this, MainActivity.class);
                startActivity(i);
            }
        });

        viewTraductor = (WebView) findViewById(R.id.webID);
        final WebSettings configWebView = viewTraductor.getSettings();
        configWebView.setJavaScriptEnabled(true);
        viewTraductor.loadUrl(url);
    }
}
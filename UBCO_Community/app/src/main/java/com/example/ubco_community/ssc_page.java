package com.example.ubco_community;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ssc_page extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssc_page);

         wv = (WebView)findViewById(R.id.sscPageView);
          wv.loadUrl("https://ssc.adm.ubc.ca/sscportal/servlets/SSCMain.jsp?function=PersonalProfile");
    }
}
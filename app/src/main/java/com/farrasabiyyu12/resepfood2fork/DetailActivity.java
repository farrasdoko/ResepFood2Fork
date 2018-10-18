package com.farrasabiyyu12.resepfood2fork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.webUrl)
    WebView webUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        String WEB_URL = getIntent().getStringExtra("WEB_URL");
        webUrl.loadUrl(WEB_URL);
        webUrl.getSettings().setJavaScriptEnabled(true);
        webUrl.setWebViewClient(new WebViewClient());
    }
}

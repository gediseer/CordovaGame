/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package io.cordova.hellocordova;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends Activity {
    private ItemListJavaScriptHandler itemListJavaScriptHandler = null;
    WebView mWebView;
    private Intent intent = new Intent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

      /*  InputStream fis;

        try {
            fis = this.getResources().getAssets().open("/www/sound/menu.mp3");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
       /* WebView wv = (WebView) findViewById(R.id.wv);
        wv.setWebViewClient(new WebViewClient());


        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setSupportZoom(true);
        wv.getSettings().setDomStorageEnabled(true);
        wv.requestFocus();
        wv.getSettings().setUseWideViewPort(true);
        wv.getSettings().setLoadWithOverviewMode(true);
        wv.getSettings().setSupportZoom(true);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.getSettings().setAllowFileAccess(true);
        wv.getSettings().setDomStorageEnabled(true);
        // wv.loadUrl("file:///android_asset/h5/play.html");
        //  wv.loadUrl("file:///android_asset/www/index4.html");//水果忍者
        //   wv.loadUrl("file:///android_asset/xiaopingguo/index.html");//小苹果
        // wv.loadUrl("file:///android_asset/sg/index.html");//fb
      */
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }

        // Set by <content src="index.html" /> in config.xml

        //loadUrl("file:///android_asset/flapBird/index.html");
    }

    public void flapBird(View view) {
        intent.setClass(MainActivity.this, GameActivity.class);
        intent.putExtra("src", "file:///android_asset/flapBird/index.html");
        startActivity(intent);
    }

    public void happyFishing(View view) {
        intent.setClass(MainActivity.this, GameActivity.class);
        intent.putExtra("src", "file:///android_asset/happyFishing/index.html");
        startActivity(intent);
    }

    public void russiaCube(View view) {
        intent.setClass(MainActivity.this, GameActivity.class);
        intent.putExtra("src", "file:///android_asset/russiaCube/index.html");
        startActivity(intent);
    }

    public void tableBall(View view) {
        intent.setClass(MainActivity.this, GameActivity.class);
        intent.putExtra("src", "file:///android_asset/tableBall/index.html");
        startActivity(intent);
    }

    public void sgrz(View view) {

      intent.setClass(MainActivity.this, GameActivity.class);
        intent.putExtra("src", "file:///android_asset/sg/index.html");
        startActivity(intent);
    }

    public void two(View view) {
        intent.setClass(MainActivity.this, GameActivity.class);
        intent.putExtra("src", "file:///android_asset/two/index.htm");
        startActivity(intent);
    }
    public void wuziqi(View view) {
        intent.setClass(MainActivity.this, GameActivityLandscope.class);
        intent.putExtra("src", "file:///android_asset/wuziqi/index.html");
        startActivity(intent);
    }
/*
    public void init() {
        mWebView = (WebView) findViewById(R.id.wv);
        mWebView.getSettings().setJavaScriptEnabled(true);
        //mWebView.addJavascriptInterface(new InJavaScriptLocalObj(), "local_obj");

        mWebView.getSettings().setSupportZoom(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setPluginState(WebSettings.PluginState.ON);
        mWebView.requestFocus();
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.getSettings().setLoadWithOverviewMode(true);
        mWebView.getSettings().setSupportZoom(true);
        mWebView.getSettings().setBuiltInZoomControls(true);

        mWebView.addJavascriptInterface(itemListJavaScriptHandler, "temp");
        //mWebView.loadUrl ("file:///android_asset/res/lesson.html"); //("http://www.baidu.com");
        mWebView.loadUrl("file:///android_asset/res/lesson.html");

        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                view.loadUrl("javascript:window.local_obj.showSource('<head>'+"
                        + "document.getElementsByTagName('html')[0].innerHTML+'</head>');");

            }

            @Override
            public void onReceivedError(WebView view, int errorCode,
                                        String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
            }

        });
    }*/
}

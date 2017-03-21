package io.cordova.hellocordova;

import android.content.Intent;
import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

/**
 * Created by mao on 17-3-15.
 */
public class GameActivity extends CordovaActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        Intent i = getIntent();
        String src = i.getStringExtra("src");
        l.i("src" + src);
        loadUrl(src);
    }
}

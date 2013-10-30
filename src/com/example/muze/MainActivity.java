package com.example.muze;

import android.os.Bundle;
import org.apache.cordova.DroidGap;


public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
		//super.setIntegerProperty("splashscreen", R.drawable.ic_launcher);  
        super.onCreate(savedInstanceState);
		
       // setContentView(R.layout.activity_main);
	  // super.loadUrl("file:///android_asset/www/index.html");
        super.loadUrl("file:///android_asset/www/index.html");
		
    }

    
}

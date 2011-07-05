package com.jquerymobiledocs;

import android.os.Bundle;
import com.phonegap.*;

public class Documentation extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/jquerymobile.com/demos/1.0b1/index.html");
    }
}
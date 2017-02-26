package com.gui.abc.volleytest;

import android.app.Application;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by guizhongyun on 17/2/26.
 */

public class MyApplication extends Application {
    private static RequestQueue requestQueue;

    @Override
    public void onCreate(){
        super.onCreate();
        requestQueue = Volley.newRequestQueue(getApplicationContext());
    }

    public static RequestQueue getRequestQueue(){
        return requestQueue;
    }
}

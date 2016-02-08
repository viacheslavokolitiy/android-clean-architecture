package org.satorysoft.androidcleanarchitecture.sample;

import android.app.Application;

/**
 * Created by vokol on 08.02.2016.
 */
public class App extends Application {
    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static App getInstance() {
        return instance;
    }
}

package org.satorysoft.androidcleanarchitecture.sample.util;

import android.content.Context;
import android.content.SharedPreferences;

import org.satorysoft.androidcleanarchitecture.sample.di.component.DaggerSharedPreferencesComponent;
import org.satorysoft.androidcleanarchitecture.sample.di.module.SharedPreferencesModule;

import javax.inject.Inject;

/**
 * Created by viacheslavokolitiy on 07.02.2016.
 */
public class AuthenticationChecker {
    private final Context context;

    @Inject
    protected SharedPreferences preferences;

    public AuthenticationChecker(Context context){
        this.context = context;
        DaggerSharedPreferencesComponent.builder()
                .sharedPreferencesModule(new SharedPreferencesModule(context))
                .build()
                .inject(this);
    }

    public boolean isUserExists(){
        return preferences.getBoolean(Constants.TOKEN, false);
    }
}

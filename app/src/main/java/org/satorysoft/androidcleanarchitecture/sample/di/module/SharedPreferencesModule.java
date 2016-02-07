package org.satorysoft.androidcleanarchitecture.sample.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by viacheslavokolitiy on 07.02.2016.
 */
@Module
public class SharedPreferencesModule {
    private final Context context;

    public SharedPreferencesModule(@NonNull Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public SharedPreferences provideSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}

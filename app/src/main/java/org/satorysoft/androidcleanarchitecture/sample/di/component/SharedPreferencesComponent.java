package org.satorysoft.androidcleanarchitecture.sample.di.component;

import org.satorysoft.androidcleanarchitecture.sample.di.module.SharedPreferencesModule;
import org.satorysoft.androidcleanarchitecture.sample.util.AuthenticationChecker;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by viacheslavokolitiy on 07.02.2016.
 */
@Component(modules = {SharedPreferencesModule.class})
@Singleton
public interface SharedPreferencesComponent {
    void inject(AuthenticationChecker checker);
}

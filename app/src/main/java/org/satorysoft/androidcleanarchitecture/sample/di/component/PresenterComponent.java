package org.satorysoft.androidcleanarchitecture.sample.di.component;

import dagger.Component;
import org.satorysoft.androidcleanarchitecture.sample.MainActivity;
import org.satorysoft.androidcleanarchitecture.sample.di.module.PresenterModule;

import javax.inject.Singleton;

/**
 * Created by vokol on 08.02.2016.
 */
@Component(modules = {PresenterModule.class})
@Singleton
public interface PresenterComponent {
    void inject(MainActivity activity);
}

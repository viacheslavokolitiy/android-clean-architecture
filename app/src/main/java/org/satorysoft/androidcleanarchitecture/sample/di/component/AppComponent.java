package org.satorysoft.androidcleanarchitecture.sample.di.component;

import dagger.Component;
import org.satorysoft.androidcleanarchitecture.sample.di.module.AppModule;
import org.satorysoft.androidcleanarchitecture.sample.ui.presentation.presenter.MainActivityPresenter;

import javax.inject.Singleton;

/**
 * Created by vokol on 08.02.2016.
 */
@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivityPresenter presenter);
}

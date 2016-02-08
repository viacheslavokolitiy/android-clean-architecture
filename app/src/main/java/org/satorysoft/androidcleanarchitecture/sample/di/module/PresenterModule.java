package org.satorysoft.androidcleanarchitecture.sample.di.module;

import dagger.Module;
import dagger.Provides;
import org.satorysoft.androidcleanarchitecture.sample.ui.presentation.presenter.MainActivityPresenter;
import org.satorysoft.androidcleanarchitecture.sample.ui.presentation.view.MainActivityView;

import javax.inject.Singleton;

/**
 * Created by vokol on 08.02.2016.
 */
@Module
public class PresenterModule {

    private MainActivityView mainActivityView;

    public PresenterModule(MainActivityView mainActivityView) {
        this.mainActivityView = mainActivityView;
    }

    @Provides
    @Singleton
    public MainActivityPresenter provideMainActivityPresenter(){
        return new MainActivityPresenter(mainActivityView);
    }
}

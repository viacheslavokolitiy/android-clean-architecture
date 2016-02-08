package org.satorysoft.androidcleanarchitecture.sample.ui.presentation.presenter;

import android.content.Context;
import org.satorysoft.androidcleanarchitecture.sample.App;
import org.satorysoft.androidcleanarchitecture.sample.di.component.DaggerAppComponent;
import org.satorysoft.androidcleanarchitecture.sample.di.module.AppModule;
import org.satorysoft.androidcleanarchitecture.sample.ui.presentation.view.MainActivityView;
import org.satorysoft.androidcleanarchitecture.sample.util.AuthenticationChecker;

import javax.inject.Inject;

/**
 * Created by vokol on 08.02.2016.
 */
public class MainActivityPresenter {
    private final MainActivityView mainActivityView;
    private final AuthenticationChecker checker;
    private boolean needShowLoginForm;

    @Inject
    protected Context context;

    public MainActivityPresenter(MainActivityView mainActivityView) {
        this.mainActivityView = mainActivityView;
        DaggerAppComponent
                .builder()
                .appModule(new AppModule(App.getInstance()))
                .build()
                .inject(this);

        this.checker = new AuthenticationChecker(context);
    }

    private boolean showLoginForm(){
        this.needShowLoginForm = !this.checker.isUserExists();

        return this.needShowLoginForm;
    }

    public void onAuthCheckCompleted(){
        if(this.showLoginForm()){
            mainActivityView.showSignInForm();
        } else {
            mainActivityView.showHomeScreen();
        }
    }
}

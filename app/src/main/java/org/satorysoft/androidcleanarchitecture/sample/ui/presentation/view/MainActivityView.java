package org.satorysoft.androidcleanarchitecture.sample.ui.presentation.view;

/**
 * Created by vokol on 08.02.2016.
 */
public interface MainActivityView {
    /**
     * Shows sign up form
     */
    void showSignUpForm();

    /**
     * Shows sign in form
     */
    void showSignInForm();

    /**
     * Shows home screen
     */
    void showHomeScreen();

    /**
     * Shows a progress dialog
     */
    void showProgressDialog();

    /**
     * Dismisses a progress dialog
     */
    void dismissProgressDialog();
}

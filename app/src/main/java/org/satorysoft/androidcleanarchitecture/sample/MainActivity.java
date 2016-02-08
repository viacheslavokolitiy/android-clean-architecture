package org.satorysoft.androidcleanarchitecture.sample;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import butterknife.Bind;
import butterknife.ButterKnife;
import org.satorysoft.androidcleanarchitecture.R;
import org.satorysoft.androidcleanarchitecture.sample.di.component.DaggerPresenterComponent;
import org.satorysoft.androidcleanarchitecture.sample.di.module.PresenterModule;
import org.satorysoft.androidcleanarchitecture.sample.ui.fragments.SignInFragment;
import org.satorysoft.androidcleanarchitecture.sample.ui.presentation.presenter.MainActivityPresenter;
import org.satorysoft.androidcleanarchitecture.sample.ui.presentation.view.MainActivityView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityView {
    @Inject
    protected MainActivityPresenter presenter;

    @Bind(R.id.toolbar)
    protected Toolbar toolbar;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerPresenterComponent
                .builder()
                .presenterModule(new PresenterModule(this))
                .build()
                .inject(this);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onAuthCheckCompleted();
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    @Override
    public void showSignUpForm() {
    }

    @Override
    public void showSignInForm() {
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container, SignInFragment.newInstance());
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.commit();
    }


    @Override
    public void showHomeScreen() {
    }

    @Override
    public void showProgressDialog() {
    }

    @Override
    public void dismissProgressDialog() {
    }
}

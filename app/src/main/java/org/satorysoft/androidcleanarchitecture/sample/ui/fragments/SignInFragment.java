package org.satorysoft.androidcleanarchitecture.sample.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Bind;
import butterknife.ButterKnife;
import org.satorysoft.androidcleanarchitecture.R;
import org.satorysoft.androidcleanarchitecture.sample.MainActivity;

/**
 * Created by vokol on 08.02.2016.
 */
public class SignInFragment extends Fragment {
    @Bind(R.id.til_username)
    protected TextInputLayout usernameLayout;
    @Bind(R.id.til_password)
    protected TextInputLayout passwordLayout;

    public static SignInFragment newInstance(){
        return new SignInFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_in, container, false);

        ButterKnife.bind(this, view);

        MainActivity hostActivity = (MainActivity) getActivity();
        hostActivity.getToolbar().setTitle(getString(R.string.text_toolbar_sign_in));
        return view;
    }
}

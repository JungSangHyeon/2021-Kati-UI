package com.example.katiui.katiDomain.main.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.katiui.R;
import com.example.katiui.jshCrossDomain.JSHSelectItem;
import com.example.katiui.katiDomain.main.PasswordEditActivity;
import com.example.katiui.katiDomain.main.SignUpActivity;

import org.jetbrains.annotations.NotNull;

public class MyKatiFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mykati, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        JSHSelectItem myInfoEditSelect = view.findViewById(R.id.select_my_info_edit);
        myInfoEditSelect.setOnClickListener(
                v-> Navigation.findNavController(view).navigate(R.id.action_myKatiFragment_to_myInfoEditFragment)
        );

        Button signUp = view.findViewById(R.id.mykati_signUp_button);
        signUp.setOnClickListener(v->this.getActivity().startActivity(new Intent(this.getContext(), SignUpActivity.class)));

        Button login = view.findViewById(R.id.mykati_login_button);
        login.setOnClickListener(v-> Navigation.findNavController(view).navigate(R.id.action_myKatiFragment_to_findPasswordFragment));
    }
}
package com.example.katiui.kati.main.myKati.myInfoEdit;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.katiui.R;
import com.example.katiui.kati.editName.EditNameActivity;
import com.example.katiui.kati.editPassword.EditPasswordActivity;
import com.example.katiui.kati.setRestoreEmail.SetRestoreEmailActivity;
import com.example.katiui.kati.signOut.SignOutActivity;

import org.jetbrains.annotations.NotNull;

public class MyInfoEditFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_info_edit, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button editPW = view.findViewById(R.id.myInfoEditFragment_editPW);
        editPW.setOnClickListener(v->this.getActivity().startActivity(new Intent(this.getContext(), EditPasswordActivity.class)));

        Button editName = view.findViewById(R.id.myInfoEditFragment_editName);
        editName.setOnClickListener(v->this.getActivity().startActivity(new Intent(this.getContext(), EditNameActivity.class)));

        Button editRestoreEmail = view.findViewById(R.id.myInfoEditFragment_editRestoreEmail);
        editRestoreEmail.setOnClickListener(v->this.getActivity().startActivity(new Intent(this.getContext(), SetRestoreEmailActivity.class)));

        TextView signOut = view.findViewById(R.id.myinfo_signOut_textView);
        signOut.setOnClickListener(v->this.getActivity().startActivity(new Intent(this.getContext(), SignOutActivity.class)));
    }
}
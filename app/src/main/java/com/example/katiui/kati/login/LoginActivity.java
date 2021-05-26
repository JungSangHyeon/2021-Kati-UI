package com.example.katiui.kati.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.katiui.R;
import com.example.katiui.kati.findId.FindIdActivity;
import com.example.katiui.kati.findPassword.FindPasswordActivity;
import com.example.katiui.kati.signUp.SignUpActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView findId = this.findViewById(R.id.login_findId_textView);
        TextView findPw = this.findViewById(R.id.login_findPW_textView);
        TextView signIn = this.findViewById(R.id.login_signIn_textView);

        findId.setOnClickListener(v->this.startActivity(new Intent(this, FindIdActivity.class)));
        findPw.setOnClickListener(v->this.startActivity(new Intent(this, FindPasswordActivity.class)));
        signIn.setOnClickListener(v->this.startActivity(new Intent(this, SignUpActivity.class)));
    }
}
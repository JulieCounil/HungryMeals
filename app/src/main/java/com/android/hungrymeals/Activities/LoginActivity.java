package com.android.hungrymeals.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.security.Signature;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        setOnClickListener(R.id.login, MainActivity.class);
        setOnClickListener(R.id.Cancel, SignUpActivity.class);

    }



    private void setOnClickListener(int resourceId,final Class className)
    {
        final View view = findViewById(resourceId);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),className);
                startActivity(intent);
            }
        });
}

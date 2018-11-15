package com.android.hungrymeals.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity  extends AppCompatActivity {

    //private DatabaseReference mDatabase;
   // mDatabase = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        setOnClickListener(R.id.Cancel, LoginActivity.class);
    }

    public void register(View view){

        EditText edit1 = (EditText) findViewById(R.id.Name);
        String name = edit1.getText().toString();

        EditText edit2 = (EditText) findViewById(R.id.email);
        String email= edit2.getText().toString();

        EditText edit3 = (EditText) findViewById(R.id.pwdOne);
        String pwdOne = edit1.getText().toString();

        EditText edit4= (EditText) findViewById(R.id.pwdTwo);
        String pwdTwo = edit1.getText().toString();

        if(pwdTwo != pwdOne){
            Toast.makeText(this, "Passwords aren't matching! Try again",Toast.LENGTH_LONG).show();
        }
        //else if(){} if already in database

        else{
            //add the user to database
            //      writeNewUser(name,email,pwdOne);



            //go back to login page
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);

        }
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





}}
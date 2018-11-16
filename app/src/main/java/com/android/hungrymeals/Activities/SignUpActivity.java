package com.android.hungrymeals.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.hungrymeals.Classes.User;
import com.google.firebase.hungrymeals;

public class SignUpActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        setOnClickListener(R.id.Cancel, LoginActivity.class);

        private hungrymeals mDataBase;
        mDatabase= FirebaseDatabase.getInstance().getReference();
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

        User user =mDataBase.child("users").child(name).getValue();

        if(pwdTwo != pwdOne){
            Toast.makeText(this, "Passwords aren't matching! Try again",Toast.LENGTH_LONG).show();
        }


        else if(user !=null) {
            if(user.getEmail()==email){
                Toast.makeText(this, "Account with same userName and Email already exist!",Toast.LENGTH_LONG).show();
            }
            Toast.makeText(this, "Username already taken!",Toast.LENGTH_LONG).show();
        } //if already in database

        else{
            //add the user to database
            writeNewUser(name, email, pwdOne);


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
        }); }



    private void writeNewUser(String mUserName, String email, String pwd){
        User user = new User(mUserName, email,pwd);
        mDatabase.child("users").child(mUserName).setValue(user);

    }
    
    

    private void deleteUser(String mUserName, User user){
        mDataBase.child("users").child(mUserName).removeValue(user);
    }


    private void login (User user) {
        User usert =mDataBase.child("users").child(user.getUserName()).getValue();

        if(usert==null){
            Toast.makeText(this, "User does not exist",Toast.LENGTH_LONG).show();

        }
        else if (usert.getPwd() != user.getPwd()){
            Toast.makeText(this, "Wrong password!",Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(this, "Login succeed!",Toast.LENGTH_LONG).show();
            
            //go to general menu
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);

        } }






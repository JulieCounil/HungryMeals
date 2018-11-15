package com.android.hungrymeals.Classes;

import android.media.Image;

public class User {
    private String mUserName;
    public String email;
    public String pwd;
    private Image mProfilPicture;


    public User(String name){
        mUserName = name;
       //mProfilPicture = profilPicture;
    }


    public User(String mUserName, String email, String pwd) {
        this.mUserName = mUserName;
        this.email = email;
        this.pwd =pwd;
    }




    public String getUserName(){return mUserName;}
   // public Image getProfilePicture(){return mProfilPicture;}
}

package com.android.hungrymeals.Classes;

import android.media.Image;

public class User {
    private String mUserName;
    private Image mProfilPicture;
    public User(String name){
        mUserName = name;
       //mProfilPicture = profilPicture;
    }

    public String getUserName(){return mUserName;}
   // public Image getProfilePicture(){return mProfilPicture;}
}

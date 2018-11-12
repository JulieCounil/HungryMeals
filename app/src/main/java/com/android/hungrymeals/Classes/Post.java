package com.android.hungrymeals.Classes;

public class Post {
    /*
    * This class is a model which will populate news feed of the app
    * A post contains :
    * -Poster information : name + profile picture
    * -The main image (Link to another to the recipe)
    * -PostId
    * -Rate
    * -TODO :comment section (will be added later)
    * */
    private String mRate;
    private User mUser;
    private int mPostId;
    private String mRecipeName;

    public Post(User poster,String rate,String recipeName,int postId){
        mRate = rate;
        mUser = poster;
        mPostId = postId;
        mRecipeName = recipeName;
    }

    public User getPoster(){return mUser;}
    public String getRate(){return mRate;}
    public int getPostId(){return mPostId;}
}

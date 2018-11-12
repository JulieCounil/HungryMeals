package com.android.hungrymeals.Classes;

public class Recipe {
    private int mRate;
    private int mRecipeId;
    private String mRecipeName;

    public Recipe(int rate,String recipeName,int recipeId){
        mRate = rate;
        mRecipeName = recipeName;
        mRecipeId = recipeId;
    }

    public String getRecipeName(){return mRecipeName;}
    public int getRate(){return mRate;}
    public int getRecipeId(){return mRecipeId;}

}

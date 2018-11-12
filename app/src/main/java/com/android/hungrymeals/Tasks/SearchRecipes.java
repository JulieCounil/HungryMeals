package com.android.hungrymeals.Tasks;

import android.os.AsyncTask;

import com.android.hungrymeals.Classes.Recipe;

import java.util.ArrayList;

public class SearchRecipes extends AsyncTask<ArrayList,Void,Recipe[]> {

    @Override
    protected Recipe[] doInBackground(ArrayList... arrayLists) {
        //TODO : download from the database
        return new Recipe[0];
    }

    @Override
    protected void onPostExecute(Recipe[] recipes) {
        super.onPostExecute(recipes);
    }
}

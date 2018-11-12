package com.android.hungrymeals.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.hungrymeals.Classes.Recipe;
import com.android.hungrymeals.R;

import java.util.ArrayList;

public class RecipeAdapter extends BaseAdapter {

    private final Recipe[] mRecipes;
    private final Context mContext;

    public RecipeAdapter(Context context, Recipe[] recipes)
    {
        mRecipes = recipes;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mRecipes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Recipe recipe = mRecipes[position];
        if(convertView==null)
        {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.activity_search, null);
        }

        ImageView imageView = convertView.findViewById(R.id.recipeImage);
        TextView textView = convertView.findViewById(R.id.recipeName);

        imageView.setImageResource(R.drawable.imagefood);
        textView.setText(recipe.getRecipeName());
        return null;
    }
}

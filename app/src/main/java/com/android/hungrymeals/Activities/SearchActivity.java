package com.android.hungrymeals.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.hungrymeals.Classes.Recipe;
import com.android.hungrymeals.R;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private ArrayList<String> mIngrediantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mIngrediantList = new ArrayList<>();
        final LinearLayout recipesLatout = findViewById(R.id.recipesLayout);
        final ImageView searchBtn = findViewById(R.id.recipeSearchBtn) ;
        final EditText searchBar = findViewById(R.id.ingrediantsSearchBar);
        final TextView emptyMsgTV = findViewById(R.id.emptyTextMsg);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = searchBar.getText().toString();
                if(!item.isEmpty() && item.matches("[a-zA-Z]+")) {
                    mIngrediantList.add(item);
                    recipesLatout.setVisibility(View.VISIBLE);
                    emptyMsgTV.setVisibility(View.INVISIBLE);
                }
                //TODO : send request to db to get all recipes which contain this item
                //TODO : Display this on a view
                //TODO :create an array which contains rating images (1-5) get this number from db
            }
        });

    }
}


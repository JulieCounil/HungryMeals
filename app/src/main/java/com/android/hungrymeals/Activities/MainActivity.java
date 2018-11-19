package com.android.hungrymeals.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.android.hungrymeals.Adapters.PostAdapter;
import com.android.hungrymeals.Classes.Post;
import com.android.hungrymeals.R;
import com.android.hungrymeals.Classes.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private PostAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setOnClickListener(R.id.search_icon, SearchActivity.class);
        setOnClickListener(R.id.addRecipe_icon,AddActivity.class);
        setOnClickListener(R.id.profile_icon,SignUpActivity.class);

        setUsersAdapter();
        //framelayout
        ListView listView = findViewById(R.id.postsListView);
        if(mAdapter.isEmpty()){
            //TODO: the user doesn't follow any profile
        }
        else
        {
            listView.setAdapter(mAdapter);
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
    }
    private void setUsersAdapter()
    {
        //Creation of profiles to populate news feed
        //TODO: should be populated from the database
        ArrayList postList = new ArrayList();
        for(int i=0;i<10;i++)
        {
            User user = new User("FouadMannou");
            Post myPost = new Post(user,"4.5","name",12456);
            postList.add(myPost);
        }

        mAdapter = new PostAdapter(this, postList);
    }
}

package com.android.hungrymeals.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.hungrymeals.Classes.Post;
import com.android.hungrymeals.R;

import java.util.ArrayList;

public class PostAdapter extends ArrayAdapter {

    public PostAdapter(Context context, ArrayList posts)
    {
        super(context,0,posts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Post post = (Post)getItem(position);

        if(convertView==null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.post,parent,false);

        ImageView profilePicture = (ImageView) convertView.findViewById(R.id.profilePicture);
        TextView userName = convertView.findViewById(R.id.userName);
        ImageView postImage = convertView.findViewById(R.id.recipeImage);
        //TextView recipeName= convertView.findViewById(R.id.recipeName);
        //TODO:find logic to get this image from database

        profilePicture.setImageResource(R.drawable.profileimage);
        userName.setText(post.getPoster().getUserName());
        postImage.setImageResource(R.drawable.imagefood);
        //TODO:get Recipe's name


        return convertView;
    }
}

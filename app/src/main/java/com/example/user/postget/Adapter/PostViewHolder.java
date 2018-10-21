package com.example.user.postget.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.user.postget.R;


public class PostViewHolder extends RecyclerView.ViewHolder {
    TextView txt_title, txt_content, txt_user;

    public PostViewHolder(View itemView) {
        super(itemView);

        txt_user = (TextView) itemView.findViewById(R.id.txt_user);
        txt_content = (TextView) itemView.findViewById(R.id.txt_content);
        txt_title = (TextView) itemView.findViewById(R.id.txt_title);

    }

}

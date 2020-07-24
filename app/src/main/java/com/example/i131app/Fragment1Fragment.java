package com.example.i131app;

import android.app.Application;
import android.content.Intent;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.i131app.activity.LearnActivity;

public class Fragment1Fragment extends Fragment implements View.OnClickListener {

    private ImageView imageView;
    private ImageView imageView1Learn;
    private ImageView imageView2Search;
    private ImageView imageView3Record;
    private ImageView imageView4Review;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView = (ImageView) view.findViewById(R.id.imageView);
        view.findViewById(R.id.button1_learn).setOnClickListener(this);
        view.findViewById(R.id.button2_search).setOnClickListener(this);
        view.findViewById(R.id.button3_record).setOnClickListener(this);
        view.findViewById(R.id.button4_review).setOnClickListener(this);
        imageView1Learn = (ImageView) view.findViewById(R.id.imageView1_learn);
        imageView2Search = (ImageView) view.findViewById(R.id.imageView2_search);
        imageView3Record = (ImageView) view.findViewById(R.id.imageView3_record);
        imageView4Review = (ImageView) view.findViewById(R.id.imageView4_review);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.button1_learn:
                //TODO implement
                intent = new Intent(getActivity(), LearnActivity.class);
                startActivity(intent);
                break;
            case R.id.button2_search:
                //TODO implement
                break;
            case R.id.button3_record:
                //TODO implement
                break;
            case R.id.button4_review:
                //TODO implement
                break;
        }
    }
}

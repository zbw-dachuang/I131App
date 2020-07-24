package com.example.i131app;

import android.content.Intent;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.i131app.activity.ActivityBodyAssessActivity;
import com.example.i131app.activity.loginActivity;

public class Fragment3Fragment extends Fragment implements View.OnClickListener {

    private ImageView imageView;
    private ImageView imageView11PersonInfo;
    private ImageView imageView12Bodyaccess;
    private ImageView imageView12Leave;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment3, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView11PersonInfo = (ImageView) view.findViewById(R.id.imageView11_personInfo);
        view.findViewById(R.id.button8_personInfo).setOnClickListener(this);
        imageView12Bodyaccess = (ImageView) view.findViewById(R.id.imageView12_bodyaccess);
        view.findViewById(R.id.button9_bodyaccess).setOnClickListener(this);
        imageView12Leave = (ImageView) view.findViewById(R.id.imageView12_leave);
        view.findViewById(R.id.button10_leave).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.button8_personInfo:
                //TODO implement
                break;
            case R.id.button9_bodyaccess:
                //TODO implement
                intent = new Intent(getActivity(), ActivityBodyAssessActivity.class);
                startActivity(intent);
                break;
            case R.id.button10_leave:
                //TODO implement
                intent = new Intent(getActivity(), loginActivity.class);
                startActivity(intent);
                getActivity().finish();
                break;
        }
    }
}

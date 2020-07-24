package com.example.i131app;


import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import androidx.fragment.app.Fragment;

public class Fragment2Fragment extends Fragment {

    private ImageView imageView;
    private ImageView receiveMessage;
    private TextView receiveMessageText;
    private ImageView chargePlan;
    private TextView chargePlanText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView = (ImageView) view.findViewById(R.id.imageView);
        receiveMessage = (ImageView) view.findViewById(R.id.receiveMessage);
        receiveMessageText = (TextView) view.findViewById(R.id.receiveMessageText);
        chargePlan = (ImageView) view.findViewById(R.id.chargePlan);
        chargePlanText = (TextView) view.findViewById(R.id.chargePlanText);
    }

}

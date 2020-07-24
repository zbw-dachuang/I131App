package com.example.i131app;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class AfterhospitalActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    afterLearnFragment1 fragment1 = new afterLearnFragment1();
    afterLearnFragment2 fragment2 = new afterLearnFragment2();
    afterLearnFragment3 fragment3 = new afterLearnFragment3();
    afterLearnFragment4 fragment4 = new afterLearnFragment4();
    afterLearnFragment5 fragment5 = new afterLearnFragment5();
    afterLearnFragment6 fragment6 = new afterLearnFragment6();
    afterLearnFragment0 fragment0 = new afterLearnFragment0();
    private Fragment[] fragments=new Fragment[]{fragment1, fragment2, fragment3, fragment4, fragment5, fragment6, fragment0};
    int lastFragment = 6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afterhospital);

        button1 = findViewById(R.id.AfterHospitalButton1);
        button2 = findViewById(R.id.AfterHospitalButton2);
        button3 = findViewById(R.id.AfterHospitalButton3);
        button4 = findViewById(R.id.AfterHospitalButton4);
        button5 = findViewById(R.id.AfterHospitalButton5);
        button6 = findViewById(R.id.AfterHospitalButton6);

        findViewById(R.id.AfterHospitalButton1).setOnClickListener(this);
        findViewById(R.id.AfterHospitalButton2).setOnClickListener(this);
        findViewById(R.id.AfterHospitalButton3).setOnClickListener(this);
        findViewById(R.id.AfterHospitalButton4).setOnClickListener(this);
        findViewById(R.id.AfterHospitalButton5).setOnClickListener(this);
        findViewById(R.id.AfterHospitalButton6).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.AfterHospitalButton1:
                //TODO implement

                transaction.hide(fragments[lastFragment]);
                if (fragment1.isAdded() == false) {
                    transaction.add(R.id.afterlearn, fragment1);
                }
                transaction.show(fragment1).commitAllowingStateLoss();
                lastFragment=0;
                break;
            case R.id.AfterHospitalButton2:
                //TODO implement

                transaction.hide(fragments[lastFragment]);
                if (fragment2.isAdded() == false) {
                    transaction.add(R.id.afterlearn, fragment2);
                }
                transaction.show(fragment2).commitAllowingStateLoss();
                lastFragment=1;
                break;
            case R.id.AfterHospitalButton3:
                //TODO implement

                transaction.hide(fragments[lastFragment]);
                if (fragment3.isAdded() == false) {
                    transaction.add(R.id.afterlearn, fragment3);
                }
                transaction.show(fragment3).commitAllowingStateLoss();
                lastFragment=2;
                break;
            case R.id.AfterHospitalButton4:
                //TODO implement

                transaction.hide(fragments[lastFragment]);
                if (fragment4.isAdded() == false) {
                    transaction.add(R.id.afterlearn, fragment4);
                }
                transaction.show(fragment4).commitAllowingStateLoss();
                lastFragment=3;
                break;
            case R.id.AfterHospitalButton5:
                //TODO implement

                transaction.hide(fragments[lastFragment]);
                if (fragment5.isAdded() == false) {
                    transaction.add(R.id.afterlearn, fragment5);
                }
                transaction.show(fragment5).commitAllowingStateLoss();
                lastFragment=4;
                break;
            case R.id.AfterHospitalButton6:
                //TODO implement

                transaction.hide(fragments[lastFragment]);
                if (fragment6.isAdded() == false) {
                    transaction.add(R.id.afterlearn, fragment6);
                }
                transaction.show(fragment6).commitAllowingStateLoss();
                lastFragment=5;
                break;
        }
    }
    public static class afterLearnFragment1 extends Fragment {
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.afterhosptial1, container, false);
        }
    }
    public static class afterLearnFragment2 extends Fragment {
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.afterhosptial2, container, false);
        }
    }
    public static class afterLearnFragment3 extends Fragment {
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.afterhosptial3, container, false);
        }
    }
    public static class afterLearnFragment4 extends Fragment {
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.afterhosptial4, container, false);
        }
    }
    public static class afterLearnFragment5 extends Fragment {
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.afterhosptial5, container, false);
        }
    }
    public static class afterLearnFragment6 extends Fragment {
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.afterhosptial6, container, false);
        }
    }
    public static class afterLearnFragment0 extends Fragment {
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.afterhospitalblank, container, false);
        }
    }

}

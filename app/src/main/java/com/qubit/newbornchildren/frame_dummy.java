package com.qubit.newbornchildren;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class frame_dummy extends AppCompatActivity {


    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_dummy);
        FirstTrimester mList = new FirstTrimester();
        manager=getFragmentManager();
        transaction=manager.beginTransaction();
        transaction.replace(R.id.work, mList);
        transaction.commit();

    }
}

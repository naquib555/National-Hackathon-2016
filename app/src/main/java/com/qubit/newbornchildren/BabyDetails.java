package com.qubit.newbornchildren;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.qubit.newbornchildren.R;

public class BabyDetails extends AppCompatActivity {


    TextView mothername;
    TextView fathername;
    TextView location;
    TextView phone;
    TextView dob;
    TextView gender;
    TextView bloodgroup;
    TextView weight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_details);

        mothername = (TextView) findViewById(R.id.motherName);
        fathername = (TextView) findViewById(R.id.fathername);
        location = (TextView) findViewById(R.id.location);
        phone = (TextView) findViewById(R.id.phone);
        dob = (TextView) findViewById(R.id.dob);
        gender = (TextView) findViewById(R.id.gender);
        bloodgroup = (TextView) findViewById(R.id.bloodgroup);
        weight = (TextView) findViewById(R.id.weight);

        String [] childDetails = getIntent().getExtras().getStringArray("detailsofChild");

        mothername.setText(" মায়ের নাম - " + childDetails[0]);
        fathername.setText(" বাবার নাম - " + childDetails[1]);
        location.setText(" ঠিকানা  - " + childDetails[2]);
        phone.setText(" ফোন - " + childDetails[3]);
        dob.setText(" জন্ম তারিখ -" + childDetails[4]);
        gender.setText(" লিঙ্গ - "+ childDetails[5]);
        bloodgroup.setText(" রক্তের গ্রুপ -  " + childDetails[6]);
        weight.setText(" ওজন - " + childDetails[7]);





    }



}

package com.qubit.newbornchildren;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.qubit.newbornchildren.R;

public class MotherDetails extends AppCompatActivity {

    TextView motherName;
    TextView age;
    TextView location;
    TextView phone;
    TextView firstmother;
    TextView height;
    TextView weight;
    TextView expectationdate;
    TextView bloodgroup;
    TextView bloodpressure;

    Button trimester;

    FragmentManager manager;
    FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mother_details);

        motherName = (TextView) findViewById(R.id.motherName);
        age = (TextView) findViewById(R.id.age);
        location = (TextView) findViewById(R.id.location);
        phone = (TextView) findViewById(R.id.phone);
        firstmother = (TextView) findViewById(R.id.firstmother);
        height = (TextView) findViewById(R.id.height);
        weight = (TextView) findViewById(R.id.weight);
        expectationdate = (TextView) findViewById(R.id.expectationdate);
        bloodgroup = (TextView) findViewById(R.id.bloodgroup);
        bloodpressure = (TextView) findViewById(R.id.bloodpressure);
        trimester = (Button) findViewById(R.id.trimester);







        String [] motherDetails = getIntent().getExtras().getStringArray("detailsofMother");

        motherName.setText(motherDetails[0]);
        age.setText(" বয়স - " + motherDetails[1]);
        location.setText(" স্থান  - " + motherDetails[2]);
        phone.setText(" ফোন - " + motherDetails[3]);
        firstmother.setText(" প্রথমবার মা -"+ motherDetails[4]);
        height.setText(" উচ্চতা - "+ motherDetails[5]);
        weight.setText(" ওজন -" + motherDetails[6]);
        expectationdate.setText(" সম্ভাব্য  ডেলিভেরি - " + motherDetails[7]);
        bloodgroup.setText(" রক্তের গ্রুপ -  " + motherDetails[8]);
        bloodpressure.setText(" ব্লাড প্রেশার -  " + motherDetails[9]);

        trimester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MotherDetails.this, frame_dummy.class);
                startActivity(i);

            }
        });

    }
}

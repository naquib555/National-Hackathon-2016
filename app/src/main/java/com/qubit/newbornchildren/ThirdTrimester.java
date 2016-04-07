package com.qubit.newbornchildren;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.qubit.newbornchildren.MainActivity;
import com.qubit.newbornchildren.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdTrimester extends Fragment {


    View view;
    private CheckBox bpCheck;
    private CheckBox urineCheck;
    private CheckBox movementofbaby;
    private CheckBox weightGain;
    private CheckBox deliveryPrep;
    private CheckBox threeTT;
    private CheckBox hospital;
    FragmentManager manager;
    FragmentTransaction transaction;
    Button submitThird;

    public ThirdTrimester() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_third_trimester, container, false);
        bpCheck = (CheckBox) view.findViewById(R.id.BPcheck);
        urineCheck = (CheckBox) view.findViewById(R.id.UrineCheck);
        movementofbaby = (CheckBox) view.findViewById(R.id.movementOfBabyThird);
        weightGain = (CheckBox) view.findViewById(R.id.weightGain);
        deliveryPrep = (CheckBox) view.findViewById(R.id.deliveryPrep);
        threeTT = (CheckBox) view.findViewById(R.id.threeTT);
        hospital = (CheckBox) view.findViewById(R.id.hospital);
        submitThird=(Button)view.findViewById(R.id.submitThird);


        submitThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (bpCheck.isChecked() && urineCheck.isChecked() && movementofbaby.isChecked()
                        && weightGain.isChecked() && deliveryPrep.isChecked() && threeTT.isChecked()
                        && hospital.isChecked()){

                    Intent i=new Intent(getActivity(), GoodLuck.class);
                    startActivity(i);

                }
                else{

                    Toast.makeText(getActivity(), "সব তথ্য পরিপূর্ণ হয়নি", Toast.LENGTH_LONG).show();
                }
            }
        });



        return view;
    }

}

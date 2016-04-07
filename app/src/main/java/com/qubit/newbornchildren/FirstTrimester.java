package com.qubit.newbornchildren;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.qubit.newbornchildren.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstTrimester extends Fragment {

    View view;
    CheckBox firstVisit;
    CheckBox confPregnancy;
    CheckBox ultraSound;
    CheckBox urineTest;
    CheckBox cbBloodPressure;
    EditText etBloodPressure;
    EditText etWeight;
    CheckBox hepB;
    CheckBox TT;
    Button submitFirst;
    FragmentManager manager;
    FragmentTransaction transaction;

    public FirstTrimester() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_first_trimester, container, false);

        firstVisit=(CheckBox)view.findViewById(R.id.firstVisit);
        confPregnancy=(CheckBox)view.findViewById(R.id.confPregnancy);
        ultraSound=(CheckBox)view.findViewById(R.id.ultrasound);
        urineTest=(CheckBox)view.findViewById(R.id.urineTest);
        cbBloodPressure=(CheckBox)view.findViewById(R.id.cbBloodPressure);
        etBloodPressure=(EditText)view.findViewById(R.id.etBloodPressure);
        etWeight=(EditText)view.findViewById(R.id.etWeight);
        hepB=(CheckBox)view.findViewById(R.id.hepB);
        TT=(CheckBox)view.findViewById(R.id.TT);
        submitFirst=(Button)view.findViewById(R.id.submitFirst);


        submitFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstVisit.isChecked() && confPregnancy.isChecked()
                        && ultraSound.isChecked() && cbBloodPressure.isChecked()
                        && !etBloodPressure.getText().toString().equals(null) && !etWeight.getText().toString().equals(null) &&
                        hepB.isChecked() && TT.isChecked()){


                    SecondTrimester st=new SecondTrimester();
                    manager=getFragmentManager();
                    transaction=manager.beginTransaction();
                    transaction.replace(R.id.work,st);
                    transaction.commit();


                }
                else{
                    Toast.makeText(getActivity(), "সব তথ্য পরিপূর্ণ হয়নি", Toast.LENGTH_LONG).show();
                }
            }
        });







        return view;
    }

}

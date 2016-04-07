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
import android.widget.Toast;

import com.qubit.newbornchildren.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondTrimester extends Fragment {

    View view;
    private CheckBox bp;
    private CheckBox enlargedBody;
    private CheckBox movementofBaby;
    private CheckBox weightGain;
    Button submitSecond;
    FragmentManager manager;
    FragmentTransaction transaction;

    public SecondTrimester() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second_trimester, container, false);
        bp = (CheckBox) view.findViewById(R.id.bp);
        enlargedBody = (CheckBox) view.findViewById(R.id.EnlargedBody);
        movementofBaby = (CheckBox) view.findViewById(R.id.movementOfBaby);
        weightGain = (CheckBox) view.findViewById(R.id.weightGain);
        submitSecond=(Button)view.findViewById(R.id.submitSecond);

        submitSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bp.isChecked() && enlargedBody.isChecked() && movementofBaby.isChecked() && weightGain.isChecked()) {


                    ThirdTrimester tt=new ThirdTrimester();
                    manager=getFragmentManager();
                    transaction=manager.beginTransaction();
                    transaction.replace(R.id.work,tt);
                    transaction.commit();
                }
                else{
                    Toast.makeText(getActivity(),"সব তথ্য পরিপূর্ণ হয়নি", Toast.LENGTH_LONG).show();
                }
            }
        });



        return view;
    }

}

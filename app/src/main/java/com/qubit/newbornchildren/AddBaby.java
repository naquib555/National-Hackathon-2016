package com.qubit.newbornchildren;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class AddBaby extends Fragment {

    View view;

    FragmentManager manager;
    FragmentTransaction transaction;

    private Button submit;

    public AddBaby() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_add_baby, container, false);

        submit = (Button) view.findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "যোগ করা হয়েছে", Toast.LENGTH_LONG).show();;
                BabyList mList=new BabyList();

                manager=getFragmentManager();
                transaction=manager.beginTransaction();
                transaction.replace(R.id.mainContent, mList);
                transaction.commit();

            }
        });

        return view;

    }




}

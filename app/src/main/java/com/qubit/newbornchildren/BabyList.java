package com.qubit.newbornchildren;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class BabyList extends Fragment {

    private View view;

    private ArrayAdapter<String> childAdapter;

    private String [] babylistdata;

    private ArrayList<String> list;
    private ListView listView;


    public BabyList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fragment_baby_list, container, false);

        babylistdata = new String[] {
                "নুসরাত চত্তপাদ্ধাই বাচ্চা",
                "সাযিবা অধিকারী বাচ্চা"
        };

        list = new ArrayList<String>();
        Arrays.asList(babylistdata);

        listView = (ListView) view.findViewById(R.id.listViewBaby);

        childAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, babylistdata);

        listView.setAdapter(childAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String name;
                Intent i;
                switch (position) {
                    case 0:

                        i = new Intent(getActivity(), BabyDetails.class);
                        name = babylistdata[0];
                        String[] childDetails1 = {
                                "নুসরাত চত্তপাদ্ধাই",
                                "অঞ্জান মস্তাকিম",
                                "দক্ষিণপাড়া",
                                "০১৬৭৫৮৪৩৯২১",
                                "২ এপ্রিল",
                                "ছেলে",
                                "A +",
                                "১০ কেজি",


                        };
                        i.putExtra("detailsofChild", childDetails1);
                        startActivity(i);
                        break;

                    case 1:

                        i = new Intent(getActivity(), BabyDetails.class);
                        name = babylistdata[1];
                        String[] childDetails2 = {
                                "সাযিবা অধিকারী",
                                "আধিকারী ইম্মি",
                                "মনিপারা",
                                "০১৬৭৫৮৬৯৫৮২",
                                "২৯ মার্চ",
                                "মেয়ে",
                                "৬৩ কেজি",
                                "৩ সপ্তাহ",
                                "B +",
                                "১৩ কেজি"

                        };
                        i.putExtra("detailsofChild", childDetails2);
                        startActivity(i);
                        break;


                }


            }
        });


        return view;
    }

}

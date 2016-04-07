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
public class MotherList extends Fragment {

    View view;

    private ArrayAdapter<String> motherAdapter;
    private String [] motherlistdata;

    private ArrayList<String> list;
    private ListView listView;

    public MotherList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_mother_list, container, false);

        motherlistdata = new String[] {
                "কারিমা বেগম",
                "রকসানা বেগম",
                "ফারিয়া আবিল",
                "নুসরাত চত্তপাদ্ধাই",
                "সাযিবা অধিকারী",
                "নওশিন গাঙ্গুলি"
        };

        Arrays.asList(motherlistdata);

        listView = (ListView) view.findViewById(R.id.listViewMother);

        motherAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, motherlistdata);

        listView.setAdapter(motherAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String name;
                Intent i;
                switch(position) {
                    case 0:

                        i = new Intent(getActivity(), MotherDetails.class);
                        name = motherlistdata[0];
                        String [] motherDetails1 = {
                                name,
                                "২১",
                                "দক্ষিণপাড়া",
                                "০১৬৭৫৮৪৩৯২১",
                                "হ্যাঁ",
                                "৫.১ ফুট",
                                "৫৮ কেজি",
                                "৬ সপ্তাহ",
                                "A +",
                                "১২০/৮০"

                        };
                        i.putExtra("detailsofMother", motherDetails1);
                        startActivity(i);
                        break;

                    case 1:

                        i = new Intent(getActivity(), MotherDetails.class);
                        name = motherlistdata[1];
                        String [] motherDetails2 = {
                                name,
                                "২৩",
                                "মনিপারা",
                                "০১৬৭৫৮৬৯৫৮২",
                                "হ্যাঁ",
                                "৫.৪ ফুট",
                                "৬৩ কেজি",
                                "৩ সপ্তাহ",
                                "B +",
                                "১২০/৮০"

                        };
                        i.putExtra("detailsofMother", motherDetails2);
                        startActivity(i);
                        break;

                    case 2:

                        i = new Intent(getActivity(), MotherDetails.class);
                        name = motherlistdata[2];
                        String [] motherDetails = {
                                name,
                                "২৭",
                                "মিনাগঞ্জ",
                                "০১৭৪৯৩৮৫৯৬৪",
                                "না",
                                "৫.৩ ফুট",
                                "৫৯ কেজি",
                                "৯ সপ্তাহ",
                                "O +",
                                "১২০/৮০"

                        };
                        i.putExtra("detailsofMother", motherDetails);
                        startActivity(i);
                        break;

                    case 3:

                        i = new Intent(getActivity(), MotherDetails.class);
                        name = motherlistdata[3];
                        String [] motherDetails3 = {
                                name,
                                "২১",
                                "আফিম্নাগর",
                                "০১৮৪৭৫৮৩৯০৮৯",
                                "না",
                                "৫.৫ ফুট",
                                "৬৫ কেজি",
                                "১০ সপ্তাহ",
                                "A +",
                                "১২০/৮০"

                        };
                        i.putExtra("detailsofMother", motherDetails3);
                        startActivity(i);
                        break;

                    case 4:

                        i = new Intent(getActivity(), MotherDetails.class);
                        name = motherlistdata[4];
                        String [] motherDetails4 = {
                                name,
                                "২৫",
                                "নিশিম্পুর",
                                "০১৯২৪৮৫০০৮১",
                                "হ্যাঁ",
                                "৫.১ ফুট",
                                "৫৮ কেজি",
                                " সপ্তাহ",
                                "A +",
                                "১২০/৮০"

                        };
                        i.putExtra("detailsofMother", motherDetails4);
                        startActivity(i);
                        break;

                    case 5:

                        i = new Intent(getActivity(), MotherDetails.class);
                        name = motherlistdata[5];
                        String [] motherDetails5 = {
                                name,
                                "২৬",
                                "মানিকবারি",
                                "০১৭৫৪৮৯০০৩৯",
                                "হ্যাঁ",
                                "৫.২ ফুট",
                                " কেজি",
                                "১১ সপ্তাহ",
                                "A +",
                                "১২০/৮০"

                        };
                        i.putExtra("detailsofMother", motherDetails5);
                        startActivity(i);
                        break;


                }



            }
        });

        return view;
    }

}

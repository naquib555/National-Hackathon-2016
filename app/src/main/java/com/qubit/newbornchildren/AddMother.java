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
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddMother extends Fragment {

    View view;

    FragmentManager manager;
    FragmentTransaction transaction;

    EditText etMotherName;
    EditText etMotherLocation;
    EditText etMotherPhone;
    EditText etMotherAge;
    CheckBox cbFirstTime;
    EditText etMotherEDD;
    EditText etMotherHeight;
    EditText etMotherWeight;
    EditText etMotherBP;
    EditText etMotherBG;
    CheckBox cbFirstHep;
    CheckBox cbFirstTT;
    Button btnAddMotherEnter;

    String mName;
    String mLocation;
    String mPhone;
    String mAge;
    String mEDD;
    int mEDDInt;
    String mHeight;
    String mWeight;
    String mBG;
    String mBP;

    public AddMother() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_add_mother, container, false);

        EditText etMotherName=(EditText) view.findViewById(R.id.etMotherName);
        EditText etMotherLocation=(EditText) view.findViewById(R.id.etMotherLocation);
        EditText etMotherPhone=(EditText) view.findViewById(R.id.etMotherPhone);
        EditText etMotherAge=(EditText) view.findViewById(R.id.etMotherAge);
        CheckBox cbFirstTime=(CheckBox) view.findViewById(R.id.cbFirstTime);
        EditText etMotherEDD=(EditText) view.findViewById(R.id.etMotherEDD);
        EditText etMotherHeight=(EditText) view.findViewById(R.id.etMotherHeight);
        EditText etMotherWeight=(EditText) view.findViewById(R.id.etMotherWeight);
        EditText etMotherBP=(EditText) view.findViewById(R.id.etMotherBG);
        EditText etMotherBG=(EditText) view.findViewById(R.id.etMotherBP);
        CheckBox cbHep=(CheckBox) view.findViewById(R.id.cbHep);
        CheckBox cbTT=(CheckBox) view.findViewById(R.id.cbTT);
        Button btnAddMotherEnter=(Button) view.findViewById(R.id.btnAddMotherEnter);


btnAddMotherEnter.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "যোগ করা হয়েছে", Toast.LENGTH_LONG).show();;
        MotherList mList=new MotherList();

        manager=getFragmentManager();
        transaction=manager.beginTransaction();
        transaction.replace(R.id.mainContent, mList);
        transaction.commit();
    }
});

    return view;
    }



    public String getmName() {
        return mName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmAge() {
        return mAge;
    }

    public String getmEDD() {
        return mEDD;
    }

    public int getmEDDInt() {
        return mEDDInt;
    }

    public String getmHeight() {
        return mHeight;
    }

    public String getmWeight() {
        return mWeight;
    }

    public String getmBG() {
        return mBG;
    }

    public String getmBP() {
        return mBP;
    }


}

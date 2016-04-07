package com.qubit.newbornchildren;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    FragmentManager manager;
    FragmentTransaction transaction;

    private ActionBarDrawerToggle mDrawerListener;
    private DrawerLayout drawerLayout;
    private ListView listView;
    private String[] navResources;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        navResources = new String[]{
                "মা তালিকা",
                "শিশু তালিকা",
                "মা নিবন্ধন",
                "শিশু নিবন্ধন"
        };
        listView = (ListView) findViewById(R.id.drawerList);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, navResources));

        listView.setOnItemClickListener(this);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
        mDrawerListener=new ActionBarDrawerToggle(this,drawerLayout, R.string.open,R.string.close) {

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        drawerLayout.setDrawerListener(mDrawerListener);


        home mList5=new home();

        manager=getFragmentManager();
        transaction=manager.beginTransaction();
        transaction.replace(R.id.mainContent, mList5);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {

        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(this, navResources[position], (Toast.LENGTH_LONG).show());
        selectItem(position);

        switch (position){
            case 0:
                MotherList mList0=new MotherList();

                manager=getFragmentManager();
                transaction=manager.beginTransaction();
                transaction.replace(R.id.mainContent, mList0);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
                //transaction.add()

            case 1:
                BabyList mList1=new BabyList();

                manager=getFragmentManager();
                transaction=manager.beginTransaction();
                transaction.replace(R.id.mainContent, mList1);
                transaction.addToBackStack(null);
                transaction.commit();
                break;

            case 2:
                AddMother mList2=new AddMother();

                manager=getFragmentManager();
                transaction=manager.beginTransaction();
                transaction.replace(R.id.mainContent, mList2);

                transaction.addToBackStack(null);
                transaction.commit();
                break;

            case 3:
                AddBaby mList3=new AddBaby();

                manager=getFragmentManager();
                transaction=manager.beginTransaction();
                transaction.replace(R.id.mainContent, mList3);

                transaction.addToBackStack(null);
                transaction.commit();
                break;

        }


//        case 0:
//        FragmentManager manager;
//        FragmentTransaction transaction;
//        MotherList mList=new MotherList();
//        manager=getFragmentManager();
//        transaction=manager.beginTransaction();
//        transaction.add(R.id.mainContent, mList);
//        transaction.commit();



    }

    private void selectItem(int position) {
        listView.setItemChecked(position, true);
        setTitle(navResources[position]);
    }

    public void setTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}

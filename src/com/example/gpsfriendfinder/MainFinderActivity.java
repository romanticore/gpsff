package com.example.gpsfriendfinder;

import android.os.Bundle;
import android.view.*;
import android.support.v7.app.*;

public class MainFinderActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_finder);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(false);

        ActionBar.Tab tab = actionBar.newTab()
                .setText(R.string.action_home)
                .setIcon(R.drawable.house)
                .setTabListener(new TabListener<HomeFragment>(
                        this, "home", HomeFragment.class));
        actionBar.addTab(tab);
        
        tab = actionBar.newTab()
               .setText(R.string.action_search)
               .setIcon(R.drawable.magnifier)
               .setTabListener(new TabListener<MapFragment>(
                       this, "map", MapFragment.class));
        actionBar.addTab(tab);

        
        tab = actionBar.newTab()
               .setText(R.string.action_list)
               .setIcon(R.drawable.attributes_display)
               .setTabListener(new TabListener<FriendListFragment>(
                       this, "list", FriendListFragment.class));
        actionBar.addTab(tab);
                
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
}

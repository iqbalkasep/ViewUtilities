package com.iqbal.example.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.iqbal.example.fragment.FirstFragment;
import com.iqbal.viewutilities.R;
import com.iqbal.viewutilities.ViewUtilities;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set Fragment
        Fragment fragment = new FirstFragment();

        //set FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        ViewUtilities.addSimpleFragment(fragment, fragmentManager, R.id.container_fragment, true);

    }


}

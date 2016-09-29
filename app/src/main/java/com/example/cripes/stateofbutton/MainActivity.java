package com.example.cripes.stateofbutton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout view1,view2,view3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        view1 = (LinearLayout) findViewById(R.id.view1);
        view2 = (LinearLayout) findViewById(R.id.view2);
        view3 = (LinearLayout) findViewById(R.id.view3);
        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setSelected(false);
                view3.setSelected(false);
                view2.setSelected(true);
            }
        });

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setSelected(true);
                view3.setSelected(false);
                view2.setSelected(false);
            }
        });
        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view1.setSelected(false);
                view2.setSelected(false);
                view3.setSelected(true);
            }
        });

    }

}

package com.santiago6695gmail.events;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        //hide title and icon in action bar
        ActionBar actionBar = getActionBar();
        actionBar.show();
        // actionBar.setDisplayShowTitleEnabled(false);
        // actionBar.setDisplayUseLogoEnabled(false);
        //set up buttons
        Button signUpButton = (Button) findViewById(R.id.signup);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.sign_up);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    //set up the menu
}


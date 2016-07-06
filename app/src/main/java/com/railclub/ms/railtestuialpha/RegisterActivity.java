package com.railclub.ms.railtestuialpha;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;

import com.dd.morphingbutton.MorphingButton;
import com.hanks.library.AnimateCheckBox;

public class RegisterActivity extends AppCompatActivity {

    private AnimateCheckBox termsCheckbox;
    private MorphingButton register;
    private ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        termsCheckbox= (AnimateCheckBox) findViewById(R.id.termsCheck);
        register= (MorphingButton) findViewById(R.id.registerButton);
        scrollView= (ScrollView) findViewById(R.id.scrollView);
        register.setVisibility(View.INVISIBLE);


        termsCheckbox.setOnCheckedChangeListener(new AnimateCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                if(isChecked) {
                    register.setVisibility(View.VISIBLE);
                    scrollView.fullScroll(View.FOCUS_DOWN);
                }
                else
                    register.setVisibility(View.INVISIBLE);



            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}

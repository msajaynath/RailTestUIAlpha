package com.railclub.ms.railtestuialpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dd.morphingbutton.MorphingButton;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    private MorphingButton btnMorph;
    private TextView registerLink;
    private MorphingButton.Params circle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnMorph = (MorphingButton) findViewById(R.id.loginButton);
        registerLink = (TextView) findViewById(R.id.registerLink);
// inside on click event
        circle = MorphingButton.Params.create()
                .duration(500)
                .cornerRadius(dimen(R.dimen.mb_height_56)) // 56 dp
                .width(dimen(R.dimen.mb_height_56)) // 56 dp
                .height(dimen(R.dimen.mb_height_56)) // 56 dp
                .color(color(R.color.mb_green)) // normal state color
                .colorPressed(color(R.color.mb_green_dark)) // pressed state color
                .icon(R.drawable.ic_done); // icon
        btnMorph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMorph.morph(circle);

            }
        });

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            }
        });
    }


    public int dimen(@DimenRes int resId) {
        return (int) getResources().getDimension(resId);
    }

    public int color(@ColorRes int resId) {
        return getResources().getColor(resId);
    }
}
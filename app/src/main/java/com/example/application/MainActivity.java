package com.example.application;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.graphics.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout Create
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(Gravity.CENTER);
        setContentView(linearLayout);

        Button button = new Button(getApplicationContext());
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        button.setText("Click to get alert");
        linearLayout.addView(button);

        //OnClick
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                alertDialog.setTitle("Warning");
                alertDialog.setMessage("Hello World");
                alertDialog.show();

            }
        });

    }
}
package com.example.evgen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Evgen on 02.03.2016.
 */
public class dva extends  MainActivity implements OnClickListener{
    Button but2;
    TextView tv1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);


        but2 = (Button) findViewById(R.id.but2);
        but2.setOnClickListener(this);

    }
    @Override

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but2:
                Intent intent = new Intent(this, tri.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}


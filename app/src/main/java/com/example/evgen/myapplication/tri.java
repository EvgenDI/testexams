package com.example.evgen.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Evgen on 02.03.2016.
 */
public class tri extends dva {
    Button but3;
    TextView tv3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tre);

        tv3 = (TextView) findViewById(R.id.tv3);
        but3 = (Button) findViewById(R.id.but3);
        but3.setOnClickListener(this);

    }
    @Override

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but3:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}

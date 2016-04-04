package com.example.evgen.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity  extends Activity implements OnClickListener  {
    TextView tv;
    Button bt1,bt2,bt3,bt4;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);

    }
        @Override

            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.bt1:
                        Intent intent = new Intent(this, dva.class);
                        startActivity(intent);
                        break;
                    case R.id.bt2:
                        Intent intent2 = new Intent(this, mat1.class);
                        startActivity(intent2);
                        break;
                    case R.id.bt3:
                        Intent intent3 = new Intent(this, che1.class);
                        startActivity(intent3);
                        break;
                    case R.id.bt4:
                        Intent intent4 = new Intent(this, lit1.class);
                        startActivity(intent4);
                        break;
                    default:
                        break;
                }
            }
        }


    // присвоим обработчик кнопке OK (btnOk)
   // btn.setOnClickListener(ocl);

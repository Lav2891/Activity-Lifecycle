package com.example.ashwin.activitylifecycle;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("END","CREATE");

        t1 = (TextView)findViewById(R.id.tv1);
        t1.setText("CREATED");

        Toast.makeText(getApplicationContext(),"CREATED",Toast.LENGTH_SHORT).show();
    }

    @Override

    protected void onRestart(){

        super.onRestart();//call to restart after onStop
        t2=(TextView)findViewById(R.id.tv2);
        t2.setText("RESTART");

        Toast.makeText(getApplicationContext(),"RESTARTED",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onStart() {

        super.onStart();//soon be visible

        Log.d("END","START");
        t3=(TextView)findViewById(R.id.tv3);
        t3.setText("START");

        Toast.makeText(getApplicationContext(),"STARTED",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onResume() {

        super.onResume();
        t4=(TextView)findViewById(R.id.tv4);
        t4.setText("RESUME");

        Toast.makeText(getApplicationContext(),"RESUME",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onPause() {

        super.onPause();
        t5=(TextView)findViewById(R.id.tv5);
        t5.setText("PAUS");

        Toast.makeText(getApplicationContext(),"PAUSE",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onStop() {

        super.onStop();
        t6=(TextView)findViewById(R.id.tv6);
        t6.setText("STOP");

        Toast.makeText(getApplicationContext(),"STOPPED",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onDestroy() {

        super.onDestroy();
        t7=(TextView)findViewById(R.id.tv7);
        t7.setText("DESTROY");

        Log.d("END","DESTROYED");

        Toast.makeText(getApplicationContext(),"DESTROYED",Toast.LENGTH_SHORT).show();

    }

}

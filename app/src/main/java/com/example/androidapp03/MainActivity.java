package com.example.androidapp03;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        LayoutInflater i = getLayoutInflater();
        View child =  i.inflate(R.layout.view_my, null);// layout from view_my
        
        Log.d("Debug","Child Ref " + child.toString());
        
        LinearLayout layout = (LinearLayout) findViewById(R.id.ll);//Container
        
        Log.d("Debug"," Layout Ref "+layout.toString());
        
        layout.addView(child);
       
      
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

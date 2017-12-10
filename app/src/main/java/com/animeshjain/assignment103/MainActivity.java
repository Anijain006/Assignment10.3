package com.animeshjain.assignment103;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        starting the Fragment
        getFragmentManager().beginTransaction().add(R.id.frameLayout, new CustomListFragment()).commit();
    }
}

package com.develop.mauriciodinki.tvify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.develop.mauriciodinki.tvify.ui.ShowsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_container, new ShowsFragment())
                    .commit();
        }
    }
}

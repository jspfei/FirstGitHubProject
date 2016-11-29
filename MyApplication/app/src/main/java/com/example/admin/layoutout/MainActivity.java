package com.example.admin.layoutout;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private Fragment mCurrFragment;

    private int currSpinnerSelection  = 0;

    private ArrayAdapter<CharSequence> mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = ArrayAdapter.createFromResource(this,R.array.spinner_options,android.R.layout.simple_spinner_item);
        mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        switch (currSpinnerSelection){
            case 0:mCurrFragment = new ChartsFragment();break;
            case 1:mCurrFragment = new ChartsFragment();break;
        }

        getSupportFragmentManager().beginTransaction().add(R.id.container,mCurrFragment).commit();
    }
}

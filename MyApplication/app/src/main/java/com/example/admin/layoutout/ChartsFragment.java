package com.example.admin.layoutout;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by admin on 2016/11/25.
 */

public class ChartsFragment extends Fragment {

     @Override
    public void onCreate(Bundle savedInstanceState){
         super.onCreate(savedInstanceState);
         setHasOptionsMenu(true);
     }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle saveInstanceState){

        View layout = inflater.inflate(R.layout.charts,container,false);
        ((AppCompatActivity) getActivity()).setSupportActionBar(
                (Toolbar) layout.findViewById(R.id.toolbar));
        ((TextView) layout.findViewById(R.id.title)).setTypeface(
                Typeface.createFromAsset(getContext().getAssets(),"Ponsi-Regular.otf"));


        return  layout;
    }
}

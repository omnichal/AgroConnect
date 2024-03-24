package com.example.agroconnect.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.agroconnect.R;


public class CreateAccountFragment extends Fragment{
         @Override
         public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
             Spinner usertype = (Spinner) usertype.findViewById();
             ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                     R.array.usertype,
                     android.R.layout.simple_spinner_item
             );
             adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
             usertype.setAdapter(adapter);
        }



    public CreateAccountFragment() {
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_account, container, false);
    }

}
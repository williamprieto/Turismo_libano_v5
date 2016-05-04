package com.prieto.william.turismo5;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment3 extends Fragment {

    public Fragment3() {
        // Required empty public constructor
    }

    private Button bmapini;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View imagen1 = inflater.inflate(R.layout.fragment_fragment3, container, false);

       bmapini = (Button) imagen1.findViewById(R.id.bmapini);
       bmapini.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int flag=1;
               Intent i= new Intent(Fragment3.this.getActivity(),MapsActivity.class);
               i.putExtra("op",flag);
               startActivity(i);
           }
       });
       return imagen1;
    }
}

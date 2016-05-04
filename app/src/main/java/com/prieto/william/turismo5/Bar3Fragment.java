package com.prieto.william.turismo5;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Bar3Fragment extends Fragment {


    public Bar3Fragment() {
        // Required empty public constructor
    }
    private Button bmapalo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View imagen1 =  inflater.inflate(R.layout.fragment_bar3, container, false);


        // Inflate the layout for this fragment

        bmapalo = (Button) imagen1.findViewById(R.id.bmapalo);
        bmapalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int flag=10;
                Intent i= new Intent(Bar3Fragment.this.getActivity(),MapsActivity.class);
                i.putExtra("op",flag);
                startActivity(i);
            }
        });
        return imagen1;
    }

}

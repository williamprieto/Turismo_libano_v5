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
public class Bar2Fragment extends Fragment {


    public Bar2Fragment() {
        // Required empty public constructor
    }

    private Button bmappent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View imagen1 =  inflater.inflate(R.layout.fragment_bar2, container, false);


        // Inflate the layout for this fragment

        bmappent = (Button) imagen1.findViewById(R.id.bmappent);
        bmappent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int flag=9;
                Intent i= new Intent(Bar2Fragment.this.getActivity(),MapsActivity.class);
                i.putExtra("op",flag);
                startActivity(i);
            }
        });
        return imagen1;
    }

}

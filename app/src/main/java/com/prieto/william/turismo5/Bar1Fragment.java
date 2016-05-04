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
public class Bar1Fragment extends Fragment {


    public Bar1Fragment() {
        // Required empty public constructor
    }

    private Button bmapnegra;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View imagen1 = inflater.inflate(R.layout.fragment_bar1, container, false);


        // Inflate the layout for this fragment

        bmapnegra = (Button) imagen1.findViewById(R.id.bmapnegra);
        bmapnegra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int flag=8;
                Intent i= new Intent(Bar1Fragment.this.getActivity(),MapsActivity.class);
                i.putExtra("op",flag);
                startActivity(i);
            }
        });
        return imagen1;
    }

}

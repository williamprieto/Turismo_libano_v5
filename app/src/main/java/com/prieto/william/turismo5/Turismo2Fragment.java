package com.prieto.william.turismo5;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

//import android.app.Fragment;//es necesario q se quite en main 3 y se ponga en main 2


/**
 * A simple {@link Fragment} subclass.
 */
public class Turismo2Fragment extends Fragment {


    public Turismo2Fragment() {
        // Required empty public constructor
    }

    private Button bmapfinca;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View imagen1 = inflater.inflate(R.layout.fragment_turismo2, container, false);

        // Inflate the layout for this fragment

        bmapfinca = (Button) imagen1.findViewById(R.id.bmapfinca);
        bmapfinca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int flag=6;
                Intent i= new Intent(Turismo2Fragment.this.getActivity(),MapsActivity.class);
                i.putExtra("op",flag);
                startActivity(i);
            }
        });
        return imagen1;
    }

}

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
public class Hotel3Fragment extends Fragment {


    public Hotel3Fragment() {
        // Required empty public constructor
    }
    private Button bmapcont;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View imagen1 =  inflater.inflate(R.layout.fragment_hotel3, container, false);

        // Inflate the layout for this fragment

        bmapcont = (Button) imagen1.findViewById(R.id.bmapcont);
        bmapcont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int flag=4;
                Intent i= new Intent(Hotel3Fragment.this.getActivity(),MapsActivity.class);
                i.putExtra("op",flag);
                startActivity(i);
            }
        });
        return imagen1;
    }
}

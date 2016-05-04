package com.prieto.william.turismo5;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private UiSettings misettng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        misettng=mMap.getUiSettings();//para agregar los botones de zoom
        misettng.setZoomControlsEnabled(true);

        int flag = 0;
        Intent i = getIntent();
        int flag2 = i.getIntExtra("op", flag);
        switch (flag2) {
            case 1:
                // INICIO
                LatLng libanomap = new LatLng(4.920956, -75.063129);
                //mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                mMap.addMarker(new MarkerOptions().position(libanomap).title("Marker in Libano"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((libanomap), 9));
                break;
            case 2:
                // HOTEL PANTAGORA
                LatLng pantamap = new LatLng(4.921545, -75.059128);
                mMap.addMarker(new MarkerOptions().position(pantamap).title("Hotel pantagora"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((pantamap), 17));
                break;
            case 3:
                // HOTEL CALLE REAL
                LatLng callemap = new LatLng(4.922617, -75.065982);
                mMap.addMarker(new MarkerOptions().position(callemap).title("Hotel Calle real"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((callemap), 17));
                break;
            case 4:
                // HOTEL CONTINENTAL
                LatLng contimap = new LatLng(4.921286, -75.062626);
                mMap.addMarker(new MarkerOptions().position(contimap).title("Hotel Continental"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((contimap), 17));
                break;
            case 5:
                // NEVADO DEL RUIZ
                LatLng nevmap = new LatLng(4.810278, -75.370674);
                mMap.addMarker(new MarkerOptions().position(nevmap).title("Nevado del Ruiz"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((nevmap), 10));
                break;
            case 6:
                // FINCA CAMPESTRE
                LatLng finmap = new LatLng(4.923982, -75.070157);
                mMap.addMarker(new MarkerOptions().position(finmap).title("Finca Campestre"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((finmap), 15));
                break;
            case 7:
                // CATEDRAL
                LatLng catmap = new LatLng(4.923581, -75.065023);
                mMap.addMarker(new MarkerOptions().position(catmap).title("Catedral"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((catmap), 17));
                break;
            case 8:
                // NEGRA TOMASA
                LatLng negramap = new LatLng(4.922801, -75.064153);
                mMap.addMarker(new MarkerOptions().position(negramap).title("Negra Tomasa"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((negramap), 17));
                break;
            case 9:
                //PENT HOUSE
                LatLng pentmap = new LatLng(4.922422, -75.064606);
                mMap.addMarker(new MarkerOptions().position(pentmap).title("Pent House"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((pentmap), 17));
                break;
            case 10:
                //PALO DE ANGEL
                LatLng angelmap = new LatLng(4.922446, -75.064858);
                mMap.addMarker(new MarkerOptions().position(angelmap).title("Palo de angel"));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom((angelmap), 17));
                break;


        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}

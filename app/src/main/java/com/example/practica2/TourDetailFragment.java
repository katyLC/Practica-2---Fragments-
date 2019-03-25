package com.example.practica2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TourDetailFragment extends Fragment {
    TextView tvDescripcion;
    TextView tvPrecio;
    TextView tvEstadia;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tour_detail_fragment, viewGroup, false);

        tvDescripcion = view.findViewById(R.id.tv_descripcion);
        tvPrecio = view.findViewById(R.id.tv_precio);
        tvEstadia = view.findViewById(R.id.tv_estadia);

        return view;
    }
    public void display(Tour tour){
        tvDescripcion.setText(tour.descripcion);
        tvPrecio.setText(String.valueOf(tour.precio));
        tvEstadia.setText(tour.estadia);
    }
}

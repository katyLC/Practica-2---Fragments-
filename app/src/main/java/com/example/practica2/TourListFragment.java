package com.example.practica2;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TourListFragment extends ListFragment {
    List<Tour> items = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tour_list_fragment, viewGroup, false);
        ArrayAdapter<Tour> adapter = new ArrayAdapter<>(getActivity(),
            android.R.layout.simple_list_item_activated_1, items);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        TourDetailFragment txt = (TourDetailFragment) getFragmentManager().findFragmentById(R.id.tour_detail_fragment);
        txt.display(items.get(position));
    }

    public TourListFragment() {
        items.add(new Tour("1", "Tour Exclusivo", 100, "Lunes"));
        items.add(new Tour("2", "Tour Presidencial", 150, "Martes"));
        items.add(new Tour("3", "Tour Imperial", 120, "Jueves"));
        items.add(new Tour("4", "Expreso", 80, "Miercoles"));
    }
}

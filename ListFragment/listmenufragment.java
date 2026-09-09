package com.example.listfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listmenufragment extends ListFragment {

    String[] items = {
            "Tea",
            "Coffee",
            "Milk",
            "Juice",
            "Green Tea"
    };

    String[] prices = {
            "Rs 10",
            "Rs 15",
            "Rs 20",
            "Rs 30",
            "Rs 10"
    };

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.activity_listmenufragment,
                container,
                false
        );

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        items
                );

        setListAdapter(adapter);

        return view;
    }

    @Override
    public void onListItemClick(
            ListView l,
            View v,
            int position,
            long id) {

        detailsfragment details =
                (detailsfragment) getFragmentManager()
                        .findFragmentById(R.id.fragment2);

        details.change(
                "Item: " + items[position],
                "Price: " + prices[position]
        );

package com.example.listfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class detailsfragment extends Fragment {

    TextView item;
    TextView price;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.activity_detailsfragment,
                container,
                false
        );

        item = view.findViewById(R.id.item);
        price = view.findViewById(R.id.price);

        return view;
    }

    public void change(String items, String prices) {

        item.setText(items);
        price.setText(prices);
    }
}

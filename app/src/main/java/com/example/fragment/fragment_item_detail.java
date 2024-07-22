package com.example.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class ItemDetailFragment extends Fragment {

    public ItemDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_detail, container, false);
        TextView detailTextView = view.findViewById(R.id.item_detail);

        if (getArguments() != null) {
            String selectedItem = getArguments().getString("selectedItem");
            detailTextView.setText(selectedItem);
        }

        return view;
    }
}

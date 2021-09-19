package com.chemi.chemiapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInorgchem extends Fragment {

    public FragmentInorgchem() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_inorgchem, container, false);
        Button btn_km2 = (Button)view.findViewById(R.id.btn_km2);
        btn_km2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Km2Activity.class);
                startActivity(intent);
            }
        });

        return view;

    }
}



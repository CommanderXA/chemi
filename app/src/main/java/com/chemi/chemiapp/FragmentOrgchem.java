package com.chemi.chemiapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;



/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOrgchem extends Fragment {

    public FragmentOrgchem() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_orgchem, container, false);

        Button btn_spt = view.findViewById(R.id.btn_km1);
        btn_spt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Km1Activity.class);
                startActivity(intent);
            }
        });

        return view;

    }
}

package com.elvin.multiplefragmentdemo.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.elvin.multiplefragmentdemo.Operation;
import com.elvin.multiplefragmentdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment implements View.OnClickListener {

    private EditText etAutomorphicNumber;
    private Button btnCheckAutomorphic;


    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        this.etAutomorphicNumber = view.findViewById(R.id.etAutomorphicNumber);
        this.btnCheckAutomorphic = view.findViewById(R.id.btnCheckAutomorphic);
        this.btnCheckAutomorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(this.etAutomorphicNumber.getText().toString());
        Toast.makeText(getActivity(), String.format("%d is %s", number, Operation.automorphicNumber(number) ? "Automorphic" : "Not Automorphic"), Toast.LENGTH_SHORT).show();
    }
}

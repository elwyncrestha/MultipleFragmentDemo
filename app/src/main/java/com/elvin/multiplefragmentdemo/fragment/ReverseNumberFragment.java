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
public class ReverseNumberFragment extends Fragment implements View.OnClickListener {

    private EditText etReversingNumber;
    private Button btnReverse;

    public ReverseNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_number, container, false);
        this.etReversingNumber = view.findViewById(R.id.etReversingNumber);
        this.btnReverse = view.findViewById(R.id.btnReverse);
        this.btnReverse.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(this.etReversingNumber.getText().toString());
        Toast.makeText(getActivity(), String.format("Reverse of %d is %d", number, Operation.reverseNumber(number)), Toast.LENGTH_SHORT).show();

    }
}

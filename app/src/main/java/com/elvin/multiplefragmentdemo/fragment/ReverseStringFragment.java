package com.elvin.multiplefragmentdemo.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.elvin.multiplefragmentdemo.Operation;
import com.elvin.multiplefragmentdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseStringFragment extends Fragment implements View.OnClickListener {

    private EditText etReversingString;
    private Button btnReverseStringValue;

    public ReverseStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_string, container, false);
        this.etReversingString = view.findViewById(R.id.etReversingString);
        this.btnReverseStringValue = view.findViewById(R.id.btnReverseStringValue);
        this.btnReverseStringValue.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        String string = this.etReversingString.getText().toString();
        Toast.makeText(getActivity(), String.format("Reverse of %s is %s", string, Operation.reverseString(string)), Toast.LENGTH_SHORT).show();

    }
}

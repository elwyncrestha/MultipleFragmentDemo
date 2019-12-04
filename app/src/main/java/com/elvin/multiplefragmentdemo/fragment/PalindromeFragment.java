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
public class PalindromeFragment extends Fragment implements View.OnClickListener {

    private EditText etPalindromeNumber;
    private Button btnCheckPalindrome;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        this.etPalindromeNumber = view.findViewById(R.id.etPalindromeNumber);
        this.btnCheckPalindrome = view.findViewById(R.id.btnCheckPalindrome);
        this.btnCheckPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(this.etPalindromeNumber.getText().toString());
        Toast.makeText(getActivity(), String.format("%d is %s", number, Operation.palindromeNumber(number) ? "Palindrome" : "Not Palindrome"), Toast.LENGTH_SHORT).show();
    }
}

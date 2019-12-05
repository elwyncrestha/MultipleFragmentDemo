package com.elvin.multiplefragmentdemo.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elvin.multiplefragmentdemo.R;
import com.elvin.multiplefragmentdemo.adapter.ContactAdapter;
import com.elvin.multiplefragmentdemo.model.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    private RecyclerView recyclerView;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        this.recyclerView = view.findViewById(R.id.recyclerView);

        List<Contact> contacts = new ArrayList<Contact>() {
            {
                add(new Contact("Image 1", "Phone Number 1", R.drawable.one));
                add(new Contact("Image 2", "Phone Number 2", R.drawable.two));
                add(new Contact("Image 3", "Phone Number 3", R.drawable.three));
            }
        };

        ContactAdapter contactAdapter = new ContactAdapter(getContext(), contacts);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

}

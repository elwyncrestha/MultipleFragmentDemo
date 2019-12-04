package com.elvin.multiplefragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.elvin.multiplefragmentdemo.fragment.AutomorphicFragment;
import com.elvin.multiplefragmentdemo.fragment.CircleFragment;
import com.elvin.multiplefragmentdemo.fragment.PalindromeFragment;
import com.elvin.multiplefragmentdemo.fragment.ReverseNumberFragment;
import com.elvin.multiplefragmentdemo.fragment.ReverseStringFragment;
import com.elvin.multiplefragmentdemo.fragment.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSum, btnCircle, btnReverseNumber, btnPalindrome, btnAutomorphic, btnReverseString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bindControlsAndListeners();
    }

    private void bindControlsAndListeners() {
        this.btnSum = findViewById(R.id.btnSum);
        this.btnSum.setOnClickListener(this);

        this.btnCircle = findViewById(R.id.btnCircle);
        this.btnCircle.setOnClickListener(this);

        this.btnReverseNumber = findViewById(R.id.btnReverseNumber);
        this.btnReverseNumber.setOnClickListener(this);

        this.btnPalindrome = findViewById(R.id.btnPalindrome);
        this.btnPalindrome.setOnClickListener(this);

        this.btnAutomorphic = findViewById(R.id.btnAutomorphic);
        this.btnAutomorphic.setOnClickListener(this);

        this.btnReverseString = findViewById(R.id.btnReverseString);
        this.btnReverseString.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = null;

        switch (v.getId()) {
            case R.id.btnSum:
                fragment = new SumFragment();
                break;
            case R.id.btnCircle:
                fragment = new CircleFragment();
                break;
            case R.id.btnReverseNumber:
                fragment = new ReverseNumberFragment();
                break;
            case R.id.btnPalindrome:
                fragment = new PalindromeFragment();
                break;
            case R.id.btnAutomorphic:
                fragment = new AutomorphicFragment();
                break;
            case R.id.btnReverseString:
                fragment = new ReverseStringFragment();
                break;
        }

        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }
}

package com.example.fragmenttest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {
    private Button btnNext;
    private EditText etValue;
    private String some;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etValue = view.findViewById(R.id.et_etValue);
        btnNext = view.findViewById(R.id.btn_first_btn);

        btnNext.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            some = etValue.getText().toString();
            bundle.putString("res",some);
            Fragment fragment = new Fragment2();
            fragment.setArguments(bundle);
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,
                    fragment).addToBackStack(null).commit();


        });
    }
}
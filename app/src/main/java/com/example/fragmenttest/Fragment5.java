package com.example.fragmenttest;

import android.nfc.TagLostException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Fragment5 extends Fragment {
    private TextView result;
    private Button btnRes;
    private String restt;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        restt = getArguments().getString("f3");
        return inflater.inflate(R.layout.fragment_5, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        result = view.findViewById(R.id.tt_4);
        btnRes = view.findViewById(R.id.fifth_btn);
        btnRes.setOnClickListener(v -> {
            result.setText(restt);


        });

    }
}
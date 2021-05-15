package com.example.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    private Button btn2;
    private String fr1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fr1 = getArguments().getString("res");
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn2 = view.findViewById(R.id.second_btn);
        btn2.setOnClickListener(v -> {
            Bundle bundle = new Bundle();

            Fragment fragment = new Fragment3();
            fragment.setArguments(bundle);
            bundle.putString("f1",fr1);
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,
                    fragment).addToBackStack(null).commit();


        });
    }
}
package com.example.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Fragment4 extends Fragment {
        private Button btn4;
        private String fr3;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fr3 = getArguments().getString("f2");
        return inflater.inflate(R.layout.fragment_4,container,false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn4 = view.findViewById(R.id.fourth_btn);
        Bundle bundle = new Bundle();
        bundle.putString("f3",fr3);
        Fragment fragment = new Fragment5();
        fragment.setArguments(bundle);

        btn4.setOnClickListener(v -> {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,
                    fragment).addToBackStack(null).commit();


        });
    }
}
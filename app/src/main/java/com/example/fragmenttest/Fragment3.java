package com.example.fragmenttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {
private  String fr2;

    private Button btn3;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fr2 = getArguments().getString("f1");
        return inflater.inflate(R.layout.fragment_3,container,false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn3 = view.findViewById(R.id.third_btn);
        btn3.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString("f2",fr2);
            Fragment fragment = new Fragment4();
            fragment.setArguments(bundle);

            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,
                    fragment).addToBackStack(null).commit();


        });
    }
}
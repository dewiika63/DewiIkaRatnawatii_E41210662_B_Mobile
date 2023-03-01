package com.example.minggu4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    View view;
    Button secondButton;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        //inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        //get the references of buttoon
        secondButton= view.findViewById(R.id.secondButton);
        //perform
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display a
                Toast.makeText(getActivity(), "second Fragment", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}

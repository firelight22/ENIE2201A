package com.quentinrouet.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ButtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button buttonGo = view.findViewById(R.id.buttonGoTo2ndFragment);
        buttonGo.setOnClickListener(
                v-> Navigation
                        .findNavController(view)
                        .navigate(R.id.action_buttonFragment_to_cibleFragment));
        //buttonGo.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_buttonFragment_to_cibleFragment));

    }
}
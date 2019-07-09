package com.example.tabbaranimgif.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.example.tabbaranimgif.R;

public class ProfileFragment extends Fragment {

    Animation slideLeft;
    RelativeLayout parentlayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_profile, null);

        parentlayout = rootView.findViewById(R.id.parentlayout);
        slideLeft = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_left);
        parentlayout.startAnimation(slideLeft);

        return rootView;
    }
}

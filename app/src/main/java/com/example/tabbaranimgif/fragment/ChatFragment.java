package com.example.tabbaranimgif.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.example.tabbaranimgif.R;
import com.example.tabbaranimgif.adapter.ChatAdapter;
import com.example.tabbaranimgif.generator.ChatGenerator;
import com.example.tabbaranimgif.model.ChatBO;

import java.util.List;

public class ChatFragment extends Fragment {

    List<ChatBO> userBOList;
    ChatAdapter userAdapter;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_chat, null);

        recyclerView = rootView.findViewById(R.id.chat_recyclerview);
        setUserAdapter();

        return rootView;
    }

    private void setUserAdapter() {

        userBOList = ChatGenerator.chatBOList();

        userAdapter = new ChatAdapter(getActivity(), userBOList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false);
        linearLayoutManager.scrollToPosition(0);
        int resId = R.anim.layout_animation_slide_right;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getActivity(), resId);
        recyclerView.setLayoutAnimation(animation);

        recyclerView.setAdapter(userAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}

package com.example.tabbaranimgif.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.tabbaranimgif.R;
import com.example.tabbaranimgif.model.ChatBO;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder>{

    private Context context;
    private List<ChatBO> chatBOList;

    public ChatAdapter(Context context, List<ChatBO> chatBOList) {
        this.context = context;
        this.chatBOList = chatBOList;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.screen_list, null);
        ChatViewHolder rcv = new ChatViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {

        holder.txtOne.setText(chatBOList.get(position).getName());
        holder.txtTwo.setText(chatBOList.get(position).getUsername());

    }

    @Override
    public int getItemCount() {
        return chatBOList.size();
    }

    class ChatViewHolder extends RecyclerView.ViewHolder{

        TextView txtOne, txtTwo;

        public ChatViewHolder(View itemView) {
            super(itemView);

            txtOne = (TextView) itemView.findViewById(R.id.txtOne);
            txtTwo = (TextView) itemView.findViewById(R.id.txtTwo);

        }
    }
}

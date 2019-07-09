package com.example.tabbaranimgif.generator;

import com.example.tabbaranimgif.model.ChatBO;

import java.util.ArrayList;
import java.util.List;

public class ChatGenerator {

    public static List<ChatBO> chatBOList(){
        List<ChatBO> chatBOList = new ArrayList<ChatBO>();

        for(int i = 0;i<10;i++){
            ChatBO chatBO = new ChatBO();
            chatBO.setId(i+"");
            chatBO.setName("Prince Phelps");
            chatBO.setUsername("prince484");
            chatBOList.add(chatBO);

        }
        return chatBOList;

    }
}

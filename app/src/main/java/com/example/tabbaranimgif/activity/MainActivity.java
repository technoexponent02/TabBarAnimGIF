package com.example.tabbaranimgif.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.tabbaranimgif.R;
import com.example.tabbaranimgif.animation.FloatingActionMenu;
import com.example.tabbaranimgif.fragment.ChatFragment;
import com.example.tabbaranimgif.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    ProfileFragment profileFragment;
    ChatFragment chatFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionMenu menu = (FloatingActionMenu) findViewById(R.id.floatingMenu);

        profileFragment = new ProfileFragment();
        chatFragment = new ChatFragment();

        replaceFragment(profileFragment);

        menu.setClickEvent(new FloatingActionMenu.ClickEvent() {
            @Override
            public void onClick(int index) {
                Log.e("MainActivity", String.valueOf(index));
                if (index == 0){
                }else if (index == 1){
                    replaceFragment(profileFragment);
                }else if (index == 2){
                    replaceFragment(chatFragment);
                }else if (index == 3){
                }
            }
        });
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }
}

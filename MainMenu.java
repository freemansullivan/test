MainMenu.java


package com.videostreaming.player;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends Activity {

    Button btn_videoViewDemo1;
    Button btn_videoViewDemo2;
    Button btn_MediaPlayerDemo1;    
    Button btn_MediaPlayerDemo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btn_videoViewDemo1 = (Button)findViewById(R.id.btn_videoViewDemo1);
        btn_videoViewDemo2 = (Button)findViewById(R.id.btn_videoViewDemo2);
        btn_MediaPlayerDemo1 = (Button)findViewById(R.id.btn_MediaPlayerDemo1);
        btn_MediaPlayerDemo2 = (Button)findViewById(R.id.btn_MediaPlayerDemo2);

        btn_videoViewDemo1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent Navigation1 = new Intent(MainMenu.this,streamplayer.class);
                Navigation1.putExtra("video",1);
                startActivity(Navigation1);             
            }
        });

        btn_videoViewDemo2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent Navigation1 = new Intent(MainMenu.this,streamplayer.class);
                Navigation1.putExtra("video",2);
                startActivity(Navigation1);
            }
        });

        btn_MediaPlayerDemo1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent Navigation1 = new Intent(MainMenu.this,MediaPlayerDemo_Video.class);
                Navigation1.putExtra("video",1);
                startActivity(Navigation1);             
            }
        });

        btn_MediaPlayerDemo2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent Navigation1 = new Intent(MainMenu.this,MediaPlayerDemo_Video.class);
                Navigation1.putExtra("video",2);
                startActivity(Navigation1);             
            }
        });     
    }
}

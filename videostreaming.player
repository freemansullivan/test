package com.videostreaming.player;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class streamplayer extends Activity {
    /** Called when the activity is first created. */

     private String path1 = "http://podcast.20min-tv.ch/podcast/20min/199733.mp4";
     //private String path2 = "http://podcast.20min-tv.ch/podcast/20min/199752.mp4";
     private String path2 = "http://podcast.20min-tv.ch/podcast/20min/199693.mp4";
     private String path = "";

     //// Method 1 - Default Method
     private VideoView mVideoView;

     private Bundle bdlReceivedData = null;
     private Intent self = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try
        {
            setContentView(R.layout.videoview);
            mVideoView = (VideoView) findViewById(R.id.surface_view);

            self = this.getIntent();
            bdlReceivedData = self.getExtras();

            if (bdlReceivedData != null && bdlReceivedData.getInt("video") > 0)
            {
                if (bdlReceivedData.getInt("video") == 1)
                {
                    Toast.makeText(streamplayer.this,"playing Video 1", Toast.LENGTH_SHORT);
                    path = path1;
                }
                else if (bdlReceivedData.getInt("video") == 2)
                {
                    Toast.makeText(streamplayer.this,"playing Video 2", Toast.LENGTH_SHORT);
                    path = path2;
                }

                /*
                 * Alternatively,for streaming media you can use
                 * mVideoView.setVideoURI(Uri.parse(URLstring));
                 */

                //mVideoView.setVideoPath(path1);
                ///ELSE
                mVideoView.setVideoURI(Uri.parse(path));                
                mVideoView.setMediaController(new MediaController(this));
                mVideoView.requestFocus();              
                mVideoView.postInvalidateDelayed(100);        
                mVideoView.start();

            }

        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            Toast.makeText(streamplayer.this,"Error Occured:- " + e.getMessage(),Toast.LENGTH_SHORT).show();
        } 
    }
}

package com.example.playvideo;

import android.support.v7.app.ActionBarActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 String LINK = "http://daily3gp.com/vids/747.3gp";
		  VideoView mVideoView  = (VideoView) findViewById(R.id.VideoView);
		  MediaController mc = new MediaController(this);
		  mc.setAnchorView(mVideoView);
		  mc.setMediaPlayer(mVideoView);
		  Uri video = Uri.parse(LINK);
		  mVideoView.setMediaController(mc);
		  mVideoView.setVideoURI(video);
		  mVideoView.start();
	}
}

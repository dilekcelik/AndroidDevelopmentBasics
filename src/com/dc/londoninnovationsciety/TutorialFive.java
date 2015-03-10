
//40- MediaControllers controls MediaPlayers

package com.dc.londoninnovationsciety;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TutorialFive extends Activity{
	
	VideoView vid;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial5);
		vid=(VideoView) findViewById(R.id.videoView1);
		String urlpath="android.resource://" + getPackageName() + "/" + R.raw.videof;
		vid.setVideoURI(Uri.parse(urlpath));
		vid.start();
		
		//MediController
		MediaController mc= new MediaController(this);
		mc.setMediaPlayer(vid);
		
		vid.setMediaController(mc);
		
		
	}

	
	
}

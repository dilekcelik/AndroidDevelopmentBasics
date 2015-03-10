package com.dc.londoninnovationsciety;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//ButtonSound
		final MediaPlayer buttonSound = MediaPlayer.create(menu.this, R.raw.button_click);
		
		Button tut1 = (Button) findViewById(R.id.tutorial1);
		tut1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				
				buttonSound.start();
				startActivity(new Intent("my.first.activity.TUTORIALONE"));
			}
		}
			
				);
		
		Button tut2 = (Button) findViewById(R.id.tutorial2);
		tut2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent("my.first.activity.TUTORIALTWO"));
			}
		}
		
			
				);
		Button tut3 = (Button) findViewById(R.id.tutorial3);
		tut3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent("my.first.activity.TUTORIALTHREE"));
			}
		}
				);
		
		Button tut4 = (Button) findViewById(R.id.tutorial4);
		tut4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent("my.first.activity.TUTORIALFOUR"));
			}
		}			
				);
		
		Button tut5 = (Button) findViewById(R.id.tutorial5);
		tut5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent("my.first.activity.SURFACEVIEWEXAMPLE"));
			}
		}			
				);
		
		Button tut6 = (Button) findViewById(R.id.tutorial6);
		tut6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				buttonSound.start();
				startActivity(new Intent("my.first.activity.TUTORIALFIVE"));
			}
		}			
				);
	}

	@Override
	protected void onPause() {
		Toast andEggs = Toast.makeText(menu.this, "This is a Toast", Toast.LENGTH_LONG);
		andEggs.show();
		
		super.onPause();
	}

	public boolean onCreateOptionsMenu(Menu menu){
		super.onCreateOptionsMenu(menu);
		MenuInflater awesome= getMenuInflater();
		awesome.inflate(R.menu.main_menu, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()){
		case R.id.menuSweet:
			startActivity(new Intent("my.first.activity.SWEET"));
			return true;
		case R.id.menuToast:
			//set up in next tutorial
			return true;
		}
		
		return false;
	}

}

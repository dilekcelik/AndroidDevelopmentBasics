package com.dc.londoninnovationsciety;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class TutorialThree extends Activity implements OnClickListener{
	
	ImageView display;
	int toPhone;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
				setContentView(R.layout.wallpaper);
		
		toPhone= R.drawable.back_bear;
		
		display=(ImageView) findViewById(R.id.IVdisplay);
		ImageView image1=(ImageView) findViewById(R.id.IVimage1);
		ImageView image2=(ImageView) findViewById(R.id.IVimage2);
		ImageView image3=(ImageView) findViewById(R.id.IVimage3);
		Button setWall = (Button) findViewById(R.id.BsetWallpaper);

		image1.setOnClickListener(this);
		image2.setOnClickListener(this);
		image3.setOnClickListener(this);
		setWall.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		case R.id.IVimage1:
			display.setImageResource(R.drawable.back_bear);
			toPhone= R.drawable.back_bear;
			break;
		case R.id.IVimage2:
			display.setImageResource(R.drawable.back_cat);
			toPhone= R.drawable.back_cat;
			break;
		case R.id.IVimage3:
			display.setImageResource(R.drawable.back_karts);
			toPhone= R.drawable.back_karts;
			break;
		case R.id.BsetWallpaper:
			InputStream yeaaaa = getResources().openRawResource(toPhone); 
			Bitmap whatever = BitmapFactory.decodeStream(yeaaaa);
			try{
				getApplicationContext().setWallpaper(whatever);
			} catch (IOException e) {e.printStackTrace();
			
			}
			
			break;
		
		
		}
		
	}

}

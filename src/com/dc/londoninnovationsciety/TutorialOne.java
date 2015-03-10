package com.dc.londoninnovationsciety;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TutorialOne extends ActionBarActivity implements OnCheckedChangeListener, android.widget.RadioGroup.OnCheckedChangeListener{

	TextView textOut;
	Button textIn;
	RadioGroup gravityG, styleG;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial1);
		textOut=(TextView) findViewById(R.id.tvChange);
		textIn=(Button) findViewById(R.id.button1);
		gravityG=(RadioGroup) findViewById(R.id.rgGravity);
		gravityG.setOnCheckedChangeListener(this);
		styleG=(RadioGroup) findViewById(R.id.rgStyle);
		styleG.setOnCheckedChangeListener(this);
		
		Button gen=(Button) findViewById(R.id.bGenerate);
		
		gen.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				textOut.setText(textIn.getText());
				
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		
		case R.id.rbLeft:
		textOut.setGravity(Gravity.LEFT);
		break;
		
		case R.id.rbCenter:
		textOut.setGravity(Gravity.CENTER);
		break;

		case R.id.rbRight:
		textOut.setGravity(Gravity.RIGHT);
		break; 
		
		case R.id.rbNormal:
			textOut.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL), Typeface.NORMAL);
			break;
		case R.id.rbItalic:
			textOut.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC), Typeface.ITALIC);
			break;
		case R.id.rbBold:
			textOut.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD), Typeface.BOLD);
			break;
			
		
		}
		
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		
	}
	
	

}
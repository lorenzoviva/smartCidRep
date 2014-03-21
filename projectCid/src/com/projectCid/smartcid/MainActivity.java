package com.projectCid.smartcid;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ZoomControls;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.projectCid.smartcid.MESSAGE";
	String username;
	ZoomControls zoom;
	ImageView img;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent intent = getIntent();
		username = intent.getStringExtra(EXTRA_MESSAGE);
		zoom = (ZoomControls) findViewById(R.id.zoomControls1);
		img = (ImageView) findViewById(R.id.imageView1);
		
        
        zoom.setOnZoomInClickListener(new OnClickListener() {
			
		@SuppressLint("NewApi") @Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			float x = img.getScaleX();
			float y = img.getScaleY();
			
			img.setScaleX((float) (x+1));
			img.setScaleY((float) (y+1));
			zoom.refreshDrawableState();
		}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void zoomin(View view){
		
	}
	public void zoomout(View view){
		
	}
}

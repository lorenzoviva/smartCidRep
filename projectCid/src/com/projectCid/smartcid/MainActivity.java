
package com.projectCid.smartcid;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ZoomControls;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.projectCid.smartcid.MESSAGE";

	String username;

	ZoomControls zoom;

	TextView textview;

	ImageView img;

	float aspectRatio = 1;// rapporto di dimensioni tra la grandezza
							// dell'immagine del modulo CID

	// originale (pieno schermo) e le dimensioni dell'immagine rappresentata
	// graficamente
	float vx = 0, vy = 0, x = 0, y = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent intent = getIntent();
		username = intent.getStringExtra(EXTRA_MESSAGE);
		zoom = (ZoomControls) findViewById(R.id.zoomControls1);
		img = (ImageView) findViewById(R.id.imageView1);
		textview = (TextView) findViewById(R.id.textView1);

		zoom.setOnZoomInClickListener(new OnClickListener() {

			public void onClick(View v) {

				textview.setText("zoom in : " + aspectRatio);
				aspectRatio += 0.1f;
				if (aspectRatio > 5) {
					aspectRatio = 5;
				}
				ScaleAnimation alpha = new ScaleAnimation(aspectRatio,
						aspectRatio, aspectRatio, aspectRatio);
				alpha.setDuration(0); // Make animation instant
				alpha.setFillAfter(true); // Tell it to persist after the
											// animation ends
				img.startAnimation(alpha);

			}
		});
		zoom.setOnZoomOutClickListener(new OnClickListener() {

			public void onClick(View v) {

				textview.setText("zoom out : " + aspectRatio);
				aspectRatio -= 0.1f;
				if (aspectRatio < 1) {
					aspectRatio = 1;
				}

				ScaleAnimation alpha = new ScaleAnimation(aspectRatio,
						aspectRatio, aspectRatio, aspectRatio);
				alpha.setDuration(0); // Make animation instant
				alpha.setFillAfter(true); // Tell it to persist after the
											// animation ends
				Log.i("mainActivity", "touch event");
				img.startAnimation(alpha);
			}
		});
		img.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				TranslateAnimation alpha;
				//textview.setText("event number :" + event.getActionIndex()+ "event coords:" + event.getX()+","+event.getY());
				if (event.getAction()==  MotionEvent.ACTION_DOWN){
					vx =  event.getX();
					vy =  event.getY();
					textview.setText("down vx : " + vx + " vy: " + vy + " x : " + x + " y: " + y);
				}else if(event.getAction() == MotionEvent.ACTION_UP){
					x = event.getX() - vx;
					y = event.getY() - vy;
					textview.setText("up vx : " + vx + " vy: " + vy + " x : " + x + " y: " + y);
					alpha = new TranslateAnimation(x, x, y, y);
					alpha.setDuration(0); // Make animation instant
					alpha.setFillAfter(true); // Tell it to persist after the
												// animation ends
					img.startAnimation(alpha);
				}else if(event.getAction() == MotionEvent.ACTION_MOVE){
					x = event.getX() - vx;
					y = event.getY() - vy;
					textview.setText("move vx : " + vx + " vy: " + vy + " x : " + x + " y: " + y);
					alpha = new TranslateAnimation(x, x, y, y);
					alpha.setDuration(0); // Make animation instant
					alpha.setFillAfter(true); // Tell it to persist after the
												// animation ends
					img.startAnimation(alpha);
				
				}
				return false;
			}
			
		});
		/*
		 * img.setOnDragListener(new OnDragListener(){
		 * 
		 * @Override public boolean onDrag(View v, DragEvent event) { // TODO
		 * Auto-generated method stub img.setX(img.getX()+event.getX());
		 * img.setY(img.getY()+event.getY()); return true; }
		 * 
		 * });
		 */
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void zoomin(View view) {

	}

	public void zoomout(View view) {

	}
}

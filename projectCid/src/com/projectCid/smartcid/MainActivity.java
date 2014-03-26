
package com.projectCid.smartcid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ZoomControls;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.projectCid.smartcid.MESSAGE";

	String username;

	ZoomControls zoom;

	ImageView img;

	float aspectRatio = 1;// rapporto di dimensioni tra la grandezza

	// dell'immagine del modulo CID
	// originale (pieno schermo) e le dimensioni dell'immagine rappresentata
	// graficamente
	float lastX = 0, lastY = 0, relativeX = 0, relativeY = 0, absoluteX = 0, absoluteY = 0;//variabili d'appoggio per la traslazione dell'immagine
	//lastX rappresenta la cordinata X dell'ultima posizione del cursore nell' occorrenza :
	//-lo schermo è stato appena toccato (vedi onTouch ACTION_DOWN)
	//-l'utente muove il dito sullo schermo (vedi onTouch ACTION_MOVE)
	//relativeX rappresenta la differenza tra le cordinate X dell'ultima posizione del cursore e quella corrente
	//absoluteX rappresenta la coordinata X della posizione assoluta dell'immagine nell'activity
		
	ScaleAnimation scale = new ScaleAnimation(1, 1, 1, 1);

	TranslateAnimation trans = new TranslateAnimation(0, 0, 0, 0);

	AnimationSet set;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Intent intent = getIntent();
		username = intent.getStringExtra(EXTRA_MESSAGE);
		zoom = (ZoomControls) findViewById(R.id.zoomControls1);
		img = (ImageView) findViewById(R.id.imageView1);
		

		zoom.setOnZoomInClickListener(new OnClickListener() {

			public void onClick(View v) {

				aspectRatio += 0.1f;
				if (aspectRatio > 5) {
					aspectRatio = 5;
				}

				muoviImmagine();

			}
		});
		zoom.setOnZoomOutClickListener(new OnClickListener() {

			public void onClick(View v) {

				aspectRatio -= 0.1f;
				if (aspectRatio < 1) {
					aspectRatio = 1;
				}

				muoviImmagine();

			}
		});
		img.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if (event.getAction() == MotionEvent.ACTION_DOWN) {
					lastX = event.getX();
					lastY = event.getY();

				} else if (event.getAction() == MotionEvent.ACTION_MOVE) {
					relativeX = (event.getX() - lastX);//la differenza è la X del vettore spostamento della traslazione relativa da applicare all'immagine
					relativeY = (event.getY() - lastY);
					absoluteX += relativeX;//sommo i vettori 
					absoluteY += relativeY;
					lastX = event.getX();
					lastY = event.getY();

				}
				else if (event.getAction() == MotionEvent.ACTION_UP) {

				}

				muoviImmagine();
				return true;
			}

		});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void muoviImmagine() {

		scale.setDuration(0);// imposta la durata dell'animazione di ridimensionamento a 0 millisecondi (istantanea)
		scale.setFillAfter(true); //impone all'animazione di ridimensionamento di perdurare anche dopo l'animazione grafica
		scale = new ScaleAnimation(aspectRatio, aspectRatio, aspectRatio, aspectRatio);//crea l'oggeto di ridimensionamento
		trans.setDuration(0);// imposta la durata dell'animazione di traslazione a 0 millisecondi (istantanea)
		trans.setFillAfter(true);//impone all'animazione di traslazione di perdurare anche dopo l'animazione grafica
		trans = new TranslateAnimation(absoluteX, absoluteX, absoluteY, absoluteY);//crea l'oggeto di traslazione
		set = new AnimationSet(true);//creo un oggetto che permette di eseguire in sequenza piu animazioni 
		set.addAnimation(new TranslateAnimation(-img.getWidth()/2,-img.getWidth()/2,-img.getHeight()/2,-img.getHeight()/2));//attraverso questa istruzione e quella subuto dopo la prossima, si ottiene uno zoom che punta il centro dell'immagine
		set.addAnimation(scale);//aggiunge nella sequenza l'animazione di ridimensionamento
		set.addAnimation(new TranslateAnimation(img.getWidth()/2,img.getWidth()/2,img.getHeight()/2,img.getHeight()/2));
		set.addAnimation(trans);//aggiunge nella sequenza l'animazione di ridimensionamento
		set.setFillAfter(true);//impone al set di animazioni di perdurare anche dopo l'animazione grafica
		img.startAnimation(set);
	}




}

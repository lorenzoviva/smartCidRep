
package com.projectCid.smartcid;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class LunchActivity extends Activity {

	private final int DURATA_SCHERMATA_AVVIO = 1000;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lunch);

		/*
		 * New Handler to start the Menu-Activity and close this Splash-Screen
		 * after some seconds.
		 */
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {

				/* Create an Intent that will start the Menu-Activity. */
				Intent mainIntent = new Intent(LunchActivity.this, LoginActivity.class);
				LunchActivity.this.startActivity(mainIntent);
				LunchActivity.this.finish();
			}
		}, DURATA_SCHERMATA_AVVIO);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lunch, menu);
		return true;
	}

}

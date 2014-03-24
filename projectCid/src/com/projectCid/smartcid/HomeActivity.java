
package com.projectCid.smartcid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class HomeActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.projectCid.smartcid.MESSAGE";

	String username;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		Intent intent = getIntent();
		username = intent.getStringExtra(EXTRA_MESSAGE);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	public void nuovoCid(View view) {

		Intent intent = new Intent(this, MainActivity.class);
		intent.putExtra(EXTRA_MESSAGE, username);
		startActivity(intent);
	}

}

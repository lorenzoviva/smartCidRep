
package com.projectCid.smartcid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.projectCid.smartcid.MESSAGE";

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	public void eseguiLogin(View view) {

		EditText editText1 = (EditText) findViewById(R.id.editText1);
		String username = editText1.getText().toString();
		EditText editText2 = (EditText) findViewById(R.id.editText2);
		String password = editText2.getText().toString();

		/*
		 * eseguire controllo qui
		 */

		Intent intent = new Intent(this, HomeActivity.class);
		intent.putExtra(EXTRA_MESSAGE, username);
		startActivity(intent);

	}

	public void saltaLogin(View view) {

		Intent intent = new Intent(this, HomeActivity.class);
		intent.putExtra(EXTRA_MESSAGE, "guest");
		startActivity(intent);
	}

}

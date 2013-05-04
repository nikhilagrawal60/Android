package com.example.app1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	private EditText userInput = null;
	private Button button = null;
	private TextView textView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button = (Button) findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				userInput = (EditText) findViewById(R.id.nikhil);

				String inputValue = userInput.getText().toString();

				Intent display = new Intent(MainActivity.this,
						DisplayActivity.class);
				display.putExtra("userValue", inputValue);
				MainActivity.this.startActivity(display);

			}
		});

	}

}

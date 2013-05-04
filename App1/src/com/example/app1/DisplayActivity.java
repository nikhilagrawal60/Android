package com.example.app1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display);

		Intent intent = getIntent();
		String value = intent.getStringExtra("userValue");

		TextView text = (TextView) findViewById(R.id.textView2);
		text.setText(value);

	}

}

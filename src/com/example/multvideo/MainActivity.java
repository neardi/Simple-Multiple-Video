package com.example.multvideo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

@SuppressLint("NewApi") public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		getFragmentManager().beginTransaction().add(R.id.fl_container1, new MainFragment("/sdcard/a.mp4")).commit();
		getFragmentManager().beginTransaction().add(R.id.fl_container2, new MainFragment("/sdcard/b.mp4")).commit();
		getFragmentManager().beginTransaction().add(R.id.fl_container3, new MainFragment("/sdcard/c.mp4")).commit();
		getFragmentManager().beginTransaction().add(R.id.fl_container4, new MainFragment("/sdcard/d.mp4")).commit();
	}

}

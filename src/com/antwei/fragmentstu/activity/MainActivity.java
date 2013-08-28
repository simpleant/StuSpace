package com.antwei.fragmentstu.activity;

import com.antwei.fragmentstu.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,                        

                  WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.fragment);
	}
}

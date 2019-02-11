package com.example.user.searchview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	private MySearchView searchView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(new SearchView(this));

//		setContentView(R.layout.activity_main);
//		searchView = (MySearchView)findViewById(R.id.sv);
//		searchView.setController(new Controller1());
		
	}
	
	public void start(View v){
		searchView.startAnimation();
	}
	public void reset(View v){
		searchView.resetAnimation();
	}

}

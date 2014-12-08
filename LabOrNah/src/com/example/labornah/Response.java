package com.example.labornah;

import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
//import android.content.*;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Response extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String message;
		setContentView(R.layout.activity_response);
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		int r = (int)(Math.random()*2);
		if(r==1){
			message = "Lab!";
		}
		else{
			message = "Nah...";
		}
		textView.setText(message);
		setContentView(textView);
	}

	public static class PlaceholderFragment extends Fragment {
		public PlaceholderFragment(){
			
		}
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
								 Bundle savedInstanceState){
			View rootView = inflater.inflate(R.layout.activity_response,  container, false);
			return rootView;
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.response, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

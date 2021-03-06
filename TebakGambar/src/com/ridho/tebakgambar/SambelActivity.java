package com.ridho.tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SambelActivity extends Activity {
	//Deklarasi Activity
	EditText jawabanTxt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sambel);
		//Cari komponen edit text
        jawabanTxt = (EditText) findViewById(R.id.editText1);
       //Setting input dalam huruf kapital
        jawabanTxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sambel, menu);
		return true;
	}
	 public void cekJawaban(View v){
	    	String jawabanBenar = "SAMBEL BAJAK";
	    	String jawabanUser  = jawabanTxt.getText().toString();
	    	if(jawabanUser.equals(jawabanBenar)){
	    		Toast.makeText(getApplicationContext(), 
	    				"JAWABAN TEPAT !", Toast.LENGTH_LONG).show();
	    		Intent i = new Intent(getApplicationContext(),CongratsActivity.class);
	    		startActivity(i);
	    	}
	    	else{
	    		//Pesan Text
	    		Toast.makeText(getApplicationContext(),
	    				"JAWABAN MASIH SALAH !", Toast.LENGTH_LONG).show();
	    	}
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

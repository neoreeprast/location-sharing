package com.suud.locationsharing;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TambahKomentarActivity extends Activity {
    Button btn;
    EditText et;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tambah_komentar);
		btn=(Button)findViewById(R.id.button1);
		btn.setEnabled(false);
		btn.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                submitKomen();
            }
        });
		et=(EditText)findViewById(R.id.editText1);
		et.setOnKeyListener(new View.OnKeyListener() {
            
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // TODO Auto-generated method stub
                toogleButton();
                return false;
            }
        });
	}
	private void toogleButton() {
	    if (et.getText().length()<=0) {
	        btn.setEnabled(false);
	    } else {
	        btn.setEnabled(true);
	    }
	}
	private void submitKomen() {
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tambah_komentar, menu);
		return true;
	}

}

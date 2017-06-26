package key.value;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button s, n;
	EditText et1,et2;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        s=(Button)findViewById(R.id.button1);
        n=(Button)findViewById(R.id.button2);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        
        
    }
    public void Next(View v) {
    	
		Toast.makeText(getApplicationContext(), "Next Page", Toast.LENGTH_SHORT).show();
		Intent i= new Intent(this, Activity1.class);
		startActivity(i);
		
	}
	public void Save(View v) {
		
		SharedPreferences sp=getSharedPreferences("mydata", Context.MODE_PRIVATE);
		SharedPreferences.Editor et=sp.edit();
		et.putString("name", et1.getText().toString());
		et.putString("password", et2.getText().toString());
		et.commit();
		Toast.makeText(getApplicationContext(), "Data Saved", Toast.LENGTH_SHORT).show();
		
	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

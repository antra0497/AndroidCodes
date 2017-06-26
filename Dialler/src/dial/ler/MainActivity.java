package dial.ler;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	Button b;
	EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b=(Button)findViewById(R.id.button1);
        et=(EditText)findViewById(R.id.editText1);
        
        b.setOnClickListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
				
		if(et.getText().toString().trim().length()==0)
		{
			Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_SHORT).show();
		}
		
		if(et.getText().toString().length()!=10)
		{
			Toast.makeText(getApplicationContext(), "Number must be 10 digit ", Toast.LENGTH_SHORT).show();
		}
		else
		{
		  String num ="tel:"+ et.getText().toString();
		  Intent phonecall= new Intent(Intent.ACTION_CALL);
		  phonecall.setData(Uri.parse(num));
		  startActivity(phonecall);		
			
		}
	}
    
}

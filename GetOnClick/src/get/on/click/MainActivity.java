package get.on.click;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button up,rev,len,bin,hex,oe;
	EditText et1,et2;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        up=(Button)findViewById(R.id.button1);
        rev=(Button)findViewById(R.id.button3);
        len=(Button)findViewById(R.id.button5);
        bin=(Button)findViewById(R.id.button2);
        hex=(Button)findViewById(R.id.button4);
        oe=(Button)findViewById(R.id.button6);
        
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        
        
        up.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				 String s=et1.getText().toString();
				 String ans= s.toUpperCase();
				 Toast.makeText(getApplicationContext(), ans, Toast.LENGTH_LONG).show();
				
			}
		});
        
        rev.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				 String s=et1.getText().toString();
				 String ans= new StringBuffer(s).reverse().toString();
				 Toast.makeText(getApplicationContext(), ans, Toast.LENGTH_LONG).show();
			}
		});
        
        len.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				 String s=et1.getText().toString();
				 int ans= s.length();
				 Toast.makeText(getApplicationContext(), "Length is: "+ans, Toast.LENGTH_LONG).show();
			}
		});
        
        bin.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				 String s=et2.getText().toString();
				 String ans= Integer.toBinaryString(Integer.parseInt(s));
						 
				 Toast.makeText(getApplicationContext(), ans, Toast.LENGTH_LONG).show();
			}
		});
        
        hex.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				 String s=et2.getText().toString();
				 String ans= Integer.toHexString(Integer.parseInt(s));
						 
				 Toast.makeText(getApplicationContext(), ans, Toast.LENGTH_LONG).show();
			}
		});
        
        oe.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 String s=et2.getText().toString();
				 int ans = Integer.parseInt(s);
				 
				 if(ans%2==0)
				 Toast.makeText(getApplicationContext(), "Even Number", Toast.LENGTH_LONG).show();
				 else
				 Toast.makeText(getApplicationContext(), "Odd Number", Toast.LENGTH_LONG).show();	 
			
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

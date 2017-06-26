package ca.pi.tals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button b;
	AutoCompleteTextView et;
	TextView tv;
	String r[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu Kashmir","Karnataka","Keral","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Orrisa","Punjab","Rajasthan","Sikkim","Tamil Nadu","Tripura","Uttar Pradesh","West Bengal","Chhattisgarh","Uttarakhand","Jharkhand","Telangana"};
   
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b=(Button)findViewById(R.id.button1);
        et=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        tv=(TextView)findViewById(R.id.textView1);
        
                        
         ArrayAdapter<String> apt=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, r);
	     et.setThreshold(1);
	     et.setAdapter(apt);
	     
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int i,k=-1;
								
				int l=r.length;
				String s=et.getText().toString();
				
				for(i=0;i<l;i++)
				{
				if(s.equalsIgnoreCase(r[i]))
					{
					    k=i;	// storing the index
					}				
				}
				
				if(k==-1)
				{
					Toast.makeText(getApplicationContext(),"Invalid name", Toast.LENGTH_SHORT).show();
				}
				else
				{
				Intent in=new Intent(MainActivity.this, Activity1.class);
				String f=String.valueOf(k);
				in.putExtra("index", f);
				startActivity(in);
				}
				
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

package ca.pi.tals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends Activity {

	Button bt;
	TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        
        bt=(Button)findViewById(R.id.button1);
        tv=(TextView)findViewById(R.id.textView1);
                
        String a[]={"Hyderabad","Itanagar","Dispur","Patna","Panaji","Gandhinagar","Chandinagar","Shimla","Srinagar","Bangalooru","Tirubanantapuram","Bhopal","Mumbai","Imphal","Shilong","Aizawl","Kohima","Bhubaneswar","Chandigarh","Jaipur","Gangtok","Chennai","Agartala","Lucknow","Kolkata","Raipur","Dehradun","Ranchi","Hyderabad"};
        Intent o=getIntent();
        
        String b=o.getStringExtra("index");
        
        int d=Integer.parseInt(b);
        String ans=a[d];
        
        
        tv.setText(ans);
			
	bt.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			finish();
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

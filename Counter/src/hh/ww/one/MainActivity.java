package hh.ww.one;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button add, sub, reset ;
	EditText et;
	int count; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        add=(Button)findViewById(R.id.button1);
        sub=(Button)findViewById(R.id.button2);
        reset=(Button)findViewById(R.id.button3);
        et=(EditText)findViewById(R.id.editText1);
        
        add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				count++;
				et.setText("Count is :"+ count);
			}
		});
        
        sub.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				count--;
				et.setText("Count is :"+ count);
			}
		});
        
        reset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				count=0;
				et.setText("Count is :"+ count);
				
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

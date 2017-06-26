package hh.ww.three;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button r,b,g,y;
	RelativeLayout rr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        r=(Button)findViewById(R.id.button1);
        b=(Button)findViewById(R.id.button2);
        g=(Button)findViewById(R.id.button3);
        y=(Button)findViewById(R.id.button4);
        
        rr=(RelativeLayout)findViewById(R.id.mylayout);
		        
		 r.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						rr.setBackgroundColor(Color.RED);
						Toast.makeText(getApplicationContext(), ""+"Red", Toast.LENGTH_SHORT).show();
						
					}
				});
		        
		b.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						rr.setBackgroundColor(Color.BLUE);
						Toast.makeText(getApplicationContext(), ""+"Blue", Toast.LENGTH_SHORT).show();
						
					}
				});
		g.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rr.setBackgroundColor(Color.GREEN);
				Toast.makeText(getApplicationContext(), ""+"Green", Toast.LENGTH_SHORT).show();
				
			}
		});
		y.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				rr.setBackgroundColor(Color.YELLOW);
				Toast.makeText(getApplicationContext(), ""+"Yellow", Toast.LENGTH_SHORT).show();
				
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

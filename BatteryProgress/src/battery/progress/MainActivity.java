package battery.progress;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {
 ProgressBar p;
 Button b;
 TextView t;
	
 private BroadcastReceiver batteryinfo= new BroadcastReceiver() {
	
	@Override
	public void onReceive(Context arg0, Intent i) {
		// TODO Auto-generated method stub
				
		final int level= i.getIntExtra("level", 0);
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				p.setProgress(level);
				t.setText("Battery Level:" + Integer.toString(level));
			}
		});
		
		
	}
};
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        p=(ProgressBar)findViewById(R.id.progressBar1);
        t=(TextView)findViewById(R.id.textView1);
        b=(Button)findViewById(R.id.button1);
        registerReceiver(batteryinfo, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        
        
    }
     

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

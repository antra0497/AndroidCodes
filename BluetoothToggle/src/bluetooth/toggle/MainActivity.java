package bluetooth.toggle;

import java.util.ArrayList;
import java.util.Set;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Switch st,vi;
	TextView tv1;
	ListView lv;
	Button c;
	private BluetoothAdapter BA;
	private Set<BluetoothDevice>paired;
    ArrayList<String> list=new ArrayList<String>();
    
    String[] a= new String[10];
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        st=(Switch)findViewById(R.id.switch1);
        vi=(Switch)findViewById(R.id.switch2);
        tv1=(TextView)findViewById(R.id.textView2);
        lv=(ListView)findViewById(R.id.listView1);
        c=(Button)findViewById(R.id.button1);
        
       
        
        BA=BluetoothAdapter.getDefaultAdapter();
        
        st.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean b) {
				// TODO Auto-generated method stub
				
				if(b)
				{
					enable(true);
					Toast.makeText(getApplicationContext(), "Bluetooth Enable", Toast.LENGTH_SHORT).show();
					
				}
				else
				{
					enable(false);
					Toast.makeText(getApplicationContext(), "Bluetooth Disable", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
        
        vi.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean b) {
				// TODO Auto-generated method stub
				
				if(b)
				{
					visible(true);
					Toast.makeText(getApplicationContext(), "Visibility On", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Visiblity off", Toast.LENGTH_SHORT).show();
				}
			}
		});
        
        c.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				paired=BA.getBondedDevices();
					  			  
				for(BluetoothDevice bt: paired)
				list.add(bt.getName());
					
				Toast.makeText(getApplicationContext(), "Showing Paired devices", Toast.LENGTH_SHORT).show();
				showdevices();
				
			}			
		});
        
       
    }


    protected void showdevices() {
		// TODO Auto-generated method stub
    	
    	ArrayAdapter<String> apt=new ArrayAdapter<String>(this,R.layout.text,list);		
		lv.setAdapter(apt);
		
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private void enable(boolean b) {

		// TODO Auto-generated method stub
		
		
		if((b==true)&& (!BA.isEnabled()))
		{
			Intent on=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
			startActivityForResult(on,0);
		}
		else
			BA.disable();
    }

    private void visible(boolean b) {
		// TODO Auto-generated method stub
		
    	if(b==true)
    	{
    		Intent getvisible=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
    		startActivityForResult(getvisible, 0);
	    }
	}
}

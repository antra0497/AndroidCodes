package wifi.toggle;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;

public class MainActivity extends Activity {

	Switch st;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        st=(Switch)findViewById(R.id.switch1);
        
      
        
        st.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton v, boolean b) {
				// TODO Auto-generated method stub
				
				if(b)
				{
					mywifienable(true);
					Toast.makeText(getApplicationContext(),"Wifi Enable", Toast.LENGTH_LONG).show();
				}
				else
				{
					mywifienable(false);
					Toast.makeText(getApplicationContext(),"Wifi Disable", Toast.LENGTH_LONG).show();
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
    


public void mywifienable(Boolean b)
{
	WifiManager wifiobj=(WifiManager)this.getSystemService(Context.WIFI_SERVICE);
	if((b==true)&& (wifiobj.isWifiEnabled()))
	{
		wifiobj.setWifiEnabled(true);
	}
	if((b==false)&& (wifiobj.isWifiEnabled()))
	{
		wifiobj.setWifiEnabled(false);
	}
}

}
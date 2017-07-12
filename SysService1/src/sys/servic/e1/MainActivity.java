package sys.servic.e1;



import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button b;
	TextView tv;
	String get,show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        b=(Button)findViewById(R.id.button1);
        tv=(TextView)findViewById(R.id.textView1);
   	       	 
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			TelephonyManager get=(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
			 String imin=get.getDeviceId();
			 String subid=get.getDeviceId();
			 String simid=get.getSimSerialNumber();
			 String simoperator=get.getSimOperatorName();
			 String voicenumber=get.getVoiceMailNumber();
			 String sv=get.getDeviceSoftwareVersion();
			 String siniso=get.getSimCountryIso();
			 Boolean roam=get.isNetworkRoaming();
			 int phonetype=get.getPhoneType();
		     String pht="";
			 
			 switch (phonetype) {
			case TelephonyManager.PHONE_TYPE_CDMA :
				pht="CDMA";
				break;
			case TelephonyManager.PHONE_TYPE_GSM :
				pht="GSM";
				break;

			case TelephonyManager.PHONE_TYPE_NONE:
				pht="NO OPERATOR";
				break;
			}
			 
			 show="Phone details \n";
			 show+= "\n IMI Number is: "+imin;
			 show+= "\n Subscriber Id is: "+subid;
			 show+= "\n Sim serial number: "+simid;
			 show+= "\n Sim operator is: "+simoperator;
			 show+= "\n Voice number is: "+voicenumber;
			 show+= "\n Device software version is: "+sv;
			 show+= "\n Sim is Roaming is: "+roam;
			 show+= "\n Phone Network Type is: "+pht;
			 show+= "\n Sim country iso is: "+siniso;
			 
			 tv.setText(show);			 
			 tv.setTextColor(Color.BLACK);
			 
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

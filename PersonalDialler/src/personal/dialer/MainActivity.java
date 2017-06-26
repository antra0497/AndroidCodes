package personal.dialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button m,p;
	TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        p=(Button)findViewById(R.id.button2);
        m=(Button)findViewById(R.id.button1);
        tv=(TextView)findViewById(R.id.textView1);
        
        p.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String pn="9335107258";
				String num ="tel:"+ pn;
				  Intent phonecall= new Intent(Intent.ACTION_CALL);
				  phonecall.setData(Uri.parse(num));
				  startActivity(phonecall);
			}
		});
        
        m.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String mn="9793785125";
				String num ="tel:"+ mn;
				  Intent phonecall= new Intent(Intent.ACTION_CALL);
				  phonecall.setData(Uri.parse(num));
				  startActivity(phonecall);
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

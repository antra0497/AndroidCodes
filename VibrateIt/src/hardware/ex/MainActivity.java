package hardware.ex;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button l,s,m;
	Vibrator vib;

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       l=(Button)findViewById(R.id.button1);
       s=(Button)findViewById(R.id.button2);
       m=(Button)findViewById(R.id.button3);
       
       vib=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
       
       l.setOnClickListener(this); 
       s.setOnClickListener(this);
       m.setOnClickListener(this);  
              
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		case R.id.button1:
			vib.vibrate(1000); 
			break;
			
		case R.id.button2:
			long[] pattern={100,500,900,1300};
			vib.vibrate(pattern,0);
			break;
			
		case R.id.button3:
			vib.cancel();
			break;


		
		}
		
	}

		
	}

    


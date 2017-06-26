package ex.toggle;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends Activity implements OnCheckedChangeListener
{

	RelativeLayout rr;
	Switch st;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        st=(Switch)findViewById(R.id.switch1);
        rr=(RelativeLayout)findViewById(R.id.mylayout);
        
        
        st.setOnCheckedChangeListener(this);
        
        Toast mytoast=Toast.makeText(getApplicationContext(), "hello to the toggle switch", Toast.LENGTH_LONG);
        mytoast.setGravity( Gravity.TOP, 0, 0);
        mytoast.show();
    } 


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onCheckedChanged(CompoundButton v, boolean b) {
		// TODO Auto-generated method stub
		
		if(b)
		{
			rr.setBackgroundColor(Color.MAGENTA);
			Toast.makeText(this, "Magenta", Toast.LENGTH_LONG).show();
			
			/* Toast mytoast=Toast.makeText(getApplicationContext(), "hello to the toggle switch", Toast.LENGTH_LONG);
		     mytoast.setGravity( Gravity.TOP, 0, 0);
		     mytoast.show(); */
		}
		else
		{
			rr.setBackgroundColor(Color.YELLOW);
			Toast.makeText(this, "Yellow", Toast.LENGTH_LONG).show();
		}
	}
    
}

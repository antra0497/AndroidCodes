package key.value;



import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity1 extends Activity {
public static final String DEFAULT="N/A";

	Button l, b;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page1);
        
        l=(Button)findViewById(R.id.button1);
        b=(Button)findViewById(R.id.button2);
             
    }
    
    public void Load(View v) {
		SharedPreferences sp=getSharedPreferences("mydata", Context.MODE_PRIVATE);
		String na=sp.getString("name",DEFAULT);
		String pa=sp.getString("password",DEFAULT);
		if(na.equals(DEFAULT))
		{
			Toast.makeText(getApplicationContext(), "nodata found", Toast.LENGTH_SHORT).show();
		}
		
		else
		{
			Toast.makeText(getApplicationContext(), "data loaded", Toast.LENGTH_SHORT).show();
			Toast.makeText(getApplicationContext(), "Name :"+na, Toast.LENGTH_SHORT).show();
			Toast.makeText(getApplicationContext(), "Password :"+pa, Toast.LENGTH_SHORT).show();
		}
    	
	}
    
	

	public void Back(View v) {
			finish();
		}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

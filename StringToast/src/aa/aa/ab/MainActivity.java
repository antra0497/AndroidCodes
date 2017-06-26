package aa.aa.ab;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button len,dis;
	EditText et;
	TextView tv;
	ImageView iv;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        len=(Button)findViewById(R.id.button1);
        dis=(Button)findViewById(R.id.button2);
        et=(EditText)findViewById(R.id.editText1);
        tv=(TextView)findViewById(R.id.textView1);
        iv=(ImageView)findViewById(R.id.imageView1);
        
        len.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String mystr=et.getText().toString();
				int l= mystr.length();
				
				tv.setText("Length is"+ l);
				
			}
		});
        
        dis.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				iv.setImageResource(R.drawable.logo2);
				String strdisp= et.getText().toString();
				Toast.makeText(getApplicationContext(), ""+strdisp, Toast.LENGTH_SHORT).show();
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

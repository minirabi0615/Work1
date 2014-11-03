package com.example.work1;

//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

// ’Ç‰Á  
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

//public class MainActivity extends ActionBarActivity {
public class MainActivity extends Activity implements OnClickListener{
	   
	// ’Ç‰Á
    private Button button1;
  
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        // ’Ç‰Á
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
    
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
     
	// ’Ç‰Á
    public void onClick(View v){
       TextView textview1=(TextView)findViewById(R.id.textview1);
      textview1.setText("ƒ{ƒ^ƒ“‚ª‰Ÿ‚³‚ê‚Ü‚µ‚½!!");
    }
}
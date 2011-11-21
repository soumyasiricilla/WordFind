package sharayu.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelpActivity extends Activity {
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
	}
	
		
	public void OnClickMenu(View view)
    {
    	Intent IntentMenu = new Intent();
    	IntentMenu.setClass(this, Test1Activity.class);
    	startActivity(IntentMenu);
    	
    }

}

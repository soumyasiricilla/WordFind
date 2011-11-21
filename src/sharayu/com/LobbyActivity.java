package sharayu.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public  class LobbyActivity extends Activity{
	
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lobby);
			}

	 public void OnClickPlay(View view)
	    {
	    	Intent IntentMenu = new Intent();
	    	IntentMenu.setClass(this, NetworkActivity.class);
	    	startActivity(IntentMenu);
	    }
}

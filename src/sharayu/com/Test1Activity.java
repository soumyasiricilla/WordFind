package sharayu.com;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class Test1Activity extends Activity {
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       
    }
    public void OnClickSingleplay(View view)
    {
    	Intent IntentMenu = new Intent();
    	IntentMenu.setClass(this, SingleplayActivity.class);
    	startActivity(IntentMenu);
    }
    public void OnClickNetwork(View view)
    {
    	Intent IntentMenu = new Intent();
    	IntentMenu.setClass(this, LobbyActivity.class);
    	startActivity(IntentMenu);
    }
    public void OnClickInstructions(View view)
    {
    	Intent IntentMenu = new Intent();
    	IntentMenu.setClass(this, HelpActivity.class);
    	startActivity(IntentMenu);
    }
	
}
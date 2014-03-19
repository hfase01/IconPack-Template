package gridview;

import android.os.Bundle;
import android.view.WindowManager;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Window;
import com.google.analytics.tracking.android.EasyTracker;

import fragments.LauncherFragment;
import co.w44.h4rsh.R;

public class LauncherMain extends SherlockFragmentActivity {

	// Starts the Activity for the list view
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.launcher_main);
		EasyTracker.getInstance(this).activityStart(this);
		getSupportFragmentManager().beginTransaction()
		.replace(R.id.container_launcher, new LauncherFragment())
		.commit();
	}

	// Hides the title bar
	public void noTitle() {
		requestWindowFeature((int) Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
	// This will return the Activity to the Main Screen when the app is in a Paused (not used) state
	@Override
	  public void onPause(){
		  super.onPause();
		  finish();
	  }
}

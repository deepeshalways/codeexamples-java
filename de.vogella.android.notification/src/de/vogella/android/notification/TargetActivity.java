package de.vogella.android.notification;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textView = new TextView(this);
		textView.setText("Zweite Aktivität aufgerufen über eine Notifikation");
		setContentView(textView);
	}
}

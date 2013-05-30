package medrano.jesus.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	public void tenPercentClicked(View view){
		double percent = 0.10;
		updateTipTextView(percent);
	}

	public void fifteenPercentClicked(View view){
		double percent = 0.15;
		updateTipTextView(percent);

	}
	
	public void twentyPercentClicked(View view){
		double percent = 0.20;
		updateTipTextView(percent);

	}

	private void updateTipTextView(double percent) {
		EditText editText = (EditText) this.findViewById(R.id.editText1);
		TextView textView = (TextView) this.findViewById(R.id.textView1);
		double userInput = Double.parseDouble(editText.getText().toString());
		double tip = userInput * percent;
		textView.setText(getString(R.string.tipTextViewDefault) + String.format("%.2f", tip));
	}
	
}

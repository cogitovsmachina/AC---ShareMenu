package org.androidtitlan.ac.sharemenu;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ACShareMenu extends Activity {
    private Button nButton;
	private String title = "The Title";
	private String text = "This is the text to share";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        nButton = (Button)findViewById(R.id.button);
        nButton.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v) {
            	ShareMenu.buildShareMenu( getApplicationContext(), title , text );
			}
        });
    }
}
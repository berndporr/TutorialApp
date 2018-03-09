package tech.glasgowneuro.tutorial_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * The main activity
 */


public class TutorialActivity extends AppCompatActivity {


    Button doIt;
    Button ok;
    EditText aNumber;
    GraphicsView graphicsView;
    TextView link2source;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        link2source = findViewById(R.id.link2source);
        link2source.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://github.com/berndporr/TutorialApp";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        aNumber = findViewById(R.id.anumber);
        graphicsView = findViewById(R.id.ecgaxisview);
        doIt = findViewById(R.id.doit);
        doIt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // do something here
            }
        });
        ok = findViewById(R.id.okbutton);
        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //graphicsView.changeSomethingHere();
                graphicsView.repaint_it();
            }
        });
    }
}

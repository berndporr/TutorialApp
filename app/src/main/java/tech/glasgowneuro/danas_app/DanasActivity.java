package tech.glasgowneuro.danas_app;

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


public class DanasActivity extends AppCompatActivity {


    private float herzwinkel;
    private boolean WinkelOk;
    int nattempts = 0;

    Button dice;
    Button solution;
    Button ok;
    EditText angle;
    GrafikView grafikView;
    TextView evaluation;
    TextView attyslink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecgaxis);

        attyslink = (TextView) findViewById(R.id.attyslink);
        attyslink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.attys.tech";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        angle = (EditText) findViewById(R.id.angle);
        grafikView = (GrafikView) findViewById(R.id.ecgaxisview);
        evaluation = (TextView) findViewById(R.id.evaluate);
        solution = (Button) findViewById(R.id.solution);
        solution.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        solution.setVisibility(View.INVISIBLE);
        dice = (Button) findViewById(R.id.dice);
        dice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
        ok = (Button) findViewById(R.id.okbutton);
        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
    }
}

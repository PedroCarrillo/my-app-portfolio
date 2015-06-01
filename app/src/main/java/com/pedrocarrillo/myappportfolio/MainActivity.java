package com.pedrocarrillo.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button btnSpotifyApp,btnScoresApp, btnLibraryApp, btnBuildApp, btnXYZApp, btnMyOwnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSpotifyApp = (Button)findViewById(R.id.btnFirstApp);
        btnScoresApp = (Button)findViewById(R.id.btnSecondApp);
        btnLibraryApp = (Button)findViewById(R.id.btnThirdApp);
        btnBuildApp = (Button)findViewById(R.id.btnFourthApp);
        btnXYZApp = (Button)findViewById(R.id.btnFifthApp);
        btnMyOwnApp = (Button)findViewById(R.id.btnSixthApp);
        btnSpotifyApp.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildApp.setOnClickListener(this);
        btnXYZApp.setOnClickListener(this);
        btnMyOwnApp.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String textForToast;
        switch ( v.getId()){
            case R.id.btnFirstApp:
                textForToast = "my spotify app";
                break;
            case R.id.btnSecondApp:
                textForToast = "my scores app";
                break;
            case R.id.btnThirdApp:
                textForToast = "my library app";
                break;
            case R.id.btnFourthApp:
                textForToast = "my Build It Bigger app";
                break;
            case R.id.btnFifthApp:
                textForToast = "my XYZ Reader app";
                break;
            case R.id.btnSixthApp:
                textForToast = "my capstone app";
                break;
            default:
                textForToast = "Impossible";
                break;
        }
        Toast.makeText(this, "This Button will launch "+textForToast,Toast.LENGTH_SHORT).show();
    }
}

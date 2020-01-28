package com.example.myappli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnQuitter = (Button) findViewById(R.id.btnQuitter);
        btnQuitter.setOnClickListener(btnQuitterOnClickListener);
        popUp("onCreate()");

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        popUp("onRestart()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        popUp("onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        popUp("onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        if (isFinishing()) {
            popUp("onPause, l'utilisateur à demandé la fermeture via un finish()");
        } else {
            popUp("onPause, l'utilisateur n'a pas demandé la fermeture via un finish()");
        }
    }


    @Override
    protected void onStop() {
        super.onStop();
        popUp("onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        popUp("onDestroy()");
    }


    View.OnClickListener btnQuitterOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
    public void popUp(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}









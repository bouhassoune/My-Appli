package com.example.heureservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button serviceBtn;
    private Intent heureeservice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button serviceBtn = (Button) findViewById(R.id.serviceBtn);
        serviceBtn.setOnClickListener(this);
        Intent heureeservice;




    }

    @Override
    public void onClick(View view){
        startService(new Intent(MainActivity.this, HeureService.class));
        serviceBtn.setText("Service arrêté");
        stopService(heureeservice);
    }

}




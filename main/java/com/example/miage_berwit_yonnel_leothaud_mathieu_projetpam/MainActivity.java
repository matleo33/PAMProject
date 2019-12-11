package com.example.miage_berwit_yonnel_leothaud_mathieu_projetpam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonHere;
    Button buttonOverThere;
    Button buttonMyInvitations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonHere = (Button) findViewById(R.id.dateHereAndNow);
        buttonOverThere = (Button) findViewById(R.id.dateNowOverThere);
        buttonMyInvitations = (Button) findViewById(R.id.invitations);

        buttonOverThere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DateNowOverThere.class);
                startActivity(intent);
            }
        });

        buttonHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DateHereAndNow.class);
                startActivity(intent);
            }
        });

        buttonMyInvitations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyInvitations.class);
                startActivity(intent);
            }
        });
    }
}

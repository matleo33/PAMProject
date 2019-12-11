package com.example.miage_berwit_yonnel_leothaud_mathieu_projetpam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;

import java.util.ArrayList;

public class DateHereAndNow extends AppCompatActivity {

    Button buttonSendInvitations;
    ArrayList<String> numerosForInvitation;
    ScrollView scrollViewContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_here_and_now);
        buttonSendInvitations = (Button) findViewById(R.id.buttonSendInvitations);
        scrollViewContacts = (ScrollView) findViewById(R.id.scrollContacts);
    }
}

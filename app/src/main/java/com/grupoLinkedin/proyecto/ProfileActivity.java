package com.grupoLinkedin.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void siguiente(View view){
        Intent siguiente = new Intent(this, ProfileActivity.class);
        startActivity(siguiente);
    }
}

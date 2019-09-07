package com.example.moodplusv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SettingActivity extends AppCompatActivity {
    Button logout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        logout = findViewById(R.id.btnLogout);

        logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();
                Intent I = new Intent(SettingActivity.this, LoginActivity.class);
                startActivity(I);

            }
        });

    }
}
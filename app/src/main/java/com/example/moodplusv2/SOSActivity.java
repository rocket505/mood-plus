package com.example.moodplusv2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SOSActivity extends AppCompatActivity {

    Button call;
    Button call2;
    private int REQ_CODE_OPEN_PHONE = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sos);
        call = findViewById(R.id.btnCall);
        call2 = findViewById(R.id.btnCall2);

        call.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent I = new Intent(Intent.ACTION_DIAL);
                Uri phoneUri = Uri.parse("tel:0165825031");
                I.setData(phoneUri);
                startActivityForResult(I, REQ_CODE_OPEN_PHONE);
            }
        });

        call2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent I = new Intent(Intent.ACTION_DIAL);
                Uri phoneUri = Uri.parse("tel:0138654166");
                I.setData(phoneUri);
                startActivityForResult(I, REQ_CODE_OPEN_PHONE);
            }
        });
    }
}

package com.example.safemedrone_v1;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectActivity extends AppCompatActivity {

    ImageButton mic_btn;
    ImageButton pad_btn;
    ImageButton satting_btn;
    Button help_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_select);


        mic_btn = findViewById(R.id.mic_btn);

        mic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, SpeechActivity.class);
                startActivity(intent);
            }
        });


        pad_btn = findViewById(R.id.pad_btn);

        pad_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, JoystickActivity.class);
                startActivity(intent);
            }
        });

        satting_btn = findViewById(R.id.satting_btn);

        satting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });



        help_btn = findViewById(R.id.help_btn);

        help_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectActivity.this, HelpActivity.class);
                startActivity(intent);
            }
        });


    }
}

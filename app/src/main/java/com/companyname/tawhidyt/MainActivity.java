package com.companyname.tawhidyt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {

LinearLayout laySong1, laySong2, laySong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        laySong1 = findViewById(R.id.laySong1);
        laySong2 = findViewById(R.id.laySong2);
        laySong3 = findViewById(R.id.laySong3);

        laySong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/dtpoeDHQojA";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        laySong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/_nZhmY9J0vA";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        laySong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/AR2CVMbyKcY";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });









    }
}
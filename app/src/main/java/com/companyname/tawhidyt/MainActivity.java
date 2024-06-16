package com.companyname.tawhidyt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
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
    Button song1, song2, song3;



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

        song1 = findViewById(R.id.song1);
        song2 = findViewById(R.id.song2);
        song3 = findViewById(R.id.song3);

        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/dAxj0HBnxCU";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/dAxj0HBnxCU";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayer.video_url = "https://www.youtube.com/embed/dAxj0HBnxCU";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });







    }
}
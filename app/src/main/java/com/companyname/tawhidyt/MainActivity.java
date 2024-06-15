package com.companyname.tawhidyt;

import android.os.Bundle;
import android.view.View;
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

    ImageView img;
    Button bShow, bGone, bToast;
    int count=0;

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

img = findViewById(R.id.img);
bShow = findViewById(R.id.bShow);
bGone = findViewById(R.id.bGone);
bToast = findViewById(R.id.bToast);

//        .................................................................

        bShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                img.setVisibility(View.VISIBLE);
            }
        });

        bGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            img.setVisibility(View.GONE);
            }
        });

        bToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Toast is showing",Toast.LENGTH_LONG).show();
            }
        });


    }
}
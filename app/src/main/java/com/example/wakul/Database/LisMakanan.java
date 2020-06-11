package com.example.wakul.Database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.wakul.UserDasboard;
import com.example.wakul.R;

public class LisMakanan extends AppCompatActivity {
    ImageView back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dasboard);

        getSupportActionBar().setTitle("Makanan");

        back1 = findViewById(R.id.back);
        setContentView(R.layout.activity_makanan);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LisMakanan.this, UserDasboard.class);
                startActivity(intent);
            }
        });
    }
}

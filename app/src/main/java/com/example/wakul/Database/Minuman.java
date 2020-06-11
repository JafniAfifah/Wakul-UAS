package com.example.wakul.Database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.wakul.UserDasboard;
import com.example.wakul.R;

public class Minuman extends AppCompatActivity {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);
        back = findViewById(R.id.back2);
        back.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View v) {
                 Intent intent = new Intent(Minuman.this, UserDasboard.class);
                startActivity(intent);
            }
        });
    }
}

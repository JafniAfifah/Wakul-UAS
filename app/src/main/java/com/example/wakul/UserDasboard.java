package com.example.wakul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.wakul.Database.LisMakanan;
import com.example.wakul.Database.Minuman;
import com.google.android.material.navigation.NavigationView;

public class UserDasboard extends AppCompatActivity {

    //Hooks
//    ImageView imgMakanan;
    ImageView imgMinuman;
//     ImageView dots[];
    //Drawer Menu
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dasboard);

        //menu
//        ImageView showMakanan = findViewById(R.id.img_mkn);
        imgMinuman = findViewById(R.id.img_mnm);

//        showMakanan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(UserDasboard.this, LisMakanan.class);
//               startActivity(intent);
//            }
//        });
//        private void addDots(int position){
//
//            dots = new ImageView[2];
//
//            for(int i=0; i<dots.length; i++){
//                dots[i] = new ImageView(this);
//
//            }
//        }



//


//        imgMakanan.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               Intent intent = new Intent(UserDasboard.this, LisMakanan.class);
//               startActivity(intent);
//           }
//        });
        imgMinuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserDasboard.this, Minuman.class);
                startActivity(intent);
                finish();
            }
        });




        //Menu Hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigtion_view);


    }

    public void MenuMakanan(View view) {
        Intent intent = new Intent(UserDasboard.this, LisMakanan.class);
                startActivity(intent);
    }

//    public void button_gambar(View view) {
//        Intent intent = new Intent(UserDasboard.this, Minuman.class);
////                startActivity(intent);
//    }
//
//    public void button_gambar2(View view) {
//        Intent intent = new Intent(UserDasboard.this, Minuman.class);
////                startActivity(intent);
    }
//}

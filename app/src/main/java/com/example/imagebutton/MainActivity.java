package com.example.imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;
import java.util.Random;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton ib;
    Random rnd=new Random();
    int num;
    int[] img=new int[3];
    int[] bImg=new int[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.iv);
        ib=findViewById(R.id.ib);
        img[0]=R.drawable.first;
        img[1]=R.drawable.second;
        img[2]=R.drawable.third;
        bImg[0]=R.drawable.one;
        bImg[1]=R.drawable.two;
        bImg[2]=R.drawable.three;
        }
        public void onClick(View view)
        {
            num=rnd.nextInt(3);
            iv.setImageResource(img[num]);
            ib.setImageResource(bImg[num]);
        }
}
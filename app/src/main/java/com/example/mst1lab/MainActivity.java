package com.example.mst1lab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout cl;
    ImageView img1,frame;
    Button button1;
    int cnt =-1;
    int frames[]={R.drawable.s1,R.drawable.ss};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cl= findViewById(R.id.cl);
        button1 = findViewById(R.id.button1);
        img1=findViewById(R.id.img1);
        frame=findViewById(R.id.frame);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if (cnt<frames.length-1)
                {
                    cnt++;
                    img1.setImageResource(frames[cnt]);
                }
                else
                {
                    cnt =0;
                    img1.setImageResource(frames[cnt]);
                }
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch (id){
            case R.id.redcolor:
                cl.setBackgroundColor(Color.RED);
                return true;
            case R.id.bluecolor:
                cl.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.greencolor:
                cl.setBackgroundColor(Color.GREEN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.color_menu, menu);
        return true;
    }
}

package com.mlabs.bbm.firstandroidapp_morningclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView imgView = (ImageView)findViewById(R.id.bg);

        imgView.setOnTouchListener(new View.OnTouchListener() {
            float initX = 0, initY = 0, finalX = 0, finalY = 0;

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
               switch (motionEvent.getAction()){
               case MotionEvent.ACTION_DOWN:
                   initX = motionEvent.getX();
                   initY = motionEvent.getY();
                   return true;
              case MotionEvent.ACTION_UP:
                  finalX = motionEvent.getX();
                  finalY = motionEvent.getY();

                  displayAction(initX, finalX, initY, finalY);
                  return false;
                }return false;
            }
        });


    }

    public void displayAction(float x1, float x2, float y1, float y2){
        String x = "", y = "";

        if(x1 == x2){
        }else if(x1 > x2){
            x = "Left";
        }else if(x1 < x2){
            x = "Right";
        }

        if(y1 == y2){

        }else if(y1 > y2){
            y = "Up";
        }else if (y1 < y2){
            y = "Down";
        }

        Toast.makeText(getApplicationContext(), "Swipe: "+x+"-"+y+"", Toast.LENGTH_SHORT).show();
    }
}

package com.example.lenovo.button3d;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;


// level  -15
public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    static int moves = 3 ;
    static int goal = 50;
    static int  result = 10;
    static  int count5 = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button clear=(Button)findViewById(R.id.bclear);
        ImageButton setting =(ImageButton)findViewById(R.id.setting);
        Button black1= (Button)findViewById(R.id.black1);
        Button black2= (Button)findViewById(R.id.black2);
        Button black3= (Button)findViewById(R.id.black3);
        Button b1= (Button)findViewById(R.id.b1);
        Button b2= (Button)findViewById(R.id.b2);
        Button b3= (Button)findViewById(R.id.b3);
        Button b4=(Button)findViewById(R.id.b4);
        TextView Result=(TextView)findViewById(R.id.answer);
        TextView Goal=(TextView)findViewById(R.id.goal);
        TextView Level=(TextView)findViewById(R.id.level);
        TextView move = (TextView)findViewById(R.id.moves);
        black1.setOnClickListener(this);
        black2.setOnClickListener(this);
        black3.setOnClickListener(this);
        black1.setText("x3");
        Result.setText(""+result);
        black2.setText("x2");
        black3.setText("-5");
        TextView myTextView = (TextView) findViewById(R.id.answer);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/digital.ttf");
        myTextView.setTypeface(typeface);
        Goal.setText("GOAL : 50");
        Level.setText("LEVEL 5");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        move.setText("MOVES :"+moves);
        Result.setText(""+result);

        //black3.setEnabled(false);

    }

    @Override
    public void onClick(View v) {
        if (moves > 0) {
            Button clear=(Button)findViewById(R.id.bclear);
            TextView Result = (TextView) findViewById(R.id.answer);
            TextView move = (TextView) findViewById(R.id.moves);

            switch (v.getId()) {

                case R.id.black1: {

                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
                    mp.start();
                    result = result * 3;
                    Result.setText("" + result);
                    --moves;
                    move.setText("MOVES: " + moves);

                    break;
                }
                case R.id.black2: {

                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
                    mp.start();
                    result = result * 2;
                    Result.setText("" + result);
                    --moves;
                    move.setText("MOVES: " + moves);
                    break;
                }
                case R.id.black3: {

                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
                    mp.start();
                    result = result - 5;
                    Result.setText("" + result);
                    --moves;
                    move.setText("MOVES: " + moves);


                    break;
                }

            }
            if(result < 0)
            {
                clear();
            }
            if (goal == result) {
                Result.setText("YOU WIN");
                count5 = count5+10;
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(Main5Activity.this,Main6Activity.class);
                        finish();

                        startActivity(i);
                    }
                }, 450);
            }
            else{
                if(moves==0&&goal!=result)
                {
                    Result.setTextSize(65);Result.setTextSize(65);
                    Result.setText("YOU LOOSE");
                }
            }

        }
    }
    public void bclear(View view){
        clear();
    }
    public void clear(){
        TextView Result = (TextView) findViewById(R.id.answer);
        TextView move = (TextView) findViewById(R.id.moves);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
        mp.start();
        count5 = count5-5;
        moves = 3;
        result = 10;
        Result.setText("" + result);
        move.setText("MOVES: " + moves);
    }
    public void setClick(View view)
    {

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
        mp.start();

        Intent i=new Intent(Main5Activity.this,SettingActivity.class);
        TextView Level=(TextView)findViewById(R.id.level);
        i.putExtra("level5", count5);
        i.putExtra("calling-activity", MainActivity.ActivityConstants.ACTIVITY_5);


        i.putExtra("textViewText", Level.getText().toString());
        startActivity(i);

    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

package com.example.lenovo.button3d;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.logging.Level;

// level = 3
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    static int moves = 3 ;
    static int goal = 12;
    static int  result = 0;
    static int count1 = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Level.setText("LEVEL 1");
        move.setText("MOVES :"+moves);
        Result.setText(""+result);
        black2.setOnClickListener(this);
        black3.setOnClickListener(this);
        black1.setText("x4");
        black2.setText("+1");
        black3.setText("+2");
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        TextView myTextView = (TextView) findViewById(R.id.answer);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/digital.ttf");
        myTextView.setTypeface(typeface);

        }



    public interface ActivityConstants {
        public static final int ACTIVITY_1 = 1001;
        public static final int ACTIVITY_2 = 1002;
        public static final int ACTIVITY_3 = 1003;
        public static final int ACTIVITY_4 = 1004;
        public static final int ACTIVITY_5 = 1005;
        public static final int ACTIVITY_6 = 1006;
        public static final int ACTIVITY_7 = 1007;
        public static final int ACTIVITY_8 = 1008;
        public  static final int ACTIVITY_9 = 1009;
        public static final int ACTIVITY_10 = 1010;
        public static final int ACTIVITY_11 = 1011;
        public static final int ACTIVITY_12 = 1012;
        public static final int ACTIVITY_13 = 1013;
        public static final int ACTIVITY_14 = 1014;
        public static final int ACTIVITY_15 = 1015;

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
                    result = result * 4;
                    Result.setText("" + result);
                    --moves;
                    move.setText("MOVES: " + moves);

                    break;
                }
                case R.id.black2: {

                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
                    mp.start();
                    result = result + 1;
                    Result.setText("" + result);
                    --moves;
                    move.setText("MOVES: " + moves);
                    break;
                }
                case R.id.black3: {

                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
                    mp.start();
                    result = result + 2;
                    Result.setText("" + result);
                    --moves;
                    move.setText("MOVES: " + moves);
                    break;
                }

            }
            if (goal == result) {
                Result.setText("YOU WIN");
                count1 = count1+10;

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(i);

                    }
                }, 450);
            }
            else{
                if(moves==0&&goal!=result)
                {

                    Result.setTextSize(65);
                    Result.setText("YOU LOOSE");
                }
            }

        }
    }
    public void bclear(View view){
        TextView Result = (TextView) findViewById(R.id.answer);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
        mp.start();
        TextView move = (TextView) findViewById(R.id.moves);
        moves = 3;
        count1 = count1-5;
        result = 0;
        Result.setText("" + result);
        move.setText("MOVES: " + moves);
        }
        public void setClick(View view)
        {
            final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
            mp.start();
            TextView Level=(TextView)findViewById(R.id.level);
            Intent i=new Intent(MainActivity.this,SettingActivity.class);
            i.putExtra("level1", count1);
            i.putExtra("calling-activity", ActivityConstants.ACTIVITY_1);
            i.putExtra("textViewText", Level.getText().toString());
            startActivity(i);
        }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}








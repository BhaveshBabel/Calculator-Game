package com.example.lenovo.button3d;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tushar on 6/11/17.
 */

public class scoreActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score_layout);
        TextView level1 = (TextView) findViewById(R.id.level1);
        TextView level2 = (TextView) findViewById(R.id.level2);
        TextView level3 = (TextView) findViewById(R.id.level3);
        TextView level4 = (TextView) findViewById(R.id.level4);
        TextView level5 = (TextView) findViewById(R.id.level5);
        TextView level6 = (TextView) findViewById(R.id.level6);
        TextView level7 = (TextView) findViewById(R.id.level7);
        TextView level8 = (TextView) findViewById(R.id.level8);
        TextView level9 = (TextView) findViewById(R.id.level9);
        TextView level10 = (TextView) findViewById(R.id.level10);
        TextView level11 = (TextView) findViewById(R.id.level11);
        TextView level12 = (TextView) findViewById(R.id.level12);
        TextView level13 = (TextView) findViewById(R.id.level13);
        TextView level14 = (TextView) findViewById(R.id.level14);
        TextView level15 = (TextView) findViewById(R.id.level15);
        TextView myTextView = (TextView) findViewById(R.id.lel);
        TextView src = (TextView) findViewById(R.id.scr);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/digital.ttf");
        myTextView.setTypeface(typeface);
        src.setTypeface(typeface);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
        mp.start();
        List<Integer> list = getIntent().getExtras().getIntegerArrayList("code");
        level1.setText(""+list.get(0));
        level2.setText(""+list.get(1));
        level3.setText(""+list.get(2));
        level4.setText(""+list.get(3));
        level5.setText(""+list.get(4));
        level6.setText(""+list.get(5));
        level7.setText(""+list.get(6));
        level8.setText(""+list.get(7));
        level9.setText( ""+list.get( 8 ) );
        level10.setText( ""+list.get( 9 ) );
        level11.setText( ""+list.get( 10 ) );
        level12.setText( ""+list.get( 11 ) );
        level13.setText( ""+list.get( 12 ) );
        level14.setText( ""+list.get( 13 ) );
        level15.setText( ""+list.get( 14 ) );



    }
        public void back(View view)
    {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
        mp.start();
       Intent intent = new Intent(scoreActivity.this,SettingActivity.class);
       startActivity(intent);
    }
}
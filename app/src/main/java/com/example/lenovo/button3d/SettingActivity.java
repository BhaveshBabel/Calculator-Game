package com.example.lenovo.button3d;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.lenovo.button3d.Main10Activity.count9;
import static com.example.lenovo.button3d.Main11Activity.count10;
import static com.example.lenovo.button3d.Main12Activity.count11;
import static com.example.lenovo.button3d.Main13Activity.count12;
import static com.example.lenovo.button3d.Main14Activity.count13;
import static com.example.lenovo.button3d.Main15Activity.count14;
import static com.example.lenovo.button3d.Main16Activity.count15;
import static com.example.lenovo.button3d.Main2Activity.count2;
import static com.example.lenovo.button3d.Main3Activity.count3;
import static com.example.lenovo.button3d.Main4Activity.count4;
import static com.example.lenovo.button3d.Main5Activity.count5;
import static com.example.lenovo.button3d.Main6Activity.count6;
import static com.example.lenovo.button3d.Main7Activity.count7;
import static com.example.lenovo.button3d.Main8Activity.count8;
import static com.example.lenovo.button3d.MainActivity.count1;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {

    static int level = 1;
    static int moves = 3;
    static int goal = 12;
    static int result = 0;
    List<Integer> scoreArray = new ArrayList<Integer>();
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
        Button clear = (Button) findViewById(R.id.bclear);
        ImageButton setting = (ImageButton) findViewById(R.id.setting);
        Button black1 = (Button) findViewById(R.id.black1);
        Button black2 = (Button) findViewById(R.id.black2);
        Button black3 = (Button) findViewById(R.id.black3);
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button b4 = (Button) findViewById(R.id.b4);
        Button back = (Button) findViewById(R.id.back);
        Button ok = (Button) findViewById(R.id.black3);
        TextView Result = (TextView) findViewById(R.id.answer);
        TextView Level = (TextView) findViewById(R.id.level);

        Result = (TextView) findViewById(R.id.answer);
        Result.setText("PAUSED");
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Level = (TextView) findViewById(R.id.level);
            Level.setText(extras.getString("textViewText"));


        }

        findViewById(R.id.moves).setVisibility(View.GONE);
        TextView myTextView = (TextView) findViewById(R.id.answer);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/digital.ttf");
        myTextView.setTypeface(typeface);
        findViewById(R.id.goal).setVisibility(View.GONE);

        b1.setEnabled(false);
        black1.setEnabled(false);

        clear.setEnabled(false);
        black2.setEnabled(false);
        b2.setOnClickListener(this);
        b4.setOnClickListener(this);



        scoreArray.add(getIntent().getIntExtra("level1",count1));
        scoreArray.add(getIntent().getIntExtra("level2",count2 ));
        scoreArray.add(getIntent().getIntExtra("level3", count3));
        scoreArray.add(getIntent().getIntExtra("level4", count4));
        scoreArray.add(getIntent().getIntExtra("level5", count5));
        scoreArray.add(getIntent().getIntExtra("level6", count6));
        scoreArray.add(getIntent().getIntExtra("level7", count7));
        scoreArray.add(getIntent().getIntExtra("level8", count8));
        scoreArray.add(getIntent().getIntExtra("level9", count9));
        scoreArray.add(getIntent().getIntExtra("level10", count10));
        scoreArray.add(getIntent().getIntExtra("level11", count11));
        scoreArray.add(getIntent().getIntExtra("level12", count12));
        scoreArray.add(getIntent().getIntExtra("level13", count13));
        scoreArray.add(getIntent().getIntExtra("level14", count14));
        scoreArray.add(getIntent().getIntExtra("level15", count15));


    }


    public void setClick(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
        mp.start();
        int callingActivity = getIntent().getIntExtra("calling-activity", 0);


        switch (callingActivity) {
            case ActivityConstants.ACTIVITY_1:
                Intent intent = new Intent(SettingActivity.this,MainActivity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_2:
                intent = new Intent(SettingActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_3:
                intent = new Intent(SettingActivity.this,Main3Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_4:
                intent = new Intent(SettingActivity.this,Main4Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_5:
                intent = new Intent(SettingActivity.this,Main5Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_6:
                intent = new Intent(SettingActivity.this,Main6Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_7:
                intent = new Intent(SettingActivity.this,Main7Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_8:
                intent = new Intent(SettingActivity.this,Main8Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_9:
                intent = new Intent(SettingActivity.this,Main10Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_10:
                intent = new Intent(SettingActivity.this,Main11Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_11:
                intent = new Intent(SettingActivity.this,Main12Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_12:
                intent = new Intent(SettingActivity.this,Main13Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_13:
                intent = new Intent(SettingActivity.this,Main14Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_14:
                intent = new Intent(SettingActivity.this,Main15Activity.class);
                startActivity(intent);
                break;
            case ActivityConstants.ACTIVITY_15:
                intent = new Intent(SettingActivity.this,Main16Activity.class);
                startActivity(intent);
                break;
        }

    }
    public void okButton(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
        mp.start();
        switch (level) {


            case 1: {
                level = 1;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            }
            case 2: {
                level = 2;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main2Activity.class);
                startActivity(intent);
                break;
            }
            case 3: {
                level = 3;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main3Activity.class);
                startActivity(intent);
                break;
            }
            case 4: {
                level = 4;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main4Activity.class);
                startActivity(intent);
                break;
            }
            case 5: {
                level = 5;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main5Activity.class);
                startActivity(intent);
                break;
            }
            case 6: {
                level = 6;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main6Activity.class);
                startActivity(intent);
                break;
            }
            case 7: {
                level = 7;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main7Activity.class);
                startActivity(intent);
                break;
            }
            case 8: {
                level = 8;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main8Activity.class);
                startActivity(intent);
                break;
            }
            case 9: {
                level = 9;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main10Activity.class);
                startActivity(intent);
                break;
            }
            case 10: {
                level = 10;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main11Activity.class);
                startActivity(intent);
                break;
            }
            case 11: {
                level = 11;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main12Activity.class);
                startActivity(intent);
                break;
            }
            case 12: {
                level = 12;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main13Activity.class);
                startActivity(intent);
                break;
            }
            case 13: {
                level = 13;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main14Activity.class);
                startActivity(intent);
                break;
            }
            case 14: {
                level = 14;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main15Activity.class);
                startActivity(intent);
                break;
            }
            case 15: {
                level = 15;
                mp.start();
                Intent intent = new Intent(SettingActivity.this, Main16Activity.class);
                startActivity(intent);
                break;
            }
        }
    }

    @Override
    public void onClick(View v) {
        Button black2 = (Button) findViewById(R.id.black2);

        if (level >= 1 && level<=15) {

            switch (v.getId()) {


                case R.id.b2: {

                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
                    mp.start();
                    if(level!=1) {
                        --level;
                        black2.setText("Level" + level);
                    }
                    break;
                }
                case R.id.b4: {

                    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bclick);
                    mp.start();
                    if(level!=15) {
                        level++;
                        black2.setText("Level" + level);
                    }
                    break;
                }


            }

        }
    }
    public void score(View view)
    {

        Intent intent = new Intent(SettingActivity.this,scoreActivity.class);

        intent.putIntegerArrayListExtra("code", (ArrayList<Integer>) scoreArray);
        startActivity(intent);


    }

    @Override
    protected void onPause()
    {
        super.onPause();
        finish();
    }
}


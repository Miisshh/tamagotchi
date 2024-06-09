package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class Play_Activity extends AppCompatActivity {
    int counter = 0;
    private int Cpf = 0;
    private int Cpp = 0;
    private int Cph = 0;
    private int Cps = 0;
    private ProgressBar progressBar;
    private Button buttonFeed;
    private ProgressBar prBar;
    private Button buttonPut;
    private Button buttonSleep;
    private ProgressBar progressSleep;
    private Button buttonHealthy;
    private ProgressBar prHealthy;


    private Handler handler1;
    private Handler handler2;
    private Handler handler3;
    private Handler handler4;
    private Handler handler11;
    private Handler handler33;
    private Handler handler22;
    private Handler handler44;
    private Handler handler55;

    private int progress1 = 100;
    private int progress2 = 100;
    private int progress3 = 100;
    private int progress4 = 100;

    private ImageView imageView3;
    private ImageView imageView2;
    private ImageView imageView6;
    private ImageView imageView;
    private ImageView imageView4;
    private Button btn;

    private TextView timerTextView;

    private Handler handlerT;
    private int seconds = 0;
    private TextView timetv;
    private Button button_save;
    private Button button_get;
    private BreakIterator bestTimeTextView;

    private int bestTime = 0;
    private SharedPreferences pref;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        pref = getSharedPreferences("Date", MODE_PRIVATE);




        button_get = findViewById(R.id.button_get);
        button_save = findViewById(R.id.button_save);
        timetv = findViewById(R.id.TimeED);

        imageView3 = findViewById(R.id.imageView3);
        imageView2 = findViewById(R.id.imageView2);
        imageView = findViewById(R.id.imageView);
        imageView4 = findViewById(R.id.imageView4);
        imageView6 = findViewById(R.id.imageView6);


        handlerT = new Handler();

        btn = findViewById(R.id.gm_or);
//////////////////////
        progressBar = findViewById(R.id.prbFeed);
        buttonFeed = findViewById(R.id.buttonFeed);

        handler1 = new Handler();
        handler11 = new Handler();


        handler1.postDelayed(new Runnable() {
            @Override
            public void run() {

                if (progress1 > 0) {
                    progress1 -= 10;
                    progressBar.setProgress(progress1);

                    handler1.postDelayed(this, 3000);
                }
            }
        }, 100);


        handler11.postDelayed(new Runnable() {
            @Override
            public void run() {

                if (progress1 <= 50) {
                    imageView3.setVisibility(View.VISIBLE);
                } else {
                    imageView3.setVisibility(View.INVISIBLE);
                }

                handler11.postDelayed(this, 100);
            }

        }, 100);


        buttonFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (progress1 < 100) {
                    progress1 += 10;
                    progressBar.setProgress(progress1);

                }
            }
        });

/////////
        prBar = findViewById(R.id.prbPut);
        buttonPut = findViewById(R.id.buttonPut);

        handler2 = new Handler();
        handler22 = new Handler();

        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {

                if (progress2 > 0) {
                    progress2 -= 10;
                    prBar.setProgress(progress2);

                    handler2.postDelayed(this, 3000);
                }
            }
        }, 100);


        buttonPut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                imageView2.setVisibility(View.VISIBLE);

                handler22.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView2.setVisibility(View.INVISIBLE);
                    }
                }, 1000);


                if (progress2 < 100) {
                    progress2 += 10;
                    prBar.setProgress(progress2);
                }
            }
        });

///////


        progressSleep = findViewById(R.id.prbSleep);
        buttonSleep = findViewById(R.id.buttonSleep);

        handler3 = new Handler();
        handler33 = new Handler();

        handler3.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (progress3 > 0) {
                    progress3 -= 10;
                    progressSleep.setProgress(progress3);

                    handler3.postDelayed(this, 3000);
                }
            }
        }, 100);

        buttonSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView6.setVisibility(View.VISIBLE);

                handler33.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView6.setVisibility(View.INVISIBLE);
                    }
                }, 1000);

                if (progress3 < 100) {
                    progress3 += 10;
                    progressSleep.setProgress(progress3);
                }
            }
        });
//////

        prHealthy = findViewById(R.id.prbHlth);
        buttonHealthy = findViewById(R.id.buttonHealthy);

        handler4 = new Handler();
        handler44 = new Handler();

        handler4.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (progress4 > 0) {
                    progress4 -= 10;
                    prHealthy.setProgress(progress4);

                    handler4.postDelayed(this, 3000);
                }
            }
        }, 100);

        handler44.postDelayed(new Runnable() {
            @Override
            public void run() {

                if (progress1 == 0 && progress4 == 0) {
                    imageView4.setVisibility(View.VISIBLE);
                } else {
                    imageView4.setVisibility(View.INVISIBLE);
                }

                handler44.postDelayed(this, 100);
            }

        }, 100);

        buttonHealthy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress4 < 100) {
                    progress4 += 10;
                    prHealthy.setProgress(progress4);
                }
            }
        });


        handler55 = new Handler();

        handler55.postDelayed(new Runnable() {
            @Override
            public void run() {

                if (progress1 == 0 && progress2 == 0 && progress3 == 0 && progress4 == 0) {
                    btn.setVisibility(View.VISIBLE);
                }

                handler55.postDelayed(this, 3000);
            }

        }, 100);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Play_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        };


        btn.setOnClickListener(listener);

        /////////////////////////////////////////
        timerTextView = findViewById(R.id.timerTextView);

        startTimer();


    }


    private void startTimer() {
        handlerT.post(new Runnable() {

            @Override
            public void run() {
                int minutes = seconds / 60;
                int sec = seconds % 60;
                timerTextView.setText(String.format("Время: %02d:%02d", minutes, sec));

                seconds++;

                if (progress1 == 0 && progress2 == 0 && progress3 == 0 && progress4 == 0) {
                    handlerT.removeCallbacks(this);
                } else {
                    handlerT.postDelayed(this, 1000);
                }


            }
        });

        
    }

    public void onClickSave(View view)
    {
        SharedPreferences.Editor edit = pref.edit();
        edit.putString("save_key", timetv.getText().toString());
        edit.apply();

    }

    public void onClickGet(View view)
    {
        timetv.setText(pref.getString("save_key", "не установлено "));



    }
}

























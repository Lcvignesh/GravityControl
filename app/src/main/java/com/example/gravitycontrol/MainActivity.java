package com.example.gravitycontrol;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout myLayout = null;
    ImageView time,power,soul,mind,space ;
    long s = 3000, counter = 0;
    double mi,ma,x,m;
    int p;
    float y;



    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soul = (ImageView) findViewById(R.id.imageView);
        space = (ImageView) findViewById(R.id.imageView2);
        power = (ImageView) findViewById(R.id.imageView3);
        time = (ImageView) findViewById(R.id.imageView4);
        mind = (ImageView) findViewById(R.id.imageView5);

        time.setVisibility(time.GONE);
        soul.setVisibility(soul.GONE);
        mind.setVisibility(mind.GONE);
        power.setVisibility(power.GONE);
        space.setVisibility(space.GONE);

        myLayout = findViewById(R.id.myLayout);
        myLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "counter="+counter, Toast.LENGTH_SHORT).show();
                mi =  (double) 200;
                ma =  (double) 1000;
                x = getRandomDoubleBetweenRange(mi,ma);

                if(counter==0) {
                    placeImage(x);
                }


                else if (counter%2==1)
                {
                    downtime(x);
                    downmind(x);
                    downspace(x);
                    downpower(x);
                    downsoul(x);
                }

                else if(counter % 2 == 0)
                {
                    uptime();
                    upspace();
                    upsoul();
                    uppower();
                    upmind();
                }

                 counter++;

            }
        });
    }

    public void placeImage(double x)
    {   y = (float) x;
        time.setY(y);
        power.setY(y);
        soul.setY(y);
        mind.setY(y);
        space.setY(y);

        time.setVisibility(time.VISIBLE);
        power.setVisibility(power.VISIBLE);
        mind.setVisibility(mind.VISIBLE);
        space.setVisibility(space.VISIBLE);
        soul.setVisibility(soul.VISIBLE);
    }

    public void downtime(double x){
            p = (int) x;
            ObjectAnimator animatorY = ObjectAnimator.ofFloat(time, "y",1400f);
            animatorY.setDuration(s);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorY);
            animatorSet.start();}

    public void downmind(double x) {
        p = (int) x;
        ObjectAnimator animatormY = ObjectAnimator.ofFloat(mind, "y",  1400f);
        animatormY.setDuration(s);
        AnimatorSet animatorSetm = new AnimatorSet();
        animatorSetm.playTogether(animatormY);
        animatorSetm.start();
    }

    public void downpower(double x)     {
            p = (int) x;
            ObjectAnimator animatorpY = ObjectAnimator.ofFloat(power, "y",  1400f);
            animatorpY.setDuration(s);
            AnimatorSet animatorSetp = new AnimatorSet();
            animatorSetp.playTogether(animatorpY);
            animatorSetp.start(); }

    public void downsoul(double x) {
        p = (int) x;
        ObjectAnimator animatorsY = ObjectAnimator.ofFloat(soul, "y",  1400f);
        animatorsY.setDuration(s);
        AnimatorSet animatorSets = new AnimatorSet();
        animatorSets.playTogether(animatorsY);
        animatorSets.start();
    }

    public void downspace(double x) {

            p = (int) x;
            ObjectAnimator animatorspY = ObjectAnimator.ofFloat(space, "y",  1400f);
            animatorspY.setDuration(s);
            AnimatorSet animatorSetsp = new AnimatorSet();
            animatorSetsp.playTogether(animatorspY);
            animatorSetsp.start();
        }


    public void uptime() {

        ObjectAnimator animatorY = ObjectAnimator.ofFloat(time, "y",  0f);
        animatorY.setDuration(s);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorY);
        animatorSet.start();

    }

    public void upmind() {

        ObjectAnimator animatormY = ObjectAnimator.ofFloat(mind, "y",  0f);
        animatormY.setDuration(s);
        AnimatorSet animatorSetm = new AnimatorSet();
        animatorSetm.playTogether(animatormY);
        animatorSetm.start();
    }

    public void uppower() {

        ObjectAnimator animatorpY = ObjectAnimator.ofFloat(power, "y",  0f);
        animatorpY.setDuration(s);
        AnimatorSet animatorSetp = new AnimatorSet();
        animatorSetp.playTogether(animatorpY);
        animatorSetp.start();
}

     public void upsoul() {

         ObjectAnimator animatorsY = ObjectAnimator.ofFloat(soul, "y",  0f);
         animatorsY.setDuration(s);
         AnimatorSet animatorSets = new AnimatorSet();
         animatorSets.playTogether(animatorsY);
         animatorSets.start();
     }

      public void upspace() {

        ObjectAnimator animatorspY = ObjectAnimator.ofFloat(space, "y", 0f);
        animatorspY.setDuration(s);
        AnimatorSet animatorSetsp = new AnimatorSet();
        animatorSetsp.playTogether(animatorspY);
        animatorSetsp.start();
    }


    }


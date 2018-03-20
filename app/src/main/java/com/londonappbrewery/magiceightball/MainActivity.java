package com.londonappbrewery.magiceightball;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.londonappbrewery.magiceightball.R;

import java.util.Random;
import java.util.RandomAccess;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myButton = (Button)findViewById(R.id.askButton);
        final ImageView BallDisply = (ImageView) findViewById(R.id.image_eightBall) ;

        final  int[] ballArray ={   R.drawable.ball1,
                                    R.drawable.ball2,
                                    R.drawable.ball3,
                                    R.drawable.ball4,
                                    R.drawable.ball5
                                };




        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random  randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(5);

                BallDisply.setImageResource( ballArray[number]);

            }
        });




    }
}

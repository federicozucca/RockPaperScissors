package com.example.user.rockpaperscissor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */



    public class Welcome extends AppCompatActivity {
        TextView welcome;
        Button playButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            Log.d("RockPaperScissors", "onCreateCalled");
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);

            welcome = (TextView) findViewById(R.id.welcome_text);
            playButton = (Button) findViewById(R.id.play_button);

            playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("Welcome", "play button clicked");




                Intent intent = new Intent(Welcome.this, RockPaperScissors.class);

                startActivity(intent);
            }
            });
        }

    }

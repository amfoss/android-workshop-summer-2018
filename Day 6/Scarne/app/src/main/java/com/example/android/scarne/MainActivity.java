package com.example.android.scarne;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    int scoreComputer=0, scorePlayer=0, turnScoreComputer=0, turnScorePlayer=0;

    String userScoreText = "Your score : ";
    String compScoreText = " Computer score : ";
    String userTurnScoreText = " Your turn score : ";
    String compTurnScoreText = " Computer turn score : ";

    String Text = userScoreText + scorePlayer + compScoreText + scoreComputer;

    int[] drawables ={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};

    TextView text;
    TextView winnerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.score);
        text.setText(Text);
    }

    private int rollDice(){
        Random random = new Random();
        int randomNumber = random.nextInt(6)+1;
        return randomNumber;
    }

    public void rollButtonClick(View v){
//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                winnerView.setText("");
//            }
//        });
        int number = rollDice();
        ImageView imageView = findViewById(R.id.dice_image);
        imageView.setImageResource(drawables[number-1]);
        if(number==1){
            turnScorePlayer=0;
            computerTurn();
        }
        else{
            turnScorePlayer+=number;
        }
        Text = userScoreText + scorePlayer + compScoreText + scoreComputer + userTurnScoreText + turnScorePlayer;
        text.setText(Text);
    }

    public void holdButtonClick(View v){

        scorePlayer+=turnScorePlayer;
        turnScorePlayer=0;

        Text = userScoreText + scorePlayer + compScoreText + scoreComputer;
        text.setText(Text);

        checkWinner();

        computerTurn();
    }

    public void checkWinner(){
        if(scoreComputer>=50){
            winnerView = findViewById(R.id.winner);
            winnerView.setText("Computer won!");
            resetButtons();
        }
        else if(scorePlayer>=50){
            winnerView = findViewById(R.id.winner);
            winnerView.setText("You won!");
            resetButtons();
        }

    }

    public void resetButtons(){
        scoreComputer=0;
        scorePlayer=0;
        turnScoreComputer=0;
        turnScorePlayer=0;
    }

    public void resetButtonClick(View v){
        resetButtons();
        Text = userScoreText + scorePlayer + compScoreText + scoreComputer;
        text.setText(Text);
    }

    public void enableButtons(boolean enable){
        Button rollButton = findViewById(R.id.roll_button);
        Button holdButton = findViewById(R.id.hold_button);
        rollButton.setEnabled(enable);
        holdButton.setEnabled(enable);
    }

    public void computerTurn() {
        enableButtons(false);

        Thread thread = new Thread(){
            int number;
            ImageView imageView;
            @Override
            public void run(){
                while (true) {
                    number = rollDice();
                    imageView = findViewById(R.id.dice_image);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            imageView.setImageResource(drawables[number - 1]);
                        }
                    });

                    if (number == 1) {
                        turnScoreComputer = 0;
                        Text = userScoreText + scorePlayer + compScoreText + scoreComputer + compTurnScoreText + turnScoreComputer;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                text.setText(Text);
                                enableButtons(true);
                            }
                        });
                        return;
                    }
                    else {
                        turnScoreComputer += number;
                        Text = userScoreText + scorePlayer + compScoreText + scoreComputer + compTurnScoreText + turnScoreComputer;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                text.setText(Text);
                            }
                        });
                    }

                    if (turnScoreComputer > 10) {
                        scoreComputer += turnScoreComputer;
                        turnScoreComputer = 0;

                        Text = userScoreText + scorePlayer + compScoreText + scoreComputer;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                text.setText(Text);
                                enableButtons(true);
                                checkWinner();
                            }
                        });
                        return;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }

        };
        thread.start();
    }
}

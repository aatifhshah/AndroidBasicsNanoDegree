package com.example.laviathor.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /*
    * Adds 3 points for Team A
    * */
    public void threePointerForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA();
    }

    /*
    * Adds 2 points for Team A
    * */
    public void twoPointerForTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA();
    }

    /*
    * Adds 1 points for Team A
    * */
    public void freeThrowForTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA();
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /*
    * Adds 3 points for Team B
    * */
    public void threePointerForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB();
    }

    /*
    * Adds 2 points for Team B
    * */
    public void twoPointerForTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB();
    }

    /*
    * Adds 1 points for Team B
    * */
    public void freeThrowForTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB();
    }

    /*
    * Reset both Scores
    * */
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}

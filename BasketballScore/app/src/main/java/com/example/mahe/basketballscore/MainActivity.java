package com.example.mahe.basketballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0, teamBScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void teamAPlusThree(View v) {
        teamAScore+=3;
        displayForTeamA(teamAScore);
    }

    public void teamAPlusTwo(View v) {
        teamAScore+=2;
        displayForTeamA(teamAScore);
    }

    public void teamAPlusOne(View v) {
        teamAScore++;
        displayForTeamA(teamAScore);
    }

    private void displayForTeamA(int score) {
        TextView teamA_score = (TextView) findViewById(R.id.teamA_score);
        teamA_score.setText(""+score);
    }

//    For team B
    public void teamBPlusThree(View v) {
        teamBScore+=3;
        displayForTeamB(teamBScore);
    }

    public void teamBPlusTwo(View v) {
        teamBScore+=2;
        displayForTeamB(teamBScore);
    }

    public void teamBPlusOne(View v) {
        teamBScore++;
        displayForTeamB(teamBScore);
    }

    private void displayForTeamB(int score) {
        TextView teamB_score = (TextView) findViewById(R.id.teamB_score);
        teamB_score.setText(""+score);
    }

    public void reset(View v) {
        teamAScore=0;
        teamBScore=0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}

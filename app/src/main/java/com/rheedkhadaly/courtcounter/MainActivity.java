package com.rheedkhadaly.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    TextView scoreViewA;
    TextView scoreViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsA(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public void addTwoPointsA(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void addFreeThrowA(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    public void addThreePointsB(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void addTwoPointsB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void addFreeThrowB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void resetScore(View view) {
        resetScore();
    }

    public void displayForTeamA(int scoreA) {
        scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB) {
        scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }

    public void resetScore() {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}

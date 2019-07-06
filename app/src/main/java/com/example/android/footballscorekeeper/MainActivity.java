package com.example.android.footballscorekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTeamAScore;
    private TextView mTeamBScore;
    private TextView mTeamAFouls;
    private TextView mTeamBFouls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTeamAScore = findViewById(R.id.team_a_goals);
        mTeamBScore = findViewById(R.id.team_b_goals);
        mTeamAFouls = findViewById(R.id.team_a_foul);
        mTeamBFouls = findViewById(R.id.team_b_foul);

        Button teamAScoreBtn = findViewById(R.id.team_a_add_goal);
        Button teamBScoreBtn = findViewById(R.id.team_b_add_goal);
        Button teamAFoulsBtn = findViewById(R.id.team_a_add_foul);
        Button teamBFoulsBtn = findViewById(R.id.team_b_add_foul);
        Button resetBtn = findViewById(R.id.reset);

        teamAScoreBtn.setOnClickListener(this);
        teamBScoreBtn.setOnClickListener(this);
        teamAFoulsBtn.setOnClickListener(this);
        teamBFoulsBtn.setOnClickListener(this);
        resetBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.team_a_add_goal:
                mTeamAScore.setText(String.valueOf(Integer.parseInt(mTeamAScore.getText().toString()) + 1));
                break;
            case R.id.team_b_add_goal:
                mTeamBScore.setText(String.valueOf(Integer.parseInt(mTeamBScore.getText().toString()) + 1));
                break;
            case R.id.team_a_add_foul:
                mTeamAFouls.setText(String.valueOf(Integer.parseInt(mTeamAFouls.getText().toString()) + 1));
                break;
            case R.id.team_b_add_foul:
                mTeamBFouls.setText(String.valueOf(Integer.parseInt(mTeamBFouls.getText().toString()) + 1));
                break;
            case R.id.reset:
                mTeamAScore.setText(String.valueOf(0));
                mTeamBScore.setText(String.valueOf(0));
                mTeamAFouls.setText(String.valueOf(0));
                mTeamBFouls.setText(String.valueOf(0));
                break;

        }
    }
}

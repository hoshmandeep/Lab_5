package com.example.hoshman_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    private TextView Team_Black_Demons_TV;
    private TextView Team_Red_DemonsTV;

    private int inc;
    private int Team_Black_Demons_Score;
    private int Team_Red_Demons_Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Team_Black_Demons_Score = 0;
        Team_Red_Demons_Score = 0;


        RadioGroup radioGroup = findViewById(R.id.radio_group);

        Team_Black_Demons_TV = findViewById(R.id.team_black_score);
        Team_Red_DemonsTV = findViewById(R.id.team_red_score);

        Team_Red_DemonsTV.setText(Integer.toString(Team_Red_Demons_Score));
        Team_Black_Demons_TV.setText(Integer.toString(Team_Black_Demons_Score));

        Button upButton_team_black = findViewById(R.id.team_black_up);
        Button downButton_team_black= findViewById(R.id.team_black_down);
        Button upButton_team_red = findViewById(R.id.team_red_up);
        Button downButton_team_red = findViewById(R.id.team_red_down);


        radioGroup.setOnCheckedChangeListener(this);
        upButton_team_black.setOnClickListener(this);
        downButton_team_black.setOnClickListener(this);
        upButton_team_red.setOnClickListener(this);
        downButton_team_red.setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radio_group, int i) {

        switch (i){
            case 1:
                inc = 1;
                break;
            case 2:
                inc = 2;
                break;
            case 3:
                inc = 3;
                break;
        }
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){
            case R.id.team_black_up:
                Team_Black_Demons_Score += inc;
                Team_Black_Demons_TV.setText(Integer.toString(Team_Black_Demons_Score));
                break;
            case R.id.team_black_down:
                Team_Black_Demons_Score -= inc;
                Team_Black_Demons_TV.setText(Integer.toString(Team_Black_Demons_Score));
                break;
            case R.id.team_red_up:
                Team_Red_Demons_Score += inc;
                Team_Red_DemonsTV.setText(Integer.toString(Team_Red_Demons_Score));
                break;
            case R.id.team_red_down:
                Team_Red_Demons_Score -= inc;
                Team_Red_DemonsTV.setText(Integer.toString(Team_Red_Demons_Score));
                break;
        }
    }
}
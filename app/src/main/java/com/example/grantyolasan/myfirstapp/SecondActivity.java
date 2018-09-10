package com.example.grantyolasan.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }
    public void showRandomNumber(){
        TextView ranView = (TextView) findViewById(R.id.textview_random);
        TextView headingView = (TextView) findViewById(R.id.textView_label);
        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        Random random = new Random();
        int ranInt = 0;
        if (count>0){
            ranInt = random.nextInt(count);
        }

        ranView.setText(Integer.toString(ranInt));
        headingView.setText(getString(R.string.random_heading, count));
    }
}

package com.example.grantyolasan.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static final String TOTAL_COUNT="total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toastMe(View view){
        Toast myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void countMe(View view){
        TextView showCount = (TextView) findViewById(R.id.textView);
        String countString = showCount.getText().toString();
        Integer count = Integer.parseInt(countString);
        count++;
        showCount.setText(count.toString());
    }
    public void restartCount(View view){
        TextView showCount = (TextView) findViewById(R.id.textView);
        Integer zero = 0;
        showCount.setText(zero.toString());
    }
    public void addRandomNumber(View view){
        TextView showCount = (TextView) findViewById(R.id.textView);
        Integer ran = (int) (Math.random()*10+1);
        Integer count = Integer.parseInt(showCount.getText().toString());
        Integer sum = ran+count;
        showCount.setText(sum.toString());
    }
    public void randomMe(View view){
        //get the text view that shows the count
        TextView showCount = (TextView) findViewById(R.id.textView);
        //convert it to an int
        Integer count = Integer.parseInt(showCount.getText().toString());
        //create new intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);
        //add the count to the extras for the Intent
        randomIntent.putExtra(TOTAL_COUNT, count);
        startActivity(randomIntent);

    }

}

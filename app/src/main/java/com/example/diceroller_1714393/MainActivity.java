package com.example.diceroller_1714393;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.lang.String;


public class MainActivity extends AppCompatActivity {
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void on_button_click(View view){

        TextView NumberTxt = this.findViewById(R.id.numberTextView);
        TextView CongratsTxt = this.findViewById(R.id.congratsTextView);

        TextView  PointsTxt = this.findViewById(R.id.pointsTextView);


        EditText UserNumInput = this.findViewById(R.id.editText);
        int NumInput = Integer.valueOf(UserNumInput.getText().toString());

        Random rand = new Random();
        int number = rand.nextInt(6 ) +1;

        NumberTxt.setText(Integer.toString(number));

        if (NumInput == number){
            CongratsTxt.setText("Congratulations!");
            points = points + 1;
            PointsTxt.setText(Integer.toString(points));
        }
        else{
            CongratsTxt.setText("");
        }

    }
}

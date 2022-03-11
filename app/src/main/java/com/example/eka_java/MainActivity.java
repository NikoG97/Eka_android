package com.example.eka_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.KeyEvent.KEYCODE_ENTER;

public class MainActivity extends AppCompatActivity {
    String toPrint;
    TextView text;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        text.setText("This textbox has not been disturbed");
        input = (EditText) findViewById(R.id.inputText);
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) { //This method scans for key up since it sends only one one value per keypress, where as keydown sends several
        if (keyCode == KeyEvent.KEYCODE_ENTER){
           toPrint = input.getText().toString();
           text.setText(toPrint);
            //text.setText("Now it changed");
            return true;
        }
        return false;
    }


    public void buttonPress(View v){         //This method copies the text from input textbox when the button is pressed
        System.out.println("Hello World!");
        toPrint = input.getText().toString();
        text.setText(toPrint);
    }


}
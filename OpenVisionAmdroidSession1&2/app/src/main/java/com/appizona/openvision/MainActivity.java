package com.appizona.openvision;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private Button myButtonET;
    private EditText myEditText;
    private TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        setListenersNew();
//        setListenersOld() ;


    }

    private void setListenersNew() {
        button.setOnClickListener(this);
        myButtonET.setOnClickListener(this);
    }

    private void setListenersOld() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hey I'm Clicked From JAVA!", Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Hey I'm Long Clicked From JAVA!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        myButtonET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = myEditText.getText().toString();
                myTextView.setText(message);
                myButtonET.setBackgroundColor(Color.BLACK);
                myTextView.setBackgroundColor(Color.BLUE);
                myButtonET.setTextColor(Color.WHITE);
                myButtonET.setClickable(false);
            }
        });

        myEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    myEditText.setBackgroundColor(Color.YELLOW);
                } else {
                    myEditText.setBackgroundColor(Color.CYAN);
                }
            }
        });
    }

    private void initUI() {
        button = (Button) findViewById(R.id.my_button2_id);
        myButtonET = (Button) findViewById(R.id.my_button_ET);
        myEditText = (EditText) findViewById(R.id.my_edit_text);
        myTextView = (TextView) findViewById(R.id.my_text_view);
    }

    public void call(View view) {
        Toast.makeText(this, "Hey I'm Clicked From XML!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.my_button_ET:
                handleMyButtonETClick();
                break;

            case R.id.my_button2_id:
                Toast.makeText(MainActivity.this, "Hey I'm Clicked From JAVA!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void handleMyButtonETClick() {
        String message = myEditText.getText().toString();
        myTextView.setText(message);
        myButtonET.setBackgroundColor(Color.BLACK);
        myTextView.setBackgroundColor(Color.BLUE);
        myButtonET.setTextColor(Color.WHITE);
        myButtonET.setClickable(false);
    }
}

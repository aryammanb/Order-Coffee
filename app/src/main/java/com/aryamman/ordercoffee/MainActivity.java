package com.aryamman.ordercoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    TextView message;
    EditText name;
    EditText number;
    Button submit;
    TextView last;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        last = (TextView) findViewById(R.id.final_message);
        message = (TextView) findViewById(R.id.text);
        name = (EditText) findViewById(R.id.name);
        number = (EditText) findViewById(R.id.num);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalprice;
                totalprice = 2*(Integer.valueOf(number.getText().toString()));
                String user;
                user = name.getText().toString();
                last.setText("Hello "+user+". Your total is $"+String.valueOf(totalprice));
            }
        });
    }

}

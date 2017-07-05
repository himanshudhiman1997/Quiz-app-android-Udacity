package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox check41,check42,check43,check44;
    RadioButton radio1,radio2,radio3;
    EditText edit1 , edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check41 = (CheckBox) findViewById(R.id.check41_box);
        check42 = (CheckBox) findViewById(R.id.check42_box);
        check43 = (CheckBox) findViewById(R.id.check43_box);
        check44 = (CheckBox) findViewById(R.id.check44_box);

        radio1 = (RadioButton) findViewById(R.id.radio21_view);
        radio2 = (RadioButton) findViewById(R.id.radio61_view);
        radio3 = (RadioButton) findViewById(R.id.rad_but);

        edit1 = (EditText) findViewById(R.id.edit3_view);
        edit2 = (EditText) findViewById(R.id.edit5_view);
    }
    public void submitans(View view)
    {
        int count=0;
        if(radio1.isChecked())
        {
            count++;
        }
        if(radio2.isChecked())
        {
            count++;
        }
        if(radio3.isChecked())
        {
            count++;
        }
        if(check41.isChecked() && !check42.isChecked() && check43.isChecked() && !check44.isChecked())
        {
            count++;
        }
        String editans1 ="Indira Gandhi";
        if(edit1.getText().toString().equalsIgnoreCase(editans1))
        {
            count++;

        }
        String editans2="Malcolm Turnbull";
        if(edit2.getText().toString().equalsIgnoreCase(editans2))
        {
            count++;
        }
        if(count==6)
        {
            Toast.makeText(this,"all answers are correct...",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"all answers are not correct...",Toast.LENGTH_SHORT).show();
        }
        TextView msg = (TextView) findViewById(R.id.result_text_view);
        msg.setText("Total correct answers:  "+ count);
    }
}

package com.phone;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity{

    EditText et;
    Button call_btn, BackButton;
    Button Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button9,Button10,Button11,Button12;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button1 = (Button) findViewById(R.id.b1);
        Button2 = (Button) findViewById(R.id.b2);
        Button3 = (Button) findViewById(R.id.b3);
        Button4 = (Button) findViewById(R.id.b4);
        Button5 = (Button) findViewById(R.id.b5);
        Button6 = (Button) findViewById(R.id.b6);
        Button7 = (Button) findViewById(R.id.b7);
        Button8 = (Button) findViewById(R.id.b8);
        Button9 = (Button) findViewById(R.id.b9);
        Button10 = (Button) findViewById(R.id.b10);
        Button11 = (Button) findViewById(R.id.b11);
        Button12 = (Button) findViewById(R.id.b12);
        BackButton = (Button) findViewById(R.id.back);
        et=(EditText)findViewById(R.id.editText1);
        call_btn=(Button)findViewById(R.id.button1);
        et.setSelection(et.getText().length());


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("1");
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("2");
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("3");
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("4");
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("5");
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("6");
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("7");
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("8");
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("9");
            }
        });
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("*");
            }
        });
        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("0");
            }
        });
        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.append("#");
            }
        });
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = et.getText().toString();
                et.setText(text.substring(0, text.length() - 1));
                et.setSelection(et.getText().length());
            }
        });

        call_btn.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+et.getText().toString()));
                startActivity(i);
            }
        });
    }
}

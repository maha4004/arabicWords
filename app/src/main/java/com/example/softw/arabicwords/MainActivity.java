package com.example.softw.arabicwords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;


public class MainActivity extends AppCompa{

    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });

    }

    public void show(){
        shuffle();
        textView.setText(array[1].getText());}

    Facts f01 = new Facts("نتوء");
    Facts f02 = new Facts("سلام");
    Facts f03 = new Facts("نور");
    Facts f04 = new Facts("حب");
    Facts f05 = new Facts("اجتياح");
    Facts f06 = new Facts("تشتت");
    Facts f07 = new Facts("ضجر");
    Facts f08 = new Facts("يقين");

    Facts[] array = new Facts[]{f01,f02,f03,f04,f05,f06,f07,f08};

    public void shuffle(){
        Collections.shuffle(Arrays.asList(array));
    }
}

package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mGoButton;
    private EditText mPluralNoun1;
    private EditText mPluralNoun2;
    private EditText mVerb1;
    private EditText mNoun1;
    private EditText mIngVerb;
    private EditText mPluralNoun3;
    private EditText mNoun2;
    private EditText mPluralNoun4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPluralNoun1 = (EditText) findViewById(R.id.pluralNoun1);
        mPluralNoun2 = (EditText) findViewById(R.id.pluralNoun2);
        mVerb1 = (EditText) findViewById(R.id.verb1);
        mNoun1 = (EditText) findViewById(R.id.noun1);
        mIngVerb = (EditText) findViewById(R.id.ingVerb);
        mPluralNoun3 = (EditText) findViewById(R.id.pluralNoun3);
        mNoun2 = (EditText) findViewById(R.id.noun2);
        mPluralNoun4 = (EditText) findViewById(R.id.pluralNoun4);
        mGoButton = (Button) findViewById(R.id.goButton);
        mGoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String pluralNoun1 = mPluralNoun1.getText().toString();
                String pluralNoun2 = mPluralNoun2.getText().toString();
                String verb1 = mVerb1.getText().toString();
                String noun1 = mNoun1.getText().toString();
                String ingVerb = mIngVerb.getText().toString();
                String pluralNoun3 = mPluralNoun3.getText().toString();
                String noun2 = mNoun2.getText().toString();
                String pluralNoun4 =  mPluralNoun4.getText().toString();
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("pluralNoun1", pluralNoun1);
                intent.putExtra("pluralNoun2", pluralNoun2);
                intent.putExtra("verb1", verb1);
                intent.putExtra("noun1", noun1);
                intent.putExtra("ingVerb", ingVerb);
                intent.putExtra("pluralNoun3", pluralNoun3);
                intent.putExtra("noun2", noun2);
                intent.putExtra("pluralNoun4", pluralNoun4);
                startActivity(intent);
            }
        });


    }
}

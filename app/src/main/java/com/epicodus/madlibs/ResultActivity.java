package com.epicodus.madlibs;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    //    private TextView mPluralNoun1;
//    private TextView mPluralNoun2;
//    private TextView mVerb1;
//    private TextView mNoun1;
//    private TextView mIngVerb;
//    private TextView mPluralNoun3;
//    private TextView mNoun2;
//    private TextView mPluralNoun4;
    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        mResultTextView = (TextView) findViewById(R.id.resultTextView);
        Intent intent = getIntent();
        String mPluralNoun1 = intent.getStringExtra("pluralNoun1");
        String mPluralNoun2 = intent.getStringExtra("pluralNoun2");
        String mVerb1 = intent.getStringExtra("verb1");
        String mNoun1 = intent.getStringExtra("noun1");
        String mIngVerb = intent.getStringExtra("ingVerb");
        String mPluralNoun3 = intent.getStringExtra("pluralNoun3");
        String mNoun2 = intent.getStringExtra("noun2");
        String mPluralNoun4 = intent.getStringExtra("pluralNoun4");
        String result = String.format("When I go to the arcade with my %s there are lots of games to play. I spend lots of time there with my friends. In \"Xmen\" you can be different %s. The point of the game is to %s every robot. You also need to save people, and then you can go to the next level. In \"Star Wars\" you are Luke Skywalker and you try to destroy every %s . In a car racing / motorcycle racing game you need to beat every computerized vehicle that you are %s against. There are a whole lot of other cool games. When you play some games you win %s for certain scores. Once you're done you can cash in your tickets to get a big %s. You can save your %s for another time. When I went to this arcade I didn't believe how much fun it would be. You might annoy your parents by asking them over and over if you can go back to there. So far I have had a lot of fun every time I've been to this great arcade! ", mPluralNoun1, mPluralNoun2, mVerb1, mNoun1, mIngVerb, mPluralNoun3, mNoun2, mPluralNoun4);
        mResultTextView.setText(result);

    }
}


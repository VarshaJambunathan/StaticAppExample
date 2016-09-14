package com.example.user.staticappexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class CardViewList extends AppCompatActivity {

    CardView mPreReq;
    CardView mStory;
    CardView mBhavani;
    CardView mDatta;
    CardView mChalisa;
    CardView mArchana;
    CardView mNaivedya;
    CardView mArati;
    CardView mPromises;
    CardView mGlossary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_list);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Give us a feedback ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mPreReq=(CardView)findViewById(R.id.t1);
        mStory=(CardView)findViewById(R.id.t2);
        mBhavani=(CardView)findViewById(R.id.t3);
        mDatta=(CardView)findViewById(R.id.t4);
        mChalisa=(CardView)findViewById(R.id.t5);
        mArchana=(CardView)findViewById(R.id.t6);
        mArati=(CardView)findViewById(R.id.t7);
        mNaivedya=(CardView)findViewById(R.id.t8);
        mPromises=(CardView)findViewById(R.id.t9);
        mGlossary=(CardView)findViewById(R.id.t10);

        mPreReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),DisplayScreen.class);
                startActivity(i);
            }
        });
    }
}

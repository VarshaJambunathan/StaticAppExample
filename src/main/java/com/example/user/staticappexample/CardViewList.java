package com.example.user.staticappexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class CardViewList extends AppCompatActivity implements View.OnClickListener {

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
        mPreReq.setOnClickListener(this);
        mStory=(CardView)findViewById(R.id.t2);
        mStory.setOnClickListener(this);
        mBhavani=(CardView)findViewById(R.id.t3);
        mBhavani.setOnClickListener(this);
        mDatta=(CardView)findViewById(R.id.t4);
        mDatta.setOnClickListener(this);
        mChalisa=(CardView)findViewById(R.id.t5);
        mChalisa.setOnClickListener(this);
        mArchana=(CardView)findViewById(R.id.t6);
        mArchana.setOnClickListener(this);
        mArati=(CardView)findViewById(R.id.t7);
        mArati.setOnClickListener(this);
        mNaivedya=(CardView)findViewById(R.id.t8);
        mNaivedya.setOnClickListener(this);
        mPromises=(CardView)findViewById(R.id.t9);
        mPromises.setOnClickListener(this);
        mGlossary=(CardView)findViewById(R.id.t10);
        mGlossary.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.t1:
                Intent i1 = new Intent(getBaseContext(),DisplayScreen.class);
                i1.putExtra("fileName","prereq");
                startActivity(i1);
                break;

            case R.id.t2:
                Intent i2 = new Intent(getBaseContext(),DisplayScreen.class);
                i2.putExtra("fileName","story");
                startActivity(i2);
                break;

            case R.id.t3:
                Intent i3 = new Intent(getBaseContext(),DisplayScreen.class);
                i3.putExtra("fileName","bhavani");
                startActivity(i3);
                break;

            case R.id.t4:
                Intent i4 = new Intent(getBaseContext(),DisplayScreen.class);
                i4.putExtra("fileName","datta");
                startActivity(i4);
                break;

            case R.id.t5:
                Intent i5 = new Intent(getBaseContext(),DisplayScreen.class);
                i5.putExtra("fileName","chalisa");
                startActivity(i5);
                break;

            case R.id.t6:
                Intent i6 = new Intent(getBaseContext(),DisplayScreen.class);
                i6.putExtra("fileName","archana");
                startActivity(i6);
                break;

            case R.id.t7:
                Intent i7 = new Intent(getBaseContext(),DisplayScreen.class);
                i7.putExtra("fileName","naivedya");
                startActivity(i7);
                break;

            case R.id.t8:
                // AARATI NEW SCREEN WITH AUDIO
                Toast.makeText(CardViewList.this, "Arati Screen..", Toast.LENGTH_SHORT).show();
                break;

            case R.id.t9:
                Intent i9 = new Intent(getBaseContext(),DisplayScreen.class);
                i9.putExtra("fileName","promises");
                startActivity(i9);
                break;

            case R.id.t10:
                Intent i10 = new Intent(getBaseContext(),DisplayScreen.class);
                i10.putExtra("fileName","glossary");
                startActivity(i10);
                break;
        }

    }

}

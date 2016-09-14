package com.example.user.staticappexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DisplayScreen extends AppCompatActivity {

    TextView mDisplayFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_screen);

        mDisplayFile=(TextView)findViewById(R.id.display);

        //Displaying text from a file
        InputStream is = null;
        String entireFile = "";

        try {
            is = getAssets().open("story");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;

            try {
                while((line = br.readLine()) != null) { // <--------- place readLine() inside loop
                    entireFile += (line + "\n"); // <---------- add each line to entireFile
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        mDisplayFile.setText(entireFile); // <------- assign entireFile to TextView
    }
}

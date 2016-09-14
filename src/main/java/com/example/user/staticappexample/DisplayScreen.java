package com.example.user.staticappexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

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

        String value = getIntent().getExtras().getString("fileName");

        if(value != null)
            DisplayFile(value);
        else
            Toast.makeText(DisplayScreen.this, "Error loading file...", Toast.LENGTH_SHORT).show();
    }

    //Function to Decide which file should be displayed
    //Displaying text from a file
    public void DisplayFile(String file){
        String entireFile = "";

        try {
            InputStream is = getAssets().open(file);
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

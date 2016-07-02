package com.example.aatifshah.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        //Find View for button that takes user to the Library Activity
        final Button playSongButton = (Button) findViewById(R.id.playSong);

        //Set ClickListener on that View
        playSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new Intent to open the {@link LibraryActivity}
                Intent playSongIntent = new Intent(LibraryActivity.this, PlayerActivity.class);
                //Start the new activity
                startActivity(playSongIntent);
            }
        });
    }
}

package com.example.aatifshah.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find View for button that takes user to the Library Activity
        final Button browseButton = (Button) findViewById(R.id.browseButton);
        final Button libraryButton = (Button) findViewById(R.id.libraryButton);
        final Button playerButton = (Button) findViewById(R.id.playerButton);

        //Set ClickListener for browseButton
        browseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new Intent to open the {@link BrowseActivity}
                Intent browseIntent = new Intent(MainActivity.this, BrowseActivity.class);
                //Start the new activity
                startActivity(browseIntent);
            }
        });

        //Set ClickListener for libraryButton
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new Intent to open the {@link LibraryActivity}
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                //Start the new Activity
                startActivity(libraryIntent);
            }
        });

        //Set ClickListener for playerButton
        playerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new Intent to open the {@link PlayerActivity}
                Intent playerIntent = new Intent(MainActivity.this, PlayerActivity.class);
                //Start the new Activity
                startActivity(playerIntent);
            }
        });

    }
}

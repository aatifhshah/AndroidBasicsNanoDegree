package com.example.aatifshah.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        //Find View for button that takes user to the Library Activity
        final Button previewSongButton = (Button) findViewById(R.id.previewSong);

        //Set ClickListener on that View
        previewSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new Intent to open the {@link LibraryActivity}
                Intent previewSongIntent = new Intent(BrowseActivity.this, PlayerActivity.class);
                //Start the new activity
                startActivity(previewSongIntent);
            }
        });
    }
}

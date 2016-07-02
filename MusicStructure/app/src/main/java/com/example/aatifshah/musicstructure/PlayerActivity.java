package com.example.aatifshah.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //Find View for button that takes user to the Library Activity
        final Button myLibraryButton = (Button) findViewById(R.id.myLibraryButton);

        //Set ClickListener on that View
        myLibraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new Intent to open the {@link LibraryActivity}
                Intent myLibraryIntent = new Intent(PlayerActivity.this, LibraryActivity.class);
                //Start the new activity
                startActivity(myLibraryIntent);
            }
        });
    }


}

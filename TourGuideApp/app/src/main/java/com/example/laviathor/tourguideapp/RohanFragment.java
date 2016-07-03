package com.example.laviathor.tourguideapp;


import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class RohanFragment extends Fragment {

    /** Handles playback of all the sound files */


    public RohanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.region_list, container, false);


        // Create a list of words
        final ArrayList<Region> regions = new ArrayList<Region>();

        regions.add(new Region(R.string.rohan_one,R.string.rohan_rating_one,R.drawable.fangorn));
        regions.add(new Region(R.string.rohan_two,R.string.rohan_rating_two,R.drawable.entwash));
        regions.add(new Region(R.string.rohan_three,R.string.rohan_rating_three,R.drawable.white_mountains));




        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        RegionArrayAdapter adapter = new RegionArrayAdapter(getActivity(), regions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on


        return rootView;
    }


}


package com.example.laviathor.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.laviathor.tourguideapp.R;

import java.util.ArrayList;


public class RegionArrayAdapter extends ArrayAdapter<Region> {

    private static final String LOG_TAG = RegionArrayAdapter.class.getSimpleName();


    public RegionArrayAdapter(Context context, ArrayList<Region> regions) {
        super(context, 0, regions);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Region currentRegion = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.region_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentRegion.getRegionName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.region_rating);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView

        numberTextView.setText(currentRegion.getRegionRating());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentRegion.getRegionImage());
        // Make sure the view is visible
        imageView.setVisibility(View.VISIBLE);



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
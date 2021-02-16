package com.example.android.tabsample;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tabsample.model.LocationInfo;

import java.util.ArrayList;


/**
 * {@link customAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link LocationInfo} objects.
 */
public class customAdapter extends ArrayAdapter<LocationInfo> {

    /**
     * Create a new {@link customAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param data    is the list of {@link LocationInfo}s to be displayed.
     */
    public customAdapter(@NonNull Context context, ArrayList<LocationInfo> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link LocationInfo} object located at this position in the list
        LocationInfo currentItem = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID location_ImageView.
        ImageView locationIamge = convertView.findViewById(R.id.location_ImageView);
        // Display the provided image based on the resource ID
        locationIamge.setImageResource(currentItem.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID locationName_TextView.
        TextView locationName = convertView.findViewById(R.id.locationName_TextView);
        // Get the location name from the currentItem object and set this text on
        // that TextView.
        locationName.setText(currentItem.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID caption_TextView.
        TextView locationCaption = convertView.findViewById(R.id.caption_TextView);
        // Get the location caption from the currentItem object and set this text on
        // that TextView.
        locationCaption.setText(currentItem.getLocationCaption());

        // Return the whole list item layout (containing 2 TextViews and ImageView) so that it can be shown in
        // the ListView.
        return convertView;
    }
}
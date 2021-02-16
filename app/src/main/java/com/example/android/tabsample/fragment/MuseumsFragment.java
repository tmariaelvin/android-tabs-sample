package com.example.android.tabsample.fragment;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tabsample.model.LocationInfo;
import com.example.android.tabsample.R;
import com.example.android.tabsample.customAdapter;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays the locations related of museums places.
 */
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create a list of museums sites.
        ArrayList<LocationInfo> data = new ArrayList<LocationInfo>();
        data.add(new LocationInfo(R.drawable.aswan_museum, R.string.aswanMuseum, R.string.captionAswanMuseum));
        data.add(new LocationInfo(R.drawable.egyptian_museum, R.string.egyptianMuseum, R.string.captionEgyptianMuseum));
        data.add(new LocationInfo(R.drawable.luxor_museum, R.string.luxorMuseum, R.string.captionLuxorMuseum));
        data.add(new LocationInfo(R.drawable.st_catherines_monastery, R.string.stCatherinesMonastery, R.string.captionStCatherinesMonastery));

        // Create an {@link customAdapter}, whose data source is a list of {@link LocationInfo}s. The
        // adapter knows how to create list items for each item in the list.
        customAdapter adapter = new customAdapter(getActivity(), data);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link customAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link LocationInfo} in the list.
        listView.setAdapter(adapter);

        // Return that View in the end.
        return rootView;
    }
}
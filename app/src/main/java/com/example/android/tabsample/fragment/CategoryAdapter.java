package com.example.android.tabsample.fragment;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.android.tabsample.model.LocationInfo;
import com.example.android.tabsample.R;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link LocationInfo} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the com.example.android.egypttravelguide.fragment manager that will keep each com.example.android.egypttravelguide.fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ReligiousFragment();
        } else if (position == 1) {
            return new AncientFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new EventsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    //Rename each page in app.
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.religious);
        } else if (position == 1) {
            return mContext.getString(R.string.ancient);
        } else if (position == 2) {
            return mContext.getString(R.string.museums);
        } else {
            return mContext.getString(R.string.events);
        }
    }
}
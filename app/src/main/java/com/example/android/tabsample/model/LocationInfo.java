package com.example.android.tabsample.model;


/**
 * {@link LocationInfo} represents information's about each location the user want to visit it.
 * It contains resource IDs for the location image, location name and brief on that location.
 */
public class LocationInfo {

    /**
     * Image resource ID of the location
     */
    private int mImageResourceId;

    /**
     * String resource ID for the name of location
     */
    private int mLocationName;

    /**
     * String resource ID for the caption of that location
     */
    private int mLocationCaption;

    /**
     * Create a new LocationInfo object.
     *
     * @param imageResourceId is int resource ID for image of the location
     * @param locationName    is int resource ID for the name of the location
     * @param locationCaption is int resource ID for caption of each location
     */
    public LocationInfo(int imageResourceId, int locationName, int locationCaption) {
        mImageResourceId = imageResourceId;
        mLocationName = locationName;
        mLocationCaption = locationCaption;
    }

    /**
     * Get int resource ID for image of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get int resource ID for the name of that location.
     */
    public int getLocationName() {
        return mLocationName;
    }

    /**
     * Get int resource ID for brief of that location.
     */
    public int getLocationCaption() {
        return mLocationCaption;
    }
}
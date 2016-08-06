package com.example.android.quakereport;

/**
 * Created by nsethi on 05-Aug-16.
 */
public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake(String magnitude,String location, String date)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitude()
    {
        return mMagnitude;
    }

    public String getLocation()
    {
        return mLocation;
    }

    public String getDate()
    {
        return mDate;
    }
}

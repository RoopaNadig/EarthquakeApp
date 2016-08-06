package com.example.android.quakereport;

/**
 * Created by nsethi on 05-Aug-16.
 */
public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mDate;
    private String mUrl;

    public Earthquake(String magnitude,String location, long date,String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }

    public String getMagnitude()
    {
        return mMagnitude;
    }

    public String getLocation()
    {
        return mLocation;
    }

    public long getDate()
    {
        return mDate;
    }

    public String getUrl(){ return mUrl;}
}

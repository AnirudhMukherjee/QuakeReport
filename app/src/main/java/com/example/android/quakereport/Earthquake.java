package com.example.android.quakereport;

/**
 * Created by Anirudh on 20-10-2017.
 */
public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    public Earthquake(double Magnitude, String Location, long TimeInMilliseconds) {
        this.mTimeInMilliseconds = TimeInMilliseconds;
        this.mLocation = Location;
        this.mMagnitude = Magnitude;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmLocation() {
        return mLocation;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }
}

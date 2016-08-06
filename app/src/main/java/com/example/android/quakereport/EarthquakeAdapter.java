package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nsethi on 05-Aug-16.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currEarthquake = getItem(position);

        TextView magnitudeView = (TextView)listView.findViewById(R.id.magnitude);
        magnitudeView.setText(currEarthquake.getMagnitude());

        TextView locationView = (TextView)listView.findViewById(R.id.location);
        locationView.setText(currEarthquake.getLocation());

        TextView dateView = (TextView)listView.findViewById(R.id.date);
        dateView.setText(currEarthquake.getDate());
        return listView;

    }
}
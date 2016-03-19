package com.example.android.sunshine.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.sunshine.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view for the MainActivity.
 */
public class MainFragment extends Fragment {

    public MainFragment() {
    }

    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forecastArray = {"Today-Sunny-88/63","Tomorrow-Foggy-70/40",
                                    "Weds-Cloudy-72/63","Thurs-Asteroids-75/65",
                                    "Fri-Heavy Rain-65/56","Sat-Help trapped in weather station-60/51",
                                    "Sun-Sunny-80/68"};

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        mForecastAdapter = new ArrayAdapter<>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);
        ListView listView = (ListView)findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);


        return inflater.inflate(R.layout.fragment_main, container, false);
    }*/
}

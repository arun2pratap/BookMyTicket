package com.book.train.services;

import com.book.train.Station;
import com.book.train.Train;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by idnasi on 3/29/2016.
 */
public class StationsService {

    public static Map<String, Station> allStations() {
        Map<String,Station> stations= new HashMap<String, Station>();

        Station pune = new Station("Pune", getWeekelyTrains());
        Station mumbai = new Station("Mumbai",getWeekelyTrains());
        stations.put("Pune", pune);
        stations.put("Mumbai", mumbai);
        return stations;
    }

    private static HashMap<Integer, Map<Train, String>> getWeekelyTrains() {
        HashMap<Integer, Map<Train, String>> trainsWeekly = new HashMap<Integer, Map<Train, String>>();
        HashMap<Train, String> trains = new HashMap<Train, String>();
        trains.put(new Train("Chennai Exp"), "12:00");
        trainsWeekly.put(1, trains);
        return trainsWeekly;
    }
}

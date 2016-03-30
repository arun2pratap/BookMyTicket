package com.book.train;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by idnasi on 3/29/2016.
 */
public class Station {
     final String stationName;
    final HashMap<Integer, Map<Train, String>> weekelyTrains;
    public Station(String stationName, HashMap<Integer, Map<Train, String>> weekelyTrains) {
        this.stationName = stationName;
        this.weekelyTrains = weekelyTrains;

    }

    public String getStationName() {
        return stationName;
    }

    public HashMap<Integer, Map<Train, String>> getWeekelyTrains() {
        return weekelyTrains;
    }
}

package com.book.train.services;

import com.book.train.Seat;
import com.book.train.Train;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by idnasi on 3/29/2016.
 */
public class SeatAvailabilityService {
    private static List<Seat> seats = new ArrayList<>(Arrays.asList(new Seat("CC"), new Seat("CC"), new Seat("CC")));
    public static final Map<String, List<Seat>> available = new HashMap() {{
        put("Chennai Exp", seats);
    }};

    public static final List<Seat> availableSeats(LocalDate date, Train train) {
        return available.get(train.getName());
    }

    public static void removeSeats(List<Seat> seatsToBeRemoved) {
        seats.removeAll(seatsToBeRemoved);
    }
}

package com.book.train;

import com.book.train.services.SeatAvailabilityService;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by idnasi on 3/29/2016.
 */
public class BookTicket {
    public TrainTicket book(Train train, Station fromStation, Station toStation, LocalDate date, int seatCount) {
        List<Seat> seats = SeatAvailabilityService.availableSeats(date, train);
        if (seats.size() >= seatCount) {
            SeatAvailabilityService.removeSeats(seats);
            TrainTicket trainTicket = new TrainTicket(seats, fromStation, toStation, train, date);
            System.out.println(trainTicket);
            return trainTicket;
        }
        return null;
    }

    public Map<String, Train> availableTrains(Station fromStation, final Station toStation, LocalDate date) {
        final int dayOfWeek = date.getDayOfWeek().getValue();
        Map<Train, String> trainsFromStation = fromStation.getWeekelyTrains().get(dayOfWeek);
        final Map<Train, String> trainsToStation = toStation.getWeekelyTrains().get(dayOfWeek);

        final Map<String,Train> trains = new HashMap<String,Train>();
        trainsFromStation.forEach((k, v) -> {
            trainsToStation.forEach((l,m) -> {
                if(l.getName().equals(k.getName()))
                {
                    trains.put(k.getName(),k);
                }
            });
        });


        return trains;
    }
}

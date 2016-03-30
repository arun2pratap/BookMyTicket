package com.book.train;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by idnasi on 3/29/2016.
 */
public class TrainTicket {
    final List<Seat> seats ;
    final Station fromStation;
    final Station toStation;
    final Train train;
    final LocalDate date;

    public TrainTicket(List<Seat> seats, Station fromStation, Station toStation, Train train, LocalDate date) {
       this.seats = seats;
        this.toStation = toStation;
        this.fromStation = fromStation;
        this.train = train;
        this.date = date;
    }

    @Override
    public String toString() {
        return "TrainTicket{" +
                "seats=" + seats +
                ", fromStation=" + fromStation +
                ", toStation=" + toStation +
                ", train=" + train +
                ", date=" + date +
                '}';
    }
}

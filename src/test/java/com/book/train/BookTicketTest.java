package com.book.train;


import com.book.train.services.StationsService;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Map;

/**
 * Created by idnasi on 3/29/2016.
 */
public class BookTicketTest {

    @Test
    public void shouldBookTicket(){
        BookTicket bookticket= new BookTicket();
        Map<String, Station> stations = StationsService.allStations();
        Map<String,Train> availableTrains= bookticket.availableTrains(stations.get("Pune"), stations.get("Mumbai"), LocalDate.parse("2016-04-04"));

        TrainTicket trainticket = bookticket.book(availableTrains.get("Chennai Exp"),stations.get("Pune"),stations.get("Mumbai"), LocalDate.parse("2016-04-04"),3);
        Assert.assertNotNull(trainticket);
    }

    @Test
    public void shouldNotBookTicketIfSeatNotAvailable(){
        BookTicket bookticket= new BookTicket();
        Map<String, Station> stations = StationsService.allStations();
        Map<String,Train> availableTrains= bookticket.availableTrains(stations.get("Pune"), stations.get("Mumbai"), LocalDate.parse("2016-04-04"));
        TrainTicket trainticket = bookticket.book(availableTrains.get("Chennai Exp"),stations.get("Pune"),stations.get("Mumbai"), LocalDate.parse("2016-04-04"),15);
        Assert.assertNull(trainticket);
    }


}

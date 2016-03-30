package com.book.train;

import com.book.train.services.StationsService;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Created by idnasi on 3/29/2016.
 */
public class TrainTest {

    @Test
    public void checkAvailablityForAPerticularDate(){
        Train train = new Train("Chennai Exp");
//        Integer noOfSeats = Trai.availableSeats(LocalDate.parse("2016-05-11"));
//        Assert.assertEquals(Integer.valueOf(5), noOfSeats);
    }
}

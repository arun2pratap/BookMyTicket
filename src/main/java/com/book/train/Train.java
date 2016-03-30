package com.book.train;

import com.book.train.services.SeatAvailabilityService;

import java.time.LocalDate;
import java.util.Map;

/**
 * Created by idnasi on 3/29/2016.
 */
public class Train {
    public final String name;
;
    public Train(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

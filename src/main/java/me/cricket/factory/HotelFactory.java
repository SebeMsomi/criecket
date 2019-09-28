package me.cricket.factory;

import me.cricket.domain.facility.Hotel;
import me.cricket.misc.Misc;

public class HotelFactory {

    public static Hotel getHospital (String hotelName) {

        return new Hotel.Builder()
                .hotelId(Misc.generateId())
                .hotelName(hotelName)
                .build();
    }

}

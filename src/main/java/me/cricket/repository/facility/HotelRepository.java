package me.cricket.repository.facility;

import me.cricket.domain.facility.Hotel;
import me.cricket.repository.Irepository;

import java.util.Set;

public interface HotelRepository extends Irepository<Hotel, String> {


    Set<Hotel> getAll();
}

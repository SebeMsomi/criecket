package me.cricket.service.impl;

import me.cricket.domain.facility.Hotel;
import me.cricket.service.Service;

import java.util.Set;

public interface HotelService extends Service<Hotel, String> {
    Set<Hotel> getAll();
}

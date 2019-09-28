package me.cricket.repository.facility.impl;

import me.cricket.domain.facility.Hotel;
import me.cricket.repository.facility.HotelRepository;

import java.util.HashSet;
import java.util.Set;

public class HotelRepositoryImpl implements HotelRepository {
    private static HotelRepositoryImpl repository = null;
    private Set<Hotel> hotels;

    public HotelRepositoryImpl(){
        hotels = new HashSet<>();
    }

    public static HotelRepositoryImpl getRepository() {

        if(repository == null){
            return new HotelRepositoryImpl();
        }
        return repository;

    }

    @Override
    public Hotel create(Hotel hotel)
    {
        hotels.add(hotel);
        return hotel;
    }

    @Override
    public Hotel read(String id) {
        return hotels.stream().filter(hotel -> hotel.getHotelId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Hotel update(Hotel hotel) {

        Hotel hotel1 = read(hotel.getHotelId());
        if(hotel1 != null){
            hotels.remove(hotel);
            hotels.add(hotel);
            return hotel;

        }

        return null;
    }

    @Override
    public void delete(String id) {

        Hotel hotel1 = read(id);
        hotels.remove(hotel1);

    }

    @Override
    public Set<Hotel> getAll() {
        return hotels;
    }

}

package me.cricket.service.impl;

import me.cricket.domain.facility.Hotel;
import me.cricket.repository.facility.HotelRepository;
import me.cricket.repository.facility.impl.HotelRepositoryImpl;

import java.util.Set;

public class HotelServiceImpl implements HotelService {

    private HotelServiceImpl service = null;
    private HotelRepository repository;

    public HotelServiceImpl() {
        repository = HotelRepositoryImpl.getRepository();
    }

    public HotelServiceImpl getService(){

        if(service == null){
            return new HotelServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Hotel> getAll() {
        return repository.getAll();
    }

    @Override
    public Hotel create(Hotel hotel) {
        return repository.create(hotel);
    }

    @Override
    public Hotel read(String s) {
        return repository.read(s);
    }

    @Override
    public Hotel update(Hotel hotel) {
        return repository.update(hotel);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }
}

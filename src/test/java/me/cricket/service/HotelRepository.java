package me.cricket.service;

import me.cricket.domain.facility.Hotel;
import me.cricket.repository.facility.impl.HotelRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelRepository {

    @Autowired
    private HotelRepositoryImpl hotelRepository;

    @Test
    public void create() {




    }

}

package me.cricket.repository.facility.impl;

import me.cricket.domain.facility.Hotel;
import me.cricket.factory.HotelFactory;
import me.cricket.service.HotelRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;

/*@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*/

public class HotelRepositoryImplTest {
   // @Autowired
    private HotelRepositoryImpl repository;
    private HotelRepository hotelRepository;
    private Hotel hotel;

    @Before
    public void setUp() throws Exception {
        repository = HotelRepositoryImpl.getRepository();
       hotel = HotelFactory.getHospital("Strolla");
    }


    @Test
    public void getRepository() {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void create() {
        repository.create(hotel);
        assertNotNull(repository.read(hotel.getHotelId()));
        System.out.println("Created\n" + repository.read("1"));
    }

    @Test
    public void read() {
        Hotel hotel = HotelFactory.getHospital("Strolla");

        repository.create(hotel);

        assertNotNull(repository.getAll());

        Hotel hotel1 = repository.read(hotel.getHotelId());

        assertEquals(hotel.getHotelId(), hotel1.getHotelId());
    }

    @Test
    public void update() {
        Hotel hotel =HotelFactory.getHospital("Strolla");
        repository.update(hotel);
        System.out.println(repository.read("1"));
    }

    @Test
    public void delete() {
        repository.delete(hotel.getHotelId());
        assertNull(repository.read("1"));
        System.out.println("Deleted\n" + repository.read("1"));
    }

    @Test
    public void getAll() {
        repository.create(hotel); //created again because it get Deleted
        assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }
}
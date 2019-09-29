package me.cricket.factory;

import me.cricket.domain.facility.Hotel;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelFactoryTest {

    @Test
    public void getHospital() {
        Hotel f = HotelFactory.getHospital("Strolla");
        System.out.println(f);
        Assert.assertNotNull(f);

    }
}
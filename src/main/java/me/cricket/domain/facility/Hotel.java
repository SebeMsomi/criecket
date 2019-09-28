package me.cricket.domain.facility;


import javafx.util.Builder;

import java.util.Objects;

public class Hotel {

    private String hotelId;
    private String hotelName;


    public Hotel(){}

    private Hotel(Builder builder){

        this.hotelId = builder.hotelId;
        this.hotelName = builder.hotelName;

    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public static class Builder{


        private String hotelId;
        private String hotelName;

        public Builder(){}

        public Builder hotelId(String hotelId){
            this.hotelId = hotelId;
            return this;
        }



        public Builder hotelName(String hotelName){
            this.hotelName = hotelName;
            return this;
        }

        public Hotel build(){

            return new Hotel(this);

        }

        public Builder copy(Hotel hotel){

            this.hotelId(hotel.getHotelId());
            this.hotelName(hotel.getHotelName());
            return this;

        }

        @Override
        public String toString() {
            return "Builder{" +
                    "hotelId='" + hotelId + '\'' +
                    ", hotelName='" + hotelName + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(hotelId, builder.hotelId) &&
                    Objects.equals(hotelName, builder.hotelName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(hotelId, hotelName);
        }
    }


}

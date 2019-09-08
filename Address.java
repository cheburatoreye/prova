package com.company;

public class Address {
    private  String country;
    private String city;
    private String street;
    private String number;

    public Address(String country, String city, String street, String number) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

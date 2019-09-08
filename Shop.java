package com.company;

public class Shop extends Building {
    public Shop(Address address) {
        super(address);
    }

    @Override
    void I_am() {
        System.out.println("it is shop");
    }

    @Override
    public String toString() {
        return "Shop{" +
                "address=" + address +
                '}';
    }
}

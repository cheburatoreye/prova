package com.company;

public class Cinema extends Building {
    public Cinema(Address address) {
        super(address);
    }



    @Override
    void I_am() {
        System.out.println("it is cinema");
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "address=" + address +
                '}';
    }
}

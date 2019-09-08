package com.company;

public class School extends  Building {
    public School(Address address) {
        super(address);
    }

    @Override
    void I_am() {
        System.out.println("it is school");
    }

    @Override
    public String toString() {
        return "School{" +
                "address=" + address +
                '}';
    }
}

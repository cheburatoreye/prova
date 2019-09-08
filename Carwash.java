package com.company;

public class Carwash extends  Building {
    public Carwash(Address address) {
        super(address);
    }

    @Override
    void I_am() {
        super.I_am();
    }

    @Override
    public String toString() {
        return "Carwash{" +
                "address=" + address +
                '}';
    }
}

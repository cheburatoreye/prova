package com.company;

public class Home extends  Building {
    public Home(Address address) {
        super(address);
    }

    @Override
    void I_am() {
        System.out.println("it is home");
    }

    @Override
    public String toString() {
        return "Home{" +
                "address=" + address +
                '}';
    }


}

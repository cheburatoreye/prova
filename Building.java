package com.company;

public  class Building  {
        Address address;

    public Building(Address address) {
        this.address = address;
    }

    void I_am(){
            System.out.println("it is building");
        }

    @Override
    public String toString() {
        return "Building{" +
                "address=" + address +
                '}';
    }
}

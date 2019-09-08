package com.company;

import java.util.*;

public class Street implements BuildersAssistent{
    String streetname;
    Collection<Building> builds = new ArrayList<Building>();
  // ArrayList<School> builds = new ArrayList<>();

    public Street(String streetname) {
        this.streetname = streetname;
    }

    public void listofB() {
        Iterator<Building> listIterator = builds.iterator();

        while (listIterator.hasNext()) {

            System.out.println(listIterator.next());
        }
    }

    @Override
    public Cinema makeCinema(Cinema cinema) {
        return null;
    }

    Building getBuilding(int index){
        return ((List<Building>)builds).get(index);
    }

    public String getStreetname() {
        return streetname;
    }

    @Override
    public String toString() {
        return "Street{" +
                "streetname='" + streetname + '\'' +
                ", builds=" + builds +
                '}';
    }

}

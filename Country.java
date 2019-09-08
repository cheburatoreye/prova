package com.company;

import java.util.*;

public class Country {
    String countryname;

    City würtingen;
    City ruggell;
     City vaduz;
     City malbun;
     City balzers;


     Builders builders;

    public Country(String countryname) {
        //КОМПОЗИЦИЯ
        ruggell= new City("Ruggell",new Street("derf"),new Street("edfr"),new Street("de34"));
        würtingen= new City("Würtingen",new Street("derf"),new Street("edfr"),new Street("de34"));
        malbun= new City("Malbun",new Street("derf"),new Street("edfr"),new Street("de34"));
        balzers= new City("Balzers",new Street("derf"),new Street("edfr"),new Street("de34"));
        vaduz= new City("Vaduz",new Street("derf"),new Street("edfr"),new Street("de34"));
        this.countryname = countryname;

    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }



    public City getWürtingen() {
        return würtingen;
    }

    public void setWürtingen(City würtingen) {
        this.würtingen = würtingen;
    }

    public City getRuggell() {
        return ruggell;
    }

    public void setRuggell(City ruggell) {
        this.ruggell = ruggell;
    }

    public City getVaduz() {
        return vaduz;
    }

    public void setVaduz(City vaduz) {
        this.vaduz = vaduz;
    }

    public City getMalbun() {
        return malbun;
    }

    public void setMalbun(City malbun) {
        this.malbun = malbun;
    }

    public City getBalzers() {
        return balzers;
    }

    public void setBalzers(City balzers) {
        this.balzers = balzers;
    }

    public Builders getBuilders() {
        return builders;
    }

    public void setBuilders(Builders builders) {
        this.builders = builders;
    }
}

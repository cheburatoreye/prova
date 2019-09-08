package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {



        Builders builders =new Builders();

        Street lammstraße =new Street("Lammstraße"); //
        Street hirschstraße =new Street("Hirschstraße");
        Street goethestraße=new Street("Goethestraße");
        City würtingen =new City("Würtingen",lammstraße,hirschstraße,goethestraße);//КОМПОЗИЦИЯ город не может существовать без у лиц

        Street noflerstrasse =new Street("Noflerstrasse");
        Street lettenbünt =new Street("Lettenbünt");
        Street habrüti =new Street("Habrüti ");
        City ruggell =new City("Ruggell",lettenbünt,habrüti,noflerstrasse);//КОМПОЗИЦИЯ город не может существовать без у лиц

        Street marktgass =new Street("MarktgassAltenbach");
        Street altenbach =new Street("AltenbachEgertastrasse");
        Street egertastrasse =new Street("Egertastrasse");
        City vaduz =new City("Vaduz",marktgass,altenbach,egertastrasse);

        Street tubistrasse =new Street("Tubistrasse");
        Street turnastrasse =new Street("Turnastrasse");
        Street stubistrasse =new Street("Stubistrasse");
        City malbun =new City("Malbun",tubistrasse,turnastrasse,stubistrasse);

        Street streue =new Street("Streue");
        Street grashalda=new Street("Grashalda");
        Street obergass =new Street("Obergass");
        City balzers =new City("Balzers",streue,grashalda,obergass);





        Country liechtenstein =new Country("liechtenstein");

	    liechtenstein.setCountryname("liechtenstein");
	    liechtenstein.setBuilders(builders);//АГРЕГАЦИЯ строители стали частью страны Лихтенштейн.
        liechtenstein.vaduz=vaduz;
        liechtenstein.ruggell=ruggell;
        liechtenstein.balzers=balzers;
        liechtenstein.malbun=malbun;
        liechtenstein.würtingen=würtingen;


//Строим здания на улицах городов:Делегирование, строители возвращают здание.ПОЛИМОРФИЗМ создаются разные объекты через наследование
// город Malbun строим дома  на улицах
	    liechtenstein.malbun.street1.builds.
                add(liechtenstein.builders.makeShop(new Shop(new Address//ПОЛИМОРФИЗМ
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street1.getStreetname(),"1"))));
        liechtenstein.malbun.street1.builds.
                add(liechtenstein.builders.makeSchool(new School(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street1.getStreetname(),"2"))));
        liechtenstein.malbun.street1.builds.
                add(liechtenstein.builders.makeCinema(new Cinema(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street1.getStreetname(),"3"))));
        liechtenstein.malbun.street1.builds.
                add(liechtenstein.builders.makeHome(new Home(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street1.getStreetname(),"4"))));
        liechtenstein.malbun.street1.builds.
                add(liechtenstein.builders.makeCarwash(new Carwash(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street1.getStreetname(),"5"))));

        liechtenstein.malbun.street2.builds.
                add(liechtenstein.builders.makeShop(new Shop(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street2.getStreetname(),"1"))));
        liechtenstein.malbun.street2.builds.
                add(liechtenstein.builders.makeSchool(new School(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street2.getStreetname(),"2"))));
        liechtenstein.malbun.street2.builds.
                add(liechtenstein.builders.makeCinema(new Cinema(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street2.getStreetname(),"3"))));
        liechtenstein.malbun.street2.builds.
                add(liechtenstein.builders.makeHome(new Home(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street2.getStreetname(),"4"))));
        liechtenstein.malbun.street2.builds.
                add(liechtenstein.builders.makeCarwash(new Carwash(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street2.getStreetname(),"5"))));

        liechtenstein.malbun.street3.builds.
                add(liechtenstein.builders.makeShop(new Shop(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street3.getStreetname(),"1"))));
        liechtenstein.malbun.street3.builds.
                add(liechtenstein.builders.makeSchool(new School(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street3.getStreetname(),"2"))));
        liechtenstein.malbun.street3.builds.
                add(liechtenstein.builders.makeCinema(new Cinema(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street3.getStreetname(),"3"))));
        liechtenstein.malbun.street3.builds.
                add(liechtenstein.builders.makeHome(new Home(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street3.getStreetname(),"4"))));
        liechtenstein.malbun.street3.builds.
                add(liechtenstein.builders.makeCarwash(new Carwash(new Address
                        (liechtenstein.getCountryname(),liechtenstein.malbun.getCityname(),liechtenstein.malbun.street3.getStreetname(),"5"))));





        System.out.println("malbun buildings, street: " +liechtenstein.malbun.street1.getStreetname());
        liechtenstein.malbun.street1.listofB();










    }
}

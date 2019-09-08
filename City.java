package com.company;

 class City {
    String cityname;//ИНКАПСУЛЯЦИЯ
    Street street1;
    Street street2;
    Street street3;


    public City(String cityname, Street street1, Street street2, Street street3) {
        this.cityname = cityname;
        this.street1 = street1;
        this.street2 = street2;
        this.street3 = street3;
    }

    public String getCityname() {
        return cityname;
    }
}

package com.company;
import com.company.CityNode;

public class CityLink {
    public CityNode citynext;
    public int distance;


    public CityLink(CityNode city, int dis) {
        this.citynext = city;
        this.distance = dis;

    }
    public CityLink(String cityname, int dis) {
        this.citynext = new CityNode(cityname);
        this.distance = dis;
    }
}

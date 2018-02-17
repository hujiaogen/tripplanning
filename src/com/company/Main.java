package com.company;
import com.company.trip;
import com.company.CityNode;
import com.company.CityLink;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CityNode [] cities = new CityNode[6];
        cities[0] = new CityNode("BJ");
        cities[1] = new CityNode("SH");
        cities[2] = new CityNode("XA");
        cities[3] = new CityNode("GZ");
        cities[4] = new CityNode("WH");
        cities[5] = new CityNode("XZ");

        cities[0].neis.add(new CityLink("SH", 2000));
        cities[0].neis.add(new CityLink("XA",3000));

        cities[1].neis.add(new CityLink("GZ", 2000));
        cities[2].neis.add(new CityLink("GZ",1000));
        cities[3].neis.add(new CityLink("WH", 1000));
        cities[3].neis.add(new CityLink("XZ",2000));

        int startCity = 0;
        int maxDis = 5000;

        String[] res = trip.allCityCanReach(cities,  startCity,  maxDis);
        for (int i =0 ; i < res.length; i++) {
                 System.out.println(res[i]);
             }

    }


}



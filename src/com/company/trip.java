package com.company;

import java.util.HashMap;
import java.util.HashSet;


// Use DFS to find all cities
public class trip {
    private static int start;

    public static String[]  allCityCanReach(CityNode[] cities,  int startCity, int maxDis) {
        start = startCity;
        if (startCity<0 || startCity>= cities.length || cities == null || cities.length==0 ||maxDis <0 ) {
                return new String[]{""};
        }
        HashSet<Integer> res = new HashSet<Integer>();
        HashMap<String, Integer> cityname = new HashMap<>();
        for (int i =0; i < cities.length; i++) {
            cityname.put(cities[i].cityname, i);
        }
        helper(cities,  startCity, maxDis, res, cityname);
        String[] result = new String[res.size()];
        int count = 0;
        for (int i =0; i < cities.length; i++) {
            if (res.contains(i)) {
                result[count++]= cities[i].cityname;
            }
        }
        return result;
    }


// use DFS to solve the problem with helper function.

    private static void helper(CityNode[] cities,  int startCity, int distance, HashSet<Integer> res,
                               HashMap<String, Integer> cityname){
        if (distance<0) return;
        if (startCity != start) {
            if (!res.contains(startCity)) res.add(startCity);
        }

        for (int j=0; j < cities[startCity].neis.size(); j++) {
            CityLink next = cities[startCity].neis.get(j);

            if (next.distance>0) {
                helper(cities, cityname.get(next.citynext.cityname), distance-next.distance, res, cityname);
            }
        }
    }
}
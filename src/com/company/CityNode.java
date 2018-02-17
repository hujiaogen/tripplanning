package com.company;
import java.util.ArrayList;
import java.util.List;

public class CityNode {
    public String cityname;
    public List<CityLink> neis;

    public  CityNode(String name) {
        cityname = name;
        neis = new ArrayList<>();
    }

}

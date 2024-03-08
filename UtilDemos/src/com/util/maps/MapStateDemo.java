package com.util.maps;

import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap=new HashMap<>();
        stateMap.put("karnataka", Arrays.asList("Dharwad","Hubli","Gadag","Nippani"));
        stateMap.put("Goa", Arrays.asList("ponda","panaji","madagav"));
        stateMap.put("Tamilnadu", Arrays.asList("chennai","coimbottur","vellooru"));
        stateMap.put("Kerala", Arrays.asList("munnar","kochhi"));

        Set<Map.Entry<String,List<String>>> Stateentries=stateMap.entrySet();
        for(Map.Entry<String,List<String>> stateentriess:Stateentries){
            System.out.println(stateentriess.getKey());
            List<String> cities=stateentriess.getValue();
            for(String city:cities){
                System.out.println(city);
            }
        }


    }
}

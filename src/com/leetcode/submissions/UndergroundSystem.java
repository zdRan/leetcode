package com.leetcode.submissions;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by Ranzd on 2020-03-29 11:07
 *
 * @author cm.zdran@foxmail.com
 */
public class UndergroundSystem {
    Map<String, Map<Integer, Integer>> checkIn = new HashMap<>();
    Map<String, Map<Integer, Integer>> checkOut = new HashMap<>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        if (checkIn.containsKey(stationName)) {
            checkIn.get(stationName).put(id, t);
        } else {
            Map<Integer, Integer> idMap = new HashMap<>();
            idMap.put(id, t);
            checkIn.put(stationName, idMap);
        }
    }

    public void checkOut(int id, String stationName, int t) {
        if (checkOut.containsKey(stationName)) {
            checkOut.get(stationName).put(id, t);
        } else {
            Map<Integer, Integer> idMap = new HashMap<>();
            idMap.put(id, t);
            checkOut.put(stationName, idMap);
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        Map<Integer, Integer> startMap = checkIn.get(startStation);
        Map<Integer, Integer> endMap = checkOut.get(endStation);
        double number = 0.0;
        double time = 0.0;
        for (Integer id : startMap.keySet()) {
            if (endMap.containsKey(id)) {
                number = number + 1;
                time = time + (endMap.get(id) - startMap.get(id));
            }
        }
        return time / number;
    }
}

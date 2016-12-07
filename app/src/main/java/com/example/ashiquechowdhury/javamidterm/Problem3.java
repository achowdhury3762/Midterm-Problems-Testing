package com.example.ashiquechowdhury.javamidterm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashiquechowdhury on 12/6/16.
 */

public class Problem3 {
    public ArrayList<String> synonymOf(HashMap<String, String> dictionary, String definition) {
        //fill out code here
        ArrayList<String> myKeyList = new ArrayList<>();
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(definition)) {
                myKeyList.add(entry.getKey());
            }
        }
        if (myKeyList.size() == 0) {
            return null;
        }
        return myKeyList;
    }
}
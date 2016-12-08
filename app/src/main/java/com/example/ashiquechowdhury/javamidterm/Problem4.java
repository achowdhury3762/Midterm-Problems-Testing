package com.example.ashiquechowdhury.javamidterm;

/**
 * Created by ashiquechowdhury on 12/7/16.
 */

public class Problem4 {
    public int countTriple(String input){
        int count = 0;
        for (int i = 0; i < input.length()-2; i++) {
            if(input.charAt(i) == input.charAt(i+1) && input.charAt(i+1) == input.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
}

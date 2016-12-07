package com.example.ashiquechowdhury.javamidterm;

/**
 * Created by ashiquechowdhury on 12/6/16.
 */

public class Problem2 {
    public String repeatEnd(String input, int n){
        //fill out code here
        String answer = "";
        String endChar = input.substring(input.length() - n);
        for (int i = 0; i < n; i++) {
            answer += endChar;
        }
        return answer;
    }
}

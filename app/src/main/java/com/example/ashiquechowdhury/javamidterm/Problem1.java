package com.example.ashiquechowdhury.javamidterm;

/**
 * Created by ashiquechowdhury on 12/6/16.
 */

public class Problem1 {
    public int factorial(int n) {
        //fill out code here
        if (n == 1) {
            return 1;
        } else return n * factorial(n - 1);
    
    }
}

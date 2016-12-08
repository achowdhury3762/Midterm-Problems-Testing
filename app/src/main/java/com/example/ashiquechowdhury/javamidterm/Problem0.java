package com.example.ashiquechowdhury.javamidterm;

/**
 * Created by ashiquechowdhury on 12/7/16.
 */

public class Problem0 {
    public int fibbonaci(int n){
        //write method here
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibbonaci(n-2) + fibbonaci(n-1);
    }
}

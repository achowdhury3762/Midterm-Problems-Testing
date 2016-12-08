package com.example.ashiquechowdhury.javamidterm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashiquechowdhury on 12/7/16.
 */

public class Problem0Test {
    Problem0 fibonacci;

    @Before
    public void setUp(){
        fibonacci = new Problem0();
    }

    @Test
    public void isZeroOne(){
        int methodAnswer = fibonacci.fibbonaci(0);
        assertEquals(0, methodAnswer);
    }

    @Test
    public void isOneOne(){
        int methodAnswer = fibonacci.fibbonaci(1);
        assertEquals(1, methodAnswer);
    }

    @Test
    public void isSixEight(){
        int methodAnswer = fibonacci.fibbonaci(6);
        assertEquals(8, methodAnswer);
    }

    public int fibbonaci(int input){
        if(input == 0)
            return 0;
        if(input == 1){
            return 1;
        }
        else
            return fibbonaci(input-1) + fibbonaci(input-2);
    }
}

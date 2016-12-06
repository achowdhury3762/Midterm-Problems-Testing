package com.example.ashiquechowdhury.javamidterm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashiquechowdhury on 12/6/16.
 */
public class Problem1Test {
    Problem1 factorialProblem;

    @Before
    public void SetUp(){
        factorialProblem = new Problem1();
    }

    @Test
    public void testIfOneEqualsOne(){
        int methodAnswer = factorialProblem.factorial(5);
        assertEquals(120, methodAnswer);
    }

    @Test
    public void testIf12Equals479001600(){
        int methodAnswer = factorialProblem.factorial(12);
        assertEquals(479001600, methodAnswer);
    }

    @Test
    public void testIf5Equals120(){
        int methodAnswer = factorialProblem.factorial(5);
        assertEquals(120, methodAnswer);
    }

}

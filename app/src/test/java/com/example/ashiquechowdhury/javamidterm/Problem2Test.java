package com.example.ashiquechowdhury.javamidterm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashiquechowdhury on 12/7/16.
 */

public class Problem2Test {
    Problem2 repeatStringProblem;

    @Before
    public void setUp(){
        repeatStringProblem = new Problem2();
    }

    @Test
    public void repeat1(){
        String methodAnswer = repeatStringProblem.repeatEnd("L", 1);
        assertEquals("L", methodAnswer);
    }

    @Test
    public void repeat5(){
        String methodAnswer = repeatStringProblem.repeatEnd("TelePhone", 5);
        assertEquals("PhonePhonePhonePhonePhone", methodAnswer);
    }
}

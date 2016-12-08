package com.example.ashiquechowdhury.javamidterm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashiquechowdhury on 12/6/16.
 */

public class Problem4Test {
    Problem4 tripleProblem;
    @Before
    public void setUp(){
        tripleProblem = new Problem4();
    }

    @Test
    public void testTriplesInARow(){
        String input = "aaaaaaaaaaaaaaaaaaaaa";
        int methodAnswer = tripleProblem.countTriple(input);
        assertEquals(19, methodAnswer);
    }

    @Test
    public void testTriples(){
        String input = "bbbaaaiiiooo";
        int methodAnswer = tripleProblem.countTriple(input);
        assertEquals(4, methodAnswer);
    }

    @Test
    public void testNoTriples(){
        String input = "";
        int methodAnswer = tripleProblem.countTriple(input);
        assertEquals(0, methodAnswer);
    }

    @Test
    public void testTriplesWithDoubles(){
        String input = "oosfsaflkeooeqwwppssqqqssflelll";
        int methodAnswer = tripleProblem.countTriple(input);
        assertEquals(2, methodAnswer);
    }
}

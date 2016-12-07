package com.example.ashiquechowdhury.javamidterm;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ashiquechowdhury on 12/7/16.
 */

public class Problem3Test {
    Problem3 dictionaryTest;
    HashMap<String, String> dictionary;

    @Before
    public void setUp(){
        dictionaryTest = new Problem3();
        dictionary = new LinkedHashMap<>();
        dictionary.put("DictionaryThird", "DICTIONARY");
        dictionary.put("DictionaryFirst", "DICTIONARY");
        dictionary.put("DictionarySecond", "DICTIONARY");
        dictionary.put("PhoneFirst" , "PHONE");
        dictionary.put("BookFirst", "BOOK");
        dictionary.put("SockFirst", "SOCK");
        dictionary.put("PhoneSecond", "PHONE");
        dictionary.put("PhoneThird", "PHONE");
        dictionary.put("DictionaryFourth", "DICTIONARY");
        dictionary.put("PhoneFourth", "PHONE");
        dictionary.put("PaperFirst", "PAPER");
        dictionary.put("PhoneFifth", "PHONE");
        dictionary.put("BookSecond", "BOOK");

    }

    @Test
    public void noKeys(){
        List<String> duplicateList = new ArrayList<>();
        assertEquals(null, dictionaryTest.synonymOf(dictionary, "Nothing"));
        assertEquals(0, duplicateList.size());
    }

    @Test
    public void oneKeys(){
        List<String> duplicateList = new ArrayList<>();
        duplicateList.add("SockFirst");
        assertEquals(duplicateList, dictionaryTest.synonymOf(dictionary, "SOCK"));
        assertEquals(1, duplicateList.size());
    }

    @Test
    public void fiveKeys() {
        List<String> duplicateList = new ArrayList<>();
        duplicateList.add("PhoneFirst");
        duplicateList.add("PhoneSecond");
        duplicateList.add("PhoneThird");
        duplicateList.add("PhoneFourth");
        duplicateList.add("PhoneFifth");
        assertEquals(duplicateList, dictionaryTest.synonymOf(dictionary, "PHONE"));
        assertEquals(5, duplicateList.size());
    }

    @Test
    public void fourKeys(){
        List<String> duplicateList = new ArrayList<>();
        duplicateList.add("DictionaryThird");
        duplicateList.add("DictionaryFirst");
        duplicateList.add("DictionarySecond");
        duplicateList.add("DictionaryFourth");

        assertEquals(duplicateList, dictionaryTest.synonymOf(dictionary, "DICTIONARY"));
        assertEquals(4, duplicateList.size());
    }
}

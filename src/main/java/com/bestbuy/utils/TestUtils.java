package com.bestbuy.utils;

import java.util.Random;

/**
 * Created by Savan Kakadiya
 */
public class TestUtils {
    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }
}

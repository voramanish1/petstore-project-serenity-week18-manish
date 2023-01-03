package io.swagger.petstore.utils;

import java.util.Random;

public class TestUtils {
    public static String getRandomValue() {
        Random random = new Random();
        int randomInt = random.nextInt(10000);
        return Integer.toString(randomInt);
    }

    public static int getRandomDigits() {
        Random random = new Random();
        int randomInt = random.nextInt(10000);
        return randomInt;
    }
}

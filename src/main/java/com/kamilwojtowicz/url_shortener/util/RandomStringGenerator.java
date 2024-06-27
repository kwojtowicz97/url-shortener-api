package com.kamilwojtowicz.url_shortener.util;

import java.util.Random;

public class RandomStringGenerator {
    public final static String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int n, String characters) {
        Random random = new Random();
        StringBuilder randomString = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }
}
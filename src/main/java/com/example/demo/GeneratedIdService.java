package com.example.demo;

import java.util.Random;

public class GeneratedIdService {
    private Random random = new Random();

    public void setRandom(Random random) {
        this.random = random;
    }

    public String get() {
        int number = random.nextInt(10);
        String id = "XYZ" + number;
        return id;
    }
}

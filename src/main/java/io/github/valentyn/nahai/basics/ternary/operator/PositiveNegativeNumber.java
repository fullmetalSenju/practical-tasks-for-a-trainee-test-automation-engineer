package io.github.valentyn.nahai.basics.ternary.operator;

import java.util.Random;

/**
 * Task:
 * Generate a random integer number, output it, then specify whether it negative or positive.
 * You MUST use "ternary" operator.
 */
public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt(Integer.MAX_VALUE) * (random.nextBoolean() ? -1 : 1);

        System.out.println(randomNumber);
        String number = randomNumber < 0 ? "is negative"  : "is positive";
        System.out.println("The number " + number);
    }
}

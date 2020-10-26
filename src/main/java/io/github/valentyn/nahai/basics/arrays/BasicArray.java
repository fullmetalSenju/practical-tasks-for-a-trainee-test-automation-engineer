package io.github.valentyn.nahai.basics.arrays;

import java.util.Random;

/**
 * Task:
 * Create a program that will print a table 100 x 100 size of random numbers.
 * Use a two dimensions array to store numbers and the "for loop" to output them.
 * <p>
 * Создайте программу, которая будет печатать таблицу 100 x 100 размера произвольный чисел.
 * Используйте 2-х мерный массив чтобы хранить числа и "for loop" для их вывода.
 */
public class BasicArray {
    public static void main(String[] args) {
        Random random = new Random();
        int number[][] = new int[100][100];
        for (int i = 0; i < number.length; i++) {
            for(int j = 0; j < number.length; j++){
                System.out.print( " " + random.nextInt(100) + " ");
            }
            System.out.println();
        }
    }
}
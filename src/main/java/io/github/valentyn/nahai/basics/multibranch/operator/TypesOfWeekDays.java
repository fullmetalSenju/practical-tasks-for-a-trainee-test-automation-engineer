package io.github.valentyn.nahai.basics.multibranch.operator;

import java.util.Scanner;

/**
 * Task:
 * Create a program that output the type of a week day according to its number.
 * The number of the week day the user should be able to specify in the input.
 * Use Scanner class to read input stream from the keyboard.
 * Your solution MUST include the usage of the "switch" operator. 
 * Try to use "case" branches in the most effective way.
 * Assume for this task that there are only 2 type: working and weekend days.
 */
public class TypesOfWeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of the day");
        int dayOfTheWeek = scanner.nextInt();
        
        switch (dayOfTheWeek){
            case 1, 2, 3, 4 , 5 -> System.out.println("Workday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Incorrect value, try again");
        }
    }
}

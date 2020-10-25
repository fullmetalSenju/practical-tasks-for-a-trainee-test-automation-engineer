package io.github.valentyn.nahai.basics.input;

import java.util.Scanner;

/*
 * Into:
 * Body mass index (BMI) is a value derived from the mass (weight) and height of a person. 
 * The BMI is defined as the body mass divided by the square of the body height, 
 * and is universally expressed in units of kg/m2,
 * resulting from mass in kilograms and height in metres.
 * 
 * Task:
 * Create a basic BMI calculator.
 * The sample output:
 * Your height in m: 1.85
 * Your weight in kg: 77
 * ---------------------
 * Your BMI is 22.5
 */
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in m: ");
        double height = scanner.nextDouble();
        System.out.println("Enter your wight in kg :");
        int weight = scanner.nextInt();
        System.out.println("Your BMI is " + weight / (height * height));
        
    }
}

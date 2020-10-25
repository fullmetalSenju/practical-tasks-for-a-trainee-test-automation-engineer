package io.github.valentyn.nahai.basics.input;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Task:
 * Collect user info like their names, age, marriage status, insurance ID, total income in a year, etc.
 * You can use as an example from the ScannerUsageExample class.
 * You must use the most appropriate type for each variable and not just Strings for everything.
 * Do be shy to check other info out in the internet.
 */
public class CollectUserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isMarried;
        byte age;
        short bodyHeightInCentimeters; 
        float bodyWeightInKilograms;
        int insuranceId;
        double yearIncomeInDollars;
        char firstLetterOfName;
        String firstName;
        
        try {
            System.out.println("Hello, I have some questions for you. Are you married? (true, false)" );
            isMarried = scanner.nextBoolean();

            System.out.println("What is your  age? ");
            age = scanner.nextByte();

            System.out.println("What is your body height in centimeters? ");
            bodyHeightInCentimeters = scanner.nextShort();

            System.out.println("And write your body weight in kilograms ");
            bodyWeightInKilograms = scanner.nextFloat();

            System.out.println("What is your insurance ID? ");
            insuranceId = scanner.nextInt();

            System.out.println("Tell me about your year income: ");
            yearIncomeInDollars = scanner.nextDouble();

            System.out.println("Write your first letter of the name: ");
            firstLetterOfName = scanner.next().charAt(0);

            System.out.print("What is your first name? Type a string: ");
            firstName = scanner.next(); 
            
            System.out.println("__________________________");
            System.out.println("Your info: ");
            System.out.println("Marriage: " + isMarried);
            System.out.println("Age: " + age);
            System.out.println("Body height in CM: " + bodyHeightInCentimeters);
            System.out.println("Body weight in KG: " + bodyWeightInKilograms);
            System.out.println("Your insurance ID: " + insuranceId);
            System.out.println("Your income: " + yearIncomeInDollars);
            System.out.println("The first letter of th name: " + firstLetterOfName);
            System.out.println("Your name: " + firstName);            
            
        }catch (InputMismatchException ex){
            System.out.println("Incorrect value, try again");        }
    }
}

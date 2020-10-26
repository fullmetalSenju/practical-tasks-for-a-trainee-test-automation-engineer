package io.github.valentyn.nahai.basics.loops;

import java.util.Random;
import java.util.Scanner;

/*
 * Task:
 * Create a program that will set a random secret number, ask the user to input a guess number,
 * and keep printing the prompt message until the number is revealed.
 * Use do-while loop.
 *
 * Создайте программу, которая будет задавать произвольное секретое число, спрашивать пользователя ввести
 * число для одгадывания, продолжать печатать приглашения для ввода, пока число не будет раскрыто.
 * Используйте do-while цикл.
 */
public class GuessingNumber {
    public static void main(String[] args) {
        Random random = new Random(10);
        Scanner scanner = new Scanner(System.in);
        int a = random.nextInt(10);
        int b;
        
        do {
            System.out.println("Guess the number from 0 to 10: ");
            b = scanner.nextInt();
            if(b != a){
                System.out.println("Try again ");
            } else{
                System.out.println("Congrats!");
            
            }
        } while (b != a);
    }
}
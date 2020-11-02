package overloadingMethod;

 
/**
 * Task:
 * Create overloaded methods for summarizing and printing 2 numbers of different types as many as you want.
 * These methods can be static and declared in the class with the "main" method.
 *
 * Задание:
 * Создайте перегруженные методы для суммирования и печати 2 чисел разных типов.
 * Эти методы могут быть статическими и объявляться в классе с "main" методом.
 */
public class methodOverloading {
    public static void main(String[] args) {
        sumAndPrint(4, 5);
        sumAndPrint(6.7, 4.5);
        sumAndPrint(12, 3.14, 34);
        sumAndPrint(4.32f, 6.34f);
        sumAndPrint(34, 2.3, 23.2f, 69);
    }

    public static void sumAndPrint(int firstNumber, int secondNumber) {
        System.out.println("The sum of 2 integer values is " + (firstNumber + secondNumber));
    }
    
    public static void sumAndPrint(double firstNumber, double secondNumber) {
        System.out.println("The sum of 2 double values is " + (firstNumber + secondNumber));
    }
    
    public static void sumAndPrint(int firstNumber, double secondNumber, int thirdNumber){
        System.out.println("The sum of integer and double is: " + (firstNumber+ secondNumber + thirdNumber));
    }
    
    public static float sumAndPrint (float firstNumber, float secondNumber ){
        System.out.println("The sum of floats is: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }
    
    public static void sumAndPrint (int firstNumber, double secondNumber, float thirdNumber, int forthNumber){
        System.out.println("The sum of all values is: " + (firstNumber + secondNumber + thirdNumber + forthNumber));
    }
    
    // ...
}
package recursion;


/**
 * Task:
 * Create a method that calculates fibonacci number using recursion.
 * The base formula is F(n) = F(n - 1) + F(n - 2).
 * <p>
 * Задача:
 * Создайте метод, который вычисляет число Фибоначчи с помощью рекурсии.
 * Базовая формула: F (n) = F (n - 1) + F (n - 2).
 */
public class FibonacciNumber {
    // Uncomment and implement the method
    int fibonacciNumber(int number) {
        if (number < 2) {
            return number;
        } else {
            return (fibonacciNumber(number - 1) + fibonacciNumber(number - 2));
        }
    }

    public static void main(String[] args) {
        FibonacciNumber fib = new FibonacciNumber();
        
        System.out.println("Fibonacci number: " + fib.fibonacciNumber(0));
        System.out.println("Fibonacci number: " + fib.fibonacciNumber(8));
        System.out.println("Fibonacci number: " + fib.fibonacciNumber(13));
        
    }
}
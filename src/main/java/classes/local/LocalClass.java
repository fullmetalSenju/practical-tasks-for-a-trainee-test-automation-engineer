package classes.local;

/**
 * Task:
 * Define a local class in the "getSumOfTwoNumbers" method.
 * Add some functionality in the newly created local class as it is described below in the comments.
 * Create an instance of it, invoke a method on a created object to get a sum.
 * In the "main" method, create an object of LocalClass and invoke the "getSumOfTwoNumbers" method to demonstrate using local classes in practice.
 *
 * Задача:
 * Определите локальный класс в методе getSumOfTwoNumbers.
 * Добавьте некоторые функции во вновь созданный локальный класс, как это описано ниже в комментариях.
 * Создайте его экземпляр, вызовите метод для созданного объекта, чтобы получить сумму.
 * В "main" методе создайте объект LocalClass и вызовите метод «getSumOfTwoNumbers», чтобы продемонстрировать использование локальных классов на практике.
 */
public class LocalClass {
    private double firstNumber;
//    LocalClass(double firstNumber){
//        this.firstNumber = firstNumber;
//    }
    
    public double getSumOfTwoNumbers(double a, double b) {
        // define a local class that contains a "secondNumber" field
        // and getSum() method which calculates the sum of the firstNumber and secondNumber fields 
        firstNumber = a;
        class InnerClass{
            final double secondNumber = b;
            
            public double getSum(){
               return firstNumber + secondNumber; 
            }
          }
        InnerClass innerClass = new InnerClass();

        return innerClass.getSum();
    }

    public static void main(String[] args) {
        // your code here
        LocalClass localClass  = new LocalClass();
        double c = localClass.getSumOfTwoNumbers(3.12, 23.4);
        
        
    }
}
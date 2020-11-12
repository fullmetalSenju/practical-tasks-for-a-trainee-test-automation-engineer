package inheritance;


import inheritance.people.*;

/**
 * Task:
 * There are a base Person class and subclasses (the Professor, Student classes).
 * You have to do the following:
 *   1. Complete Professor, Student classes by implementing abstract method work();
 *   2. Add getters and setters in each class;
 *   3. Add some specific methods to expand subclasses with new behavioral;
 *   4. Follow the principals of encapsulations;
 *   5. Create at least 3 new classes that inherit already provided ones and perform 4 points decribed in the above;
 * The classes to complete the task are in io.github.valentyn.nahai.oop.inheritance.people package.
 *
 * Задача:
 * Есть базовый класс Person и подклассы (классы Professor, Student).
 * Вам необходимо сделать следующее:
 *   1. Завершить классы профессора, ученика, реализовав абстрактный метод work ();
 *   2. Добавить геттеры и сеттеры в каждый класс;
 *   3. Добавить некоторые специфические методы для расширения подклассов с новым поведением;
 *   4. Следовать принципам инкапсуляции;
 *   5. Создать как минимум 3 новых класса, которые наследуют уже предоставленные, и выполнить 4 пункта, описанных выше;
 * Классы для выполнения задачи находятся в пакете io.github.valentyn.nahai.oop.inheritance.people.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        // test created hierarchy of classes here
        Professor professor = new Professor("Harvard", "Professor", "Math", "John", "Male", "Baking street");
        System.out.println("Info about professor: " + professor.getName());
        System.out.println();

        Student student = new Student("Alex", "Kyivskaya street", "male", "Tarasa Shevchenko", 2);
        System.out.println("Info about student: " + student.getName());
        System.out.println( student.participance());
        System.out.println();

        Cook cook = new Cook("Maria", "Dresden", "female", "Pizza", 3);
        System.out.println("Cook's favourite meal is: " + cook.getFavouriteMeal());
        System.out.println("What is for dinner? " + cook.makeMenu());

        System.out.println();

        Manager manager = new Manager("Slava", "Teremkovslaya street","male", "Control process of work", 4);
        System.out.println("How many days off has a manager? " + manager.getDayOff() + " days");
        System.out.println();

        Qa qa = new Qa("Nata", "Birlinstrasse 32", "female", "Fix the layout at the Blog page", 6);
        System.out.println("What is he bug 2321 in Jira? " + qa.getBugReport());
     }
}
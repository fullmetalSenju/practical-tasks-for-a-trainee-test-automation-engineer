package oop;
/**
 * Task:
 * Create several classes that represent entities of the real world.
 * Each class has to contain fields (data described the state of an object), methods (actions needed to operate those data).
 * Another requirements are to provide at least 3 different constructors, one of them should be "default" one.
 * Also, create a runner class which will be a container with "main" method needed to run the program, instantiate objects an so on. 
 *
 * Создайте несколько классов, которые представляют сущности реального мира.
 * Каждый класс должен содержать поля (данные описывают состояние объекта), методы (действия, необходимые для работы с этими данными).
 * Еще одно требование - предоставить как минимум 3 разных конструктора, один из которых должен быть "по умолчанию".
 * Кроме того, создайте runner класс, который будет контейнером с "main" методом, необходимым для запуска программы, создания экземпляров объектов и так далее.
 */
public class Zoo {
    public static void main(String []args){
        Cat cat1 = new Cat("Kusy", 4, "calm");
        Cat cat2 = new Cat();
        Cat cat3 = new Cat(11, "nice");
        System.out.println("Info about the first cat. Name: " + cat1.name + ", age: " + cat1.age + " and behavior: " + cat1.behavior);
        System.out.println("Info about the second cat. Name: " + cat2.name + ", age: " + cat2.age + " and behavior: " + cat2.behavior);
        System.out.println("Info about the third cat. Name: " + cat3.name + ", age: " + cat3.age + " and behavior: " + cat3.behavior);
        cat1.makeMeow();
        System.out.println();



        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Lusia", 8);
        Dog dog3 = new Dog("Laura", 4, "calm");
        System.out.println("So this is the first dog in our Zoo. Its name is "+ dog1.getName() + ", its age: " + dog1.getAge() +" and behavior is unfortunately " + dog1.getBehavior());
        System.out.println("This is the second dog is " + dog2.getName() + ", its age is: " + dog2.getAge() + " and behavior: " + dog2.getBehavior());
        System.out.println("The third dog's name is " + dog3.getName() + ", age: " + dog3.getAge() + ", behavior: " + dog3.getBehavior());
        System.out.println("All dogs make " + dog1.makeWoof());
        
    }
     
}

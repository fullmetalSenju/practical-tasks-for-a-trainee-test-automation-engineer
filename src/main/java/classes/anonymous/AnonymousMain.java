package classes.anonymous;

/**
 * Task:
 * Define and create 2 anonymous classes in the "main" method
 * by extending and implementing Utensil class, FoodCollector interface respectively.
 *
 * Задание:
 * Определите и создайте 2 анонимных класса в "main" методе
 * путем расширения и реализации класса Utensil и интерфейса FoodCollector соответственно.
 */
public class AnonymousMain {
    public static void main(String[] args) {
        // your code here
        FoodCollector foodCollector = new FoodCollector() {
            @Override
            public void collectFood() {
                System.out.println("Collect some food");
            }
        };
        foodCollector.collectFood();
        
        Utensil utensil = new Utensil("Spoon", "eating soup") {
            @Override
            public void use() {
                System.out.println(getName()  + " is for " + getPurpose());
            }
        };
        utensil.use();
        Utensil utensil1 = new Utensil("Plate", "setting meal") {
            @Override
            public void use() {
                System.out.println(getName() + " is for "+  getPurpose());
            }
        };
        utensil1.use();
    }
}
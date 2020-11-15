package classes.inner;

/**
 * Task:
 * Add more functionality in OuterClass, InnerClass classes.
 * Then, in the "main" method create several instances of InnerClass class.
 *
 * Задание:
 * Добавьте больше функциональности в классы OuterClass, InnerClass.
 * Затем в "main" методе создайте несколько экземпляров класса InnerClass.
 */
public class OuterClass {
    private String name = "Slava";
    private int age = 25;
    private String field1;
    // add some class members here
    
    

    class InnerClass {
         public String getField1() {
            return field1;
        }
        public String getName(){
             return name;
        }
        public  Integer getAge(){
             return age;
        }
    }

    public static void main(String[] args) {
        // your code here
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.getName());
        
        InnerClass innerClass1 = outerClass.new InnerClass();
        System.out.println(innerClass1.getAge());
    }
}
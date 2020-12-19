package classes.nested;

/**
 * Task:
 * Add more functionality in OuterClass, NestedClass classes.
 * Try to use non-static fields of OuterClass class in NestedClass class.
 * Also, try to use static fields of Outer class in NestedClass class.
 * Then, in the "main" method create several instances of NestedClass class.
 *
 * Задание:
 * Добавьте больше функциональности в классы OuterClass, NestedClass.
 * Попробуйте использовать нестатические поля класса OuterClass в классе NestedClass.
 * Также попробуйте использовать статические поля OuterClass класса в классе NestedClass.
 * Затем в "main" методе создайте несколько экземпляров класса NestedClass.
 */
public class OuterClass {
    private String field1;
    private static String staticField1;
    private static String name = "Maria";

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public static String getStaticField1() {
        return staticField1;
    }

    public static void setStaticField1(String staticField1) {
        OuterClass.staticField1 = staticField1;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        OuterClass.name = name;
    }

    static class InnerClass {
        public void runInnerClass(){
            System.out.println("Inner class with static filed" + getStaticField1());
            System.out.println("Inner class with static field " + getName());
            //I can't run non-static fields
        }
      }

    @Override
    public String toString() {
        return "OuterClass{" +
            "field1='" + field1 + '\'' +
            '}';
    }

    public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        System.out.println(outerClass.toString());
        System.out.println(innerClass.toString());
        innerClass.runInnerClass();
        
    }
}
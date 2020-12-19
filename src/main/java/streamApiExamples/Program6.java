package streamApiExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program6 {
    public static void main(String []args){
        ArrayList<String >names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[] {"Tom", "Sam", "Bob", "Alice"}));
        System.out.println(names.stream().count()); //4
        
        //amount of elements with length less than 3 symb
        System.out.println(names.stream().filter(n->n.length()<=3).count()); //3
        
        ArrayList<String>names1 = new ArrayList<String>();
        names1.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));

        Optional<String> first = names1.stream().findFirst();
        System.out.println(first.get()); //tom
        
        Optional<String> any = names1.stream().findAny();
        System.out.println(any.get()); //tom
    }
}

package streamApiExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Program7 {
    public static void main(String[] args){
        ArrayList<String>names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}
        ));
        
        //if there any string in the stream, which length if more than 3
        boolean any = names.stream().anyMatch(s -> s.length()>3);
        System.out.println( any); //true
        
        // do all strings have length of 3 symb
        boolean all = names.stream().allMatch(s -> s.length()==3);
        System.out.println(all); //false
        
        // if there string "Bill" in the stream. If not -  true, if there is one - false 
        boolean none = names.stream().noneMatch(s -> s=="Bill");
        System.out.println(none); //true
    }
}

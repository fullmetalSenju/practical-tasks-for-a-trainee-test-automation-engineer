package streamApiExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Program8 {
    public static void main (String[]args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get()); //1
        System.out.println(max.get()); //9
            
    }
}

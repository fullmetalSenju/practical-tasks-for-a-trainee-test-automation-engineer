package streamApiExamples;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program5 {
    public static void main(String[]args ){
        List<String>phone = new ArrayList<String>();
        phone.addAll(Arrays.asList(new String[]
                {"iPhone 6 S", "Lumia 950", "Huawei Nexus 6P",
                    "Samsung Galaxy S 6", "LG G 4", "Xiaomi MI 5",
                    "ASUS Zenfone 2", "Sony Xperia Z5", "Meizu Pro 5",
                    "Lenovo S 850"}
            ));
        int pageSize = 3; // number of elements for one page
        Scanner scanner = new Scanner(System.in);
        while (true){
            
            System.out.println("Enter page number: ");
            int page = scanner.nextInt();
            
            if(page<1)break; //if the number is less than 1, come out of the cycle
            
            phone.stream().skip((page-1) * pageSize)
                .limit(pageSize)
                .forEach(s -> System.out.println(s));
        }
    }
}

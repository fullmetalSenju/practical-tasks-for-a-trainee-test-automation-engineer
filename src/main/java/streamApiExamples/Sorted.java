package streamApiExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted {
    public static void main(String[]args){
        List<String> phone = new ArrayList<String>();
        Collections.addAll(phone, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
            "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
            "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
            "Pixel 2");
        phone.stream()
            .filter(p-> p.length()<12)
            .sorted()// sort by raising
            .forEach(s -> System.out.println(s));
        
    }
}

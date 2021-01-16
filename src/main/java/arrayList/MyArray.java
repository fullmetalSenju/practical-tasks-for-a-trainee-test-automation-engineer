package arrayList;

import java.util.Arrays;

public class MyArray {

    public static void main(String[] args) {
        
        Double a[] = new Double[10];
        Double b[] = new Double[1];
        
        for ( int i = 0; i <= a.length; i++ ){
            if(i < a.length){
                a[i] = Math.random();
            }else{
                b = Arrays.copyOf(a, (int)(a.length * 1.5));
            }
        }
        System.out.println(Arrays.toString(b));
    }
}

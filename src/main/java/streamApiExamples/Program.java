package streamApiExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Program {
  
    public  static void main(String [] args ){
        
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream() //получаю поток
            .filter(s->s.length()==6) //применяю фильтрацию по длине строки 
            .forEach(s->System.out.println(s)); //вывожу отфильтрованные строки на консоль
        
        ArrayList<String> cities1 = new ArrayList<>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        Stream<String> citiesStream = cities.stream(); // получаю поток
        citiesStream = citiesStream.filter(s -> s.length()==6);  //применяю фильтры по длине строки
        citiesStream.forEach(s -> System.out.println(s)); //вывожу отфильтрованные строки на консоль
        
//        citiesStream.forEach(s -> System.out.println(s)); //терминальная операция употребляет поток
//        long number = citiesStream.count();//here is error
//        System.out.println(number);
//        citiesStream = citiesStream.filter(s -> s.length()>5); //тоже будет ошибка, поток употреблен 
        
        Stream<String> citiesStream1 = Arrays.stream(new String[]{"Париж", "Лондон", "Мадрид"});
        citiesStream1.forEach(s -> System.out.println(s));

        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5,6});
        intStream.forEach(i -> System.out.println(i));

        LongStream longStream = Arrays.stream(new long[]{100,250,400,434343,3232});
        longStream.forEach(l-> System.out.println(1));

        DoubleStream doubleStream = Arrays.stream(new double[]{2.2,12.2, 9.3, 232.3});
        doubleStream.forEach(d->System.out.println(d));
        
        Stream<String> citiesStream2 = Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream2.forEach(s->System.out.println(s));
        
        //можно передать массив 
        String[] cities3 = {"Париж", "Лондон", "Мадрид"};
        Stream<String> citiesStream4 = Stream.of(cities3);
        
        IntStream intStream2 = IntStream.of(1,2,3,4,5);
        intStream2.forEach(i->System.out.println(i));
        
        LongStream longStream5 = LongStream.of(100,333,444,55550);
        longStream5.forEach(l->System.out.println(l));
        
        DoubleStream doubleStream5 = DoubleStream.of(3.4,3.2,9.4,323.2);
        doubleStream5.forEach(d->System.out.println(d));
        
        Stream<String> citiesStream6 = Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream6.forEach(s-> System.out.println(s));
        
        Stream<String> citiesStream7 = Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream7.forEach(System.out::println);
        
        Stream<String> citiesStream8 = Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream8.filter(s -> s.length()==6).forEach(s -> System.out.println(s));
     }
    }


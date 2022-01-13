package Practicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        /*
        //Iterating an Iterable with a for each loop
        for (String element: list             ) {
            System.out.println(element.toString());
        }*/

        /*
        //Iterating an Iterable with an iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();;
            System.out.println(element);
        }*/

        list.forEach((element) -> System.out.println(element));
    }
}

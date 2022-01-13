package StreamsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The code taken for this examples is from GeeksforGeeks page https://www.geeksforgeeks.org/java-8-stream-tutorial/
 * Thanks to @solankimayank for writing the article
 */
public class Example1 {
    //A Stream is a sequence of objects, that supports a series of operations which can be pipelined,
    // to get the desired result

    //If we want to use the concept of streams then stream() is the method to be used.
    // Stream is available as an interface.

    //Stream s = c.stream();

    //Where c is a collection
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);

        System.out.println("Printing the collection " + al);
        System.out.println();

        // Stream operations:
        // 1.- Getting the stream
        // 2.- Filtering the even numbers
        // 3.- Collecting the list
        List<Integer> en = al.stream()
                .filter(i -> i%2 == 0)
                .collect(Collectors.toList());

        System.out.println("Printing the list after stream operation" + en);
        System.out.println();

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(30);
        marks.add(28);
        marks.add(76);
        marks.add(96);
        marks.add(79);

        System.out.println("Marks before grace " + marks);

        // Stream operations:
        // 1.- Getting the stream
        // 2.- Making an operation to the elements with map()
        // 3.- Collecting the list
        List<Integer> updatedMarks = marks.stream()
                .map( i -> i+6)
                .collect(Collectors.toList());

        System.out.println("Updated marks " +updatedMarks);
    }

}

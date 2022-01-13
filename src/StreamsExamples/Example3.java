package StreamsExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The code taken for this examples is from GeeksforGeeks page https://www.geeksforgeeks.org/stream-in-java/
 * and howtodo in JAVA shorturl.at/akuO8. Thanks to the team for writing these articles
 */
public class Example3 {
    //A Stream is a sequence of objects, that supports a series of operations which can be pipelined,
    // to get the desired result

    //If we want to use the concept of streams then stream() is the method to be used.
    // Stream is available as an interface.

    //Stream s = c.stream();

    //Where c is a collection
    public static void main(String[] args) {
       // So far we have reviewed some intermediate and terminal operations, so to specify which is which
        // here is a list of each type

        // Intermediate operations
        // 1.- filter()
        // 2.- map()
        // 3.- sorted()

        // Terminal operations
        // 1.-collect()
        // 2.- forEach()
        // 3.- reduce()

        //So lets review sorted intermediate operation and forEach/reduce operations

        //We can sort an integer list
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
        System.out.println(list);

        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        //We can use parameters in the sorted operation
        List<Integer> reversedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reversedList);

        // We can also create our own comparator
        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        };

        List<Integer> ownComparatorList = list.stream()
                .sorted(reverseComparator)
                .collect(Collectors.toList());
        System.out.println("Using our own comparator " + ownComparatorList);

        //Or using a lambda expression
        List<Integer> lambdaList = list.stream()
                .sorted( (i1, i2) -> i2.compareTo(i1) )
                .collect(Collectors.toList());

        System.out.println("Sorting using lambdas  " + lambdaList);
        System.out.println();


        // create a list of String
        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");
        System.out.println("Unsorted list of string "+ names);

        //We can also sort a list of strings
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list of string " + show);
    }

}

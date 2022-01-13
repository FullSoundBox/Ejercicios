package StreamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The code taken for this examples is from GeeksforGeeks page https://www.geeksforgeeks.org/java-8-stream-tutorial/
 * Thanks to @solankimayank for writing the article
 */
public class Example2 {
    //A Stream is a sequence of objects, that supports a series of operations which can be pipelined,
    // to get the desired result

    //If we want to use the concept of streams then stream() is the method to be used.
    // Stream is available as an interface.

    //Stream s = c.stream();

    //Where c is a collection
    public static void main(String[] args) {
        // In general, daily world, whenever the data is being fetched from the database,
        // it is more likely we will be using collection, so there itself streams concept
        // must be applied to deal with processed data.

        //The map function allows us to transform objects in the list into another, by
        // applying a function defined in the lambda expression. In this example, we are
        // transforming String entries into integer values.


        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        System.out.println("original list: " + numbers);

        // Stream operations
        // 1.- Getting the stream
        // 2.- Applying the map function, with the valueOf() method inside the lambda expression
        // 3.- We filter the values that are even
        // 4.- We collect the results with the terminal operation collect()
        List<Integer> even = numbers.stream()
                .map(s -> Integer.valueOf(s))                 //Can be replaced with .map(Integer::valueOf)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("processed list, only even numbers: " + even);
        System.out.println();

        // Conversely, we can transform the integer values into Strings
        List<String> powerOfTwo = even.stream().map(i -> i*i) //We calculate the power of two
                .map( i -> String.valueOf(i))                 //We then transform the integer values into Strings
                .collect(Collectors.toList());                //And then save the values into a List

        System.out.println("List of String-type even numbers powered by two " + powerOfTwo);
    }

}

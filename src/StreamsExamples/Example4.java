package StreamsExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The code taken for this examples is from GeeksforGeeks page https://www.geeksforgeeks.org/stream-in-java/
 * Thanks to the team for writing the article
 */
public class Example4 {
    public static void main(String[] args) {
        // Terminal operations
        // 1.- collect()
        // 2.- forEach()
        // 3.- reduce()

        //So lets review these terminal operations

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);
        System.out.println("Initial list " + numbers);

        // collect method returns a set
        Set<Integer> squareSet = numbers.stream()
                .map(x->x*x)
                .collect(Collectors.toSet());
        System.out.println("Set of squared elements of the list " + squareSet);
        System.out.println();

        // demonstration of forEach method
        System.out.println("Output of the forEach operation");
        numbers.stream().map(x->x*x).forEach(y->System.out.println(y));
        System.out.println();

        // demonstration of reduce method
        System.out.println("Output of the reduce operation");
        int even = numbers.stream()
                .filter(x->x%2==0)
                .reduce(0,(ans,i)-> ans+i);

        System.out.println(even);
    }

}

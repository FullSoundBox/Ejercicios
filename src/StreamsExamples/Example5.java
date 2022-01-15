package StreamsExamples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The code for these examples is taken from Oracle page https://www.oracle.com/technical-resources/articles/java/ma14-java-se-8-streams.html
 * Thanks to Raoul-Gabriel Urma, for writing the article
 */
public class Example5 {
    public static void main(String[] args) {
//        Finding and matching. A common data processing pattern is determining whether some elements match
//        a given property. You can use the anyMatch, allMatch, and noneMatch operations to help you do this.

        List<Transaction> transactions = new ArrayList<>();

//        For example, you can use allMatch to check that all elements in a stream of transactions have
//        a value higher than 100. Note that the before mentioned operations are all terminal.
        boolean expensive =
                transactions.stream()
                        .allMatch(t -> t.getValue() > 100);

//        In addition, the Stream interface provides the operations findFirst and findAny for retrieving
//        arbitrary elements from a stream. They can be used in conjunction with other stream operations such as filter. Both findFirst and findAny return an Optional object
        /*Optional<Transaction> =
        transactions.stream()
                .filter(t -> t.getType() == Transaction.GROCERY)
                .findAny();*/ //TODO: fix this optional object

//        Numeric Streams.
//        Performing operations by ourselves with Integer objects is not efficent. For that,
//        we have the numeric Streams.

        int statementSum =
                transactions.stream()
                        .mapToInt(Transaction::getValue)
                        .sum(); // works!

//        Finally, another useful form of numeric streams is numeric ranges. For example,
//        you might want to generate all numbers between 1 and 100. Java SE 8 introduces
//        two static methods available on IntStream, DoubleStream, and LongStream to help
//        generate such ranges: range and rangeClosed.

        IntStream oddNumbers =
                IntStream.rangeClosed(10, 30)   //range -> non-inclusive, rangeClosed -> inclusive
                        .filter(n -> n % 2 == 1);

        //TODO: review infinite streams and other types of streams
    }

}

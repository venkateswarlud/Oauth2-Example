package com.example.SpringMongoExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {

    public static void main(String[] args) {

        String str = "Lorem adipising ipsum dolor sit Lorem amet Consectetur adipising elit Lorem ipsum dolor";

        List<String> list = Stream.of(str).map(w -> w.split("\\s+")).flatMap(Arrays::stream).sorted()
                .collect(Collectors.toList());

        Map<String, Integer > wordCounter = list.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

        System.out.println(wordCounter);
        System.out.println("==========================================================================");


        Map<String, Long> frequencyMap = Arrays.stream(str.split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

       /** Map<String, Integer> frequencyMap = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(val -> 1)));**/
        for (Map.Entry<String, Long> entry : frequencyMap.entrySet()) {
            System.out.print("key: " + entry.getKey());
            System.out.println(", Value: " + entry.getValue());
        }
        System.out.println("============================================");
       /** System.out.println(Arrays.asList(str).stream()
                .collect(Collectors.groupingBy(Function.<String>identity(),
                        Collectors.<String>counting())));**/


       // Getting Highest value of the given word count.
        String str1 = "Lorem adipising ipsum dolor sit Lorem amet Consectetur adipising elit Lorem ipsum dolor";
        Map<String, Long> frequencyMap1=  Arrays.stream(str1.split("\\s+")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> maxEntry = Collections.max(frequencyMap1.entrySet(), Comparator.comparing(Map.Entry::getValue));
        System.out.println(maxEntry);

    }
}

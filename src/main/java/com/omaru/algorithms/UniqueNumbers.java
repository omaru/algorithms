package com.omaru.algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;


public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(final Collection<Integer> numbers) {
        Map<Integer,Long> frequencies = mapNumbersByFrequencies(numbers);
        return filterUnique(frequencies);
    }

    private static Map<Integer,Long> mapNumbersByFrequencies(final Collection<Integer>numbers){
        return numbers.parallelStream()
                .collect(Collectors.groupingBy(identity(),counting()));
      /*  Map<Integer,Integer> frequencies = new HashMap<>();
        for(Integer number : numbers){
            if(frequencies.containsKey(number)){
                Integer frequency = frequencies.get(number);
                frequencies.put(number,++frequency);
            }else{
                frequencies.put(number,1);
            }
        }
        return frequencies;*/
    }
    private static Collection<Integer>  filterUnique(final Map<Integer,Long> frequencies){
        return frequencies.keySet().parallelStream().filter(n->frequencies.get(n) == 1 ).collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}
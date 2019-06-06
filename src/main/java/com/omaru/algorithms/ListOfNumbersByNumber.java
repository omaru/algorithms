package com.omaru.algorithms;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ListOfNumbersByNumber {
    static Boolean sumExist(List<Integer> numbers, Integer toFind){
        Supplier<Set<Integer>> supplier = ()-> numbers.stream().collect(Collectors.toSet());
        Predicate<Integer> numberExist = (n)->supplier.get().contains(toFind -n);
        return numbers.stream().filter(numberExist).count()>0;
    }
}

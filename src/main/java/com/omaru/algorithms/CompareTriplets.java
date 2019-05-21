package com.omaru.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CompareTriplets {

    static List<Long> compareTriplets(List<Integer> a, List<Integer> b) {
         long alice = IntStream.range(0,Math.min(a.size(),b.size()))
                .mapToObj(i-> new Integer[]{a.get(i),b.get(i)})
                 .filter(i->i[0]>i[1]).count();
         long bob = IntStream.range(0,Math.min(a.size(),b.size()))
                 .mapToObj(i-> new Integer[]{a.get(i),b.get(i)})
                 .filter(i->i[0]<i[1]).count();
         return Arrays.asList(alice,bob);
    }
}

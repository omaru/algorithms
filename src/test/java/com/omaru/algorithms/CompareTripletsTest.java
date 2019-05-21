package com.omaru.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CompareTripletsTest {
    @Test
    public void itShouldRetrieveProperResults(){
        List<Integer> a = Arrays.asList(17,28,30);
        List<Integer> b = Arrays.asList(99,16,8);
        Assertions.assertEquals(Arrays.asList(2L,1L),CompareTriplets.compareTriplets(a,b));
    }
}

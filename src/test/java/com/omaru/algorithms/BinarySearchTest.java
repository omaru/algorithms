package com.omaru.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void shouldReturnIndexSearch(){
        int[] array = {1,3,4,6,7,8,11,15,22,25,33};
        int index = BinarySearch.search(array,33);
        assertEquals(10,index);
    }
}

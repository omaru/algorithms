package com.omaru.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersInSequenceTest {
    @Test
    void shouldBeInSequence(){
        int[] toCheck={1,2,3,4,5,6};
        Assertions.assertTrue(NumbersInSequence.test(toCheck));
    }
    @Test
    void shouldNotBeInSequence(){
        int[] toCheck={1,2,3,5,6};
        Assertions.assertFalse(NumbersInSequence.test(toCheck));
    }

}

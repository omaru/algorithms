package com.omaru.algorithms;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SumAddUpTest {
    @Test
    void shouldAddUp(){
        assertTrue(ListOfNumbersByNumber.sumExist(Arrays.asList(10,15,3,7),17));
    }
}

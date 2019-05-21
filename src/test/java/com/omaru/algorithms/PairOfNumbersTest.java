package com.omaru.algorithms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PairOfNumbersTest{

		@Test
		public void itShouldRetrieveAnExistentPairOfNumbers(){
			List<Integer> input= Arrays.asList(5,2,1,4,10,-1);
			int toSearch =20;
			assertEquals(Arrays.asList(5,4),PairOfNumbers.pair(input,toSearch));
			
		}

}

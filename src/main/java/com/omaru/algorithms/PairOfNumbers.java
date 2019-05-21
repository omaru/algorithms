package com.omaru.algorithms;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PairOfNumbers{

		public static List<Integer>  pair(List<Integer>inputArray,int toSearch){
			Set<Integer> input = inputArray.stream().collect(Collectors.toSet());
			Optional<Integer> number = inputArray.stream().filter(i->input.contains(toSearch/i)).findFirst();
			List<Integer> result = new ArrayList<>();
			if(number.isPresent()){
				result.add(number.get());
				result.add(toSearch/number.get());
			}
			return result;
		}
}

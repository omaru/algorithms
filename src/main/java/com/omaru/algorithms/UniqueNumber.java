package com.omaru.algorithms;
import java.util.*;
public class UniqueNumber{
	private Integer[] numbers;
	private Integer unique;
	private UniqueNumber(Integer[] numbers){
		this.numbers = numbers;
	}

	public static UniqueNumber of(Integer[] numbers){
	   return new UniqueNumber(numbers);
	}

	public Optional<Integer> get(){
		return unique == null ? findUnique(): Optional.of(unique);
	}

	private Optional<Integer> findUnique(){
		return asBruteForce();
	}

	private Optional<Integer> asBruteForce(){
		for(int i = 0; i < numbers.length;i++){
			Integer current = numbers[i];
		        int counter = 0;
			for(int j = 0; j < numbers.length;j++){
				if(current == numbers[j]){
					counter+=1;
				}
			}
			if(counter == 1){
				return Optional.of(current);
			}
		}
		return Optional.ofNullable(null);
	}
}

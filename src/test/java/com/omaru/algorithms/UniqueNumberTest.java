package com.omaru.algorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UniqueNumberTest{
	@Test
	public void shouldRetrieveAuniqueNumber(){
		Integer[] numbers={1,1,3,3,8,6,9,8,6};
		UniqueNumber uniqueNumber = UniqueNumber.of(numbers); 
		int uniqueNumberResult = uniqueNumber.get().get();
		assertEquals(9,uniqueNumberResult);
	}
}

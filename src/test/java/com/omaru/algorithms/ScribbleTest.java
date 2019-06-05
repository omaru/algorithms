package com.omaru.algorithms;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ScribbleTest{
 @Test
 void shouldReturnScribbledResultsByParams(){
	String input="My dear fernanda this is my credit card with an input of 30000 and also there are some things that we should consider"+
		     " in regards of whatever things you said in the past";
	Set<String> hideWords = new HashSet<>();
	hideWords.add("fernanda");
	hideWords.add("said");
	hideWords.add("some");
	String result = Scribble.patch(input,hideWords);
	assertEquals("My xxx xxx xxx is my credit card with an input of 30000 and also there xxx xxx xxx that we should consider in regards"+
	            " of whatever things xxx xxx xxx the past",result);
 }
}

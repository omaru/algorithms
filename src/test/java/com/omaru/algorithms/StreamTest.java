package com.omaru.algorithms;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StreamTest{
  @Test
  void itShouldGetStream(){

	String input="this is the story of a girl who cried a river";
	String output = StreamOutput.get(input);
    Assertions.assertEquals("this is THE story of a girl WHO cried a river",output);
  }
}

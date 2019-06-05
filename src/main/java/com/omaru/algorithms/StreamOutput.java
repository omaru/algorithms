package com.omaru.algorithms;

import com.sun.net.httpserver.Filter;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOutput{
   public static String get(String input){
       return Arrays.stream(input.split(("\\s+")))
               .map(StreamOutput::filterString).collect(Collectors.joining(" "));
   }
   static String filterString(String toFilter){
       Function<String,String> filter =
               (token)->token.length()==3?token.toUpperCase():token;
       return filter.apply(toFilter);
   }
}

package com.omaru.algorithms;
import java.util.Set;

public final class Scribble{
	public static String patch(String input,Set<String> hideWords){
	   String[] inputArray = input.split("\\s+");
	   StringBuilder output = new StringBuilder();
	   for(int i =0; i < inputArray.length;i++){
	   	if(i!=0){
			output.append(" ");
		}
		String currentWord = inputArray[i];
		String nextWord = (i+1) == inputArray.length? "":inputArray[i+1];
		String afterNextWord = (i+2) >= inputArray.length? "" : inputArray[i+2];
	        if(hideWords.contains(nextWord)){
			output.append("xxx");
			if(!"".equals(nextWord))
			output.append(" xxx ");
			if(!"".equals(afterNextWord))
			output.append("xxx");
			i=i+2;
		}else{
			output.append(currentWord);
		}

	   }
	   return output.toString();
	} 
}

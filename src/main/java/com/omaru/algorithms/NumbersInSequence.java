package com.omaru.algorithms;

public class NumbersInSequence {
    public static boolean test(int[] toCheck) {
        return test(toCheck,0);
    }
    private static boolean test(int[] toCheck,int i){
        if(i+1 >= toCheck.length)
            return true;

        if(toCheck[i+1] - toCheck[i] != 1)
            return false;

        return test(toCheck,i+1);
    }
}

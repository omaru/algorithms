package com.omaru.algorithms;

public class BinarySearch {
    public static int search(int[] array, int target) {
        int lo=0;
        int hi = array.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target >array[mid]){
                lo = mid+1;
            }else if(target < array[mid]){
                hi = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}

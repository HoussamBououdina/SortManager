package com.spartaglobal;

import java.util.Arrays;

public class BinarySort implements Sorter {

    public int[] sortArray(int[] arrayToSort){
        if(arrayToSort==null)
            return null;

        int[] sortedArray= Arrays.copyOf(arrayToSort,arrayToSort.length);

        for (int i = 1; i < sortedArray.length; i++)
        {
            int x = sortedArray[i];

            // Find location to insert using binary search
            int j = Math.abs(Arrays.binarySearch(sortedArray, 0, i, x) + 1);

            //Shifting array to one location right
            System.arraycopy(sortedArray, j, sortedArray, j+1, i-j);

            //Placing element at its correct location
            sortedArray[j] = x;
        }
        return sortedArray;

    }


}

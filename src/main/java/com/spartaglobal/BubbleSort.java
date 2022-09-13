package com.spartaglobal;

import java.util.Arrays;

public class BubbleSort implements Sorter {

    boolean swapped = false;
    int temp;
    public int[] sortArray(int[] arrayToSort){
        if(arrayToSort==null)
            return null;

        int[] sortedArray= Arrays.copyOf(arrayToSort,arrayToSort.length);
        int size=(sortedArray.length-1);
        swapped = false;

        if(sortedArray.length==0||sortedArray.length==1)
            return arrayToSort;
        do{
            swapped = false;
            for(int i=0;i<size;i++){
                if(sortedArray[i]>sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    swapped=true;
                }
            }
            size=size-1;
        }while(swapped);

        return sortedArray;


    }

    public int[] sortDescArray(int[] arrayToSort){
        if(arrayToSort==null)
            return null;

        int[] sortedArray= Arrays.copyOf(arrayToSort,arrayToSort.length);
        int size=(sortedArray.length-1);
        swapped = false;

        if(sortedArray.length==0||sortedArray.length==1)
            return arrayToSort;
        do{
            swapped = false;
            for(int i=0;i<size;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    swapped=true;
                }
            }
            size=size-1;
        }while(swapped);

        return sortedArray;


    }


}

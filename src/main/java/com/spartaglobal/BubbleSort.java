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
        int dup =0;

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

        for (int i=0;i<sortedArray.length-1;i++)
        {
            if(sortedArray[i]==sortedArray[i+1])
            {
                dup++;
            }

        }
        int[] noDupSorted= new int[sortedArray.length-dup];
        int noDupIndex=1;
        noDupSorted[0]=sortedArray[0];
       for (int i=1;i<sortedArray.length;i++)
        {
            if(sortedArray[i]!=sortedArray[i-1])
            {
                noDupSorted[noDupIndex]=sortedArray[i];
                noDupIndex++;
            }

        }

        return noDupSorted;


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

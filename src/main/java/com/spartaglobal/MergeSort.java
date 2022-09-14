package com.spartaglobal;

import java.util.Arrays;

public class MergeSort  implements Sorter{


    public int[] sortArray(int[] arrayToSort){

        if(arrayToSort==null)
            return null;
        if(arrayToSort.length==1)
        {
            return arrayToSort;
        }

        else
        {
            int[] firstHalf = new int[arrayToSort.length/2];
            int[] secondHalf = new int[arrayToSort.length- firstHalf.length];

            for(int i=0;i< arrayToSort.length;i++)
            {
                if(i< firstHalf.length)
                {
                    firstHalf[i]=arrayToSort[i];
                } else {
                    secondHalf[i- firstHalf.length]=arrayToSort[i];

                }


            }
            return (removeDupes(mergeArrays(sortArray(firstHalf),sortArray(secondHalf))));
        }

    }

    public int[] mergeArrays(int[] arr1, int[] arr2){

        if((arr1==null)&&(arr2==null))
            return null;
        else if(arr1==null)
            return Arrays.copyOf(arr2,arr2.length);

        else if(arr2==null)
            return Arrays.copyOf(arr1,arr1.length);

        else if(arr1[0]>=arr2[arr2.length-1])
            return merge(arr2,arr1);

        else if(arr2[0]>=arr1[arr1.length-1])
            return merge(arr1,arr2);

        int[] sortArray=new int[arr1.length+arr2.length];
        int arr1Index=0;
        int arr2Index=0;
        while((arr1Index<arr1.length)&&(arr2Index<arr2.length))
        {
            if(arr1[arr1Index]<arr2[arr2Index]){
                sortArray[arr1Index+arr2Index]=arr1[arr1Index];
                arr1Index++;
            }
            else
            {
                sortArray[arr1Index+arr2Index]=arr2[arr2Index];
                arr2Index++;

            }

        }
        if(arr1Index<arr1.length)
        {
            for(int i=arr1Index;i<arr1.length;i++)
            {
                sortArray[i+arr2Index]=arr1[i];
            }
        }
        else {
            for(int i=arr2Index;i<arr2.length;i++)
            {
                sortArray[arr1Index+i]=arr2[i];
            }
        }


        return sortArray;
    }

    private int[] merge(int[] arr1,int[] arr2){

        int[] merged = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[i + arr1.length ] = arr2[i];
        }


        return merged;

    }

    private int[] removeDupes(int[] sortedArray)
    {
        int dup=0;


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
}

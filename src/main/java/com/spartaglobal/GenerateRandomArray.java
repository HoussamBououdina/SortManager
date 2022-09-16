package com.spartaglobal;

public class GenerateRandomArray {

    public static int[] generateRandomArray(int arraySize){
        int[] array = new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            array[i]=(int)(Math.random()*10000);
        }


        return array;

    }
}

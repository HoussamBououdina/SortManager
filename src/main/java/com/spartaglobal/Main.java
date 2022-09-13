package com.spartaglobal;

public class Main {
    public static void main(String[] args) {
        BubbleSort b= new BubbleSort();
       // BinarySort b1 = new BinarySort();
        MergeSort m = new MergeSort();
        int[] arr= {8,1,2,5,11,15,5,20,5,5,5,11,30,2,1};
        int[] arr2 =b.sortArray(arr);
        //int[] arr3 =b1.sortArray(arr);
        int[] arr4 =m.sortArray(arr);

        System.out.println("Array sorted in Ascending order");
        for (int j : arr2) {

            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("Array sorted in binary sort");
       // for (int j : arr3) {
           // System.out.print(j+" ");
       // }

        System.out.println();
        System.out.println("Array sorted in merge sort");
        for (int j : arr4) {

            System.out.print(j+" ");
        }

    }
}
package com.spartaglobal;

public class DisplayArray {


    public static void displaySortedArray(int[] array,SortType sortType,long time){
        System.out.println("Numbers after being sorted using "+sortType.toString().toLowerCase()+" are");
        for(int num:array){

            System.out.print(num+", ");
        }
        System.out.println();
        System.out.println("Time taken by the "+sortType.toString().toLowerCase()+" was "+time+" nano seconds");
        System.out.println();
    }
    public static void displaySortedArray(int[] array,SortType sortType){
        System.out.println("Numbers after being sorted using "+sortType.toString().toLowerCase()+" are");
        for(int num:array){

            System.out.print(num+", ");
        }
        System.out.println();
    }
    public static void displayUnsortedArray(int[] array,SortType sortType){
        System.out.println("Numbers before being sorted using "+sortType.toString().toLowerCase()+" are");
        for(int num:array){

            System.out.print(num+", ");
        }

        System.out.println();

    }
}

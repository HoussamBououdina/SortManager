package com.spartaglobal;


public class Starter {

    public static void start(){
        int size;
        int choice;
        int[] unSortedArray;
        int[] sortedArray;
        SortFactory sortFactory=new SortFactory();
        choice=chooseSort.chosenSort();
        size=chooseArraySize.arraySize();
        unSortedArray=GenerateRandomArray.generateRandomArray(size);
        if((choice<=2)){
            DisplayArray.displayUnsortedArray(unSortedArray,SortType.values()[choice]);
            Sorter s1 =sortFactory.getSort(SortType.values()[choice]);
            sortedArray=s1.sortArray(unSortedArray);
            DisplayArray.displaySortedArray(sortedArray,SortType.values()[choice]);
        }
        else {
            int[] bubbleSorted,mergeSorted,bTreeSorted;
            long startTime,bubbleSortTime,mergeSortTime,bSortTime;
            Sorter bubbleSort =sortFactory.getSort(SortType.values()[0]);
            Sorter mergeSort =sortFactory.getSort(SortType.values()[1]);
            Sorter bTreeSort =sortFactory.getSort(SortType.values()[2]);

            startTime=System.nanoTime();
            bubbleSorted=bubbleSort.sortArray(unSortedArray);
            bubbleSortTime=System.nanoTime()-startTime;

            startTime=System.nanoTime();
            mergeSorted=mergeSort.sortArray(unSortedArray);
            mergeSortTime=System.nanoTime()-startTime;

            startTime=System.nanoTime();
            bTreeSorted=bTreeSort.sortArray(unSortedArray);
            bSortTime=System.nanoTime()-startTime;

            DisplayArray.displaySortedArray(bubbleSorted,SortType.values()[0],bubbleSortTime);
            DisplayArray.displaySortedArray(mergeSorted,SortType.values()[1],mergeSortTime);
            DisplayArray.displaySortedArray(bTreeSorted,SortType.values()[2],bSortTime);

        }

    }

}

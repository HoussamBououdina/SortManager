package com.spartaglobal;


import com.spartaglobal.sorters.Sorter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Starter {
    public static Logger logger= LogManager.getLogger(Starter.class);

    public static void start(){
        int size;
        int choice;
        int[] unSortedArray;
        int[] sortedArray;
        logger.log(Level.INFO,"Program has started running");
        SortFactory sortFactory=new SortFactory();
        choice= ChooseSort.chosenSort();
        if(choice <3) {
            logger.log(Level.INFO, "User has chosen option " + (choice + 1) + " which represents " + SortType.values()[choice]);
        }
        else
            logger.log(Level.INFO, "User has chosen option " + (choice + 1) + " which represents Bubble ,Merge and Binary Tree sort");

        size= ChooseArraySize.arraySize();
        logger.log(Level.INFO,"User has chosen to create an array with "+size+" elements");

        unSortedArray=GenerateRandomArray.generateRandomArray(size);
        logger.log(Level.INFO,"The random generated array is: "+ Arrays.toString(unSortedArray));
        if((choice<=2)){
            DisplayArray.displayUnsortedArray(unSortedArray,SortType.values()[choice]);
            Sorter s1 =sortFactory.getSort(SortType.values()[choice]);
            long startTime=System.nanoTime();
            sortedArray=s1.sortArray(unSortedArray);
            long sortTime=System.nanoTime()-startTime;
            logger.log(Level.INFO,"Time taken by "+SortType.values()[choice]+" is "+ sortTime+"ns");
            logger.log(Level.INFO,"Array after being Sorted by "+SortType.values()[choice]+" is "+ Arrays.toString(sortedArray));
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
            logger.log(Level.INFO,"Time taken by "+SortType.values()[0]+" is "+ bubbleSortTime);
            logger.log(Level.INFO,"Array after being Sorted by "+SortType.values()[0]+" is "+ Arrays.toString(bubbleSorted)+"ns");

            startTime=System.nanoTime();
            mergeSorted=mergeSort.sortArray(unSortedArray);
            mergeSortTime=System.nanoTime()-startTime;
            logger.log(Level.INFO,"Time taken by "+SortType.values()[1]+" is "+ mergeSortTime);
            logger.log(Level.INFO,"Array after being Sorted by "+SortType.values()[1]+" is "+ Arrays.toString(mergeSorted)+"ns");

            startTime=System.nanoTime();
            bTreeSorted=bTreeSort.sortArray(unSortedArray);
            bSortTime=System.nanoTime()-startTime;
            logger.log(Level.INFO,"Time taken by "+SortType.values()[2]+" is "+ bSortTime);
            logger.log(Level.INFO,"Array after being Sorted by "+SortType.values()[2]+" is "+ Arrays.toString(bTreeSorted)+"ns");


            DisplayArray.displaySortedArray(bubbleSorted,SortType.values()[0],bubbleSortTime);
            DisplayArray.displaySortedArray(mergeSorted,SortType.values()[1],mergeSortTime);
            DisplayArray.displaySortedArray(bTreeSorted,SortType.values()[2],bSortTime);

        }

        logger.log(Level.INFO,"Program has finished and is shutting down");



    }

}

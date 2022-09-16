package com.spartaglobal;

public class SortFactory {

    public Sorter getSort(SortType sortType){

        return switch(sortType){

            case BUBBLESORT -> new BubbleSort();
            case MERGESORT -> new MergeSort();
            case BINARYSORT -> new BinarySort();
            default -> null;


        };


    }
}

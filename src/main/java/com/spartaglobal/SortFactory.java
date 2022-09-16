package com.spartaglobal;

import com.spartaglobal.sorters.BinarySort;
import com.spartaglobal.sorters.BubbleSort;
import com.spartaglobal.sorters.MergeSort;
import com.spartaglobal.sorters.Sorter;

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

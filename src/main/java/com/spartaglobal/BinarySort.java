package com.spartaglobal;

import java.util.Arrays;

public class BinarySort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTree b = new BinaryTree();
        for(int i=0;i<arrayToSort.length;i++){

            b.add(arrayToSort[i]);
        }

        return b.returnAsArray();
    }


}

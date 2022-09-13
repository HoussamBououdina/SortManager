package com.spartaglobal;

import java.util.Arrays;

public class BinarySort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTree b = new BinaryTree();

        Node n= new Node(arrayToSort[0]);
        for(int i=0;i<arrayToSort.length;i++){

            b.add(n,arrayToSort[i]);
        }




        return null;                //replace later
    }


}

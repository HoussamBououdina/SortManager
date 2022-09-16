package com.spartaglobal.sorters;

public class BinarySort implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTree b = new BinaryTree();
        if(arrayToSort==null)
            return null;
        if(arrayToSort.length==0)
            return arrayToSort;
        for(int i=0;i<arrayToSort.length;i++){

            b.add(arrayToSort[i]);
        }

        return b.returnAsArray();
    }


}

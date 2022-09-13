package com.spartaglobal;

public class BinaryTree {

    BinaryTree(){

    }
    public void add(Node start, int data){
        if(start==null){
            start= new Node(data);

        }
        if(start.data>data)
        {
            add(start.left,data);
        }
        else if(start.data<data){

            add(start.right,data);

        }
    }

    public int[] returnAsArray(){

        return null;
    }
}

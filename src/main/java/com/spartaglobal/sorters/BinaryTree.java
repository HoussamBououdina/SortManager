package com.spartaglobal.sorters;

public class BinaryTree {

    int num=0;
    int index=0;
    Node root;

    BinaryTree(){
        root = null;
    }
    public void add( int data){
           root = add(root,data);
    }
    public Node add( Node current, int data){
        if(current==null){
            num++;
            return new Node(data);

        }
        else  if(current.data>data)
        {
            current.left= add(current.left, data);
        }
        else if(current.data<data) {

            current.right= add(current.right, data);
        }
        return current;
    }

    public int[] returnAsArray(){
        int[] array = new int[num];

        addNodeToArray(root,array,index);

        return array;
    }
    public void addNodeToArray(Node n, int[] sorted, int currentIndex){
        if (n != null) {
            if(n.left!=null){
                addNodeToArray(n.left,sorted,index);
            }
            sorted[index]= n.data;
            index++;
            if(n.right!=null){
                addNodeToArray(n.right,sorted,index);
            }

        }

    }
}

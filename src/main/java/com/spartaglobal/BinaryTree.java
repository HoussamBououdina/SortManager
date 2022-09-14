package com.spartaglobal;

public class BinaryTree {

    int num=0;
    Node root;

    BinaryTree(){
        root = null;
    }
    public void add( int data){
        if(num==0){
            root = new Node(data);
            num++;
        }
       else  if(root.data>data)
        {
            root.left=add(root.left, data);
        }
        else if(root.data<data){

            root.right=add(root.right, data);

        }
    }
    public Node add( Node current, int data){
        if(current==null){
            current= new Node(data);
            num++;
            return current;

        }
        else  if(current.data>data)
        {
            return add(current.left, data);
        }
        else if(current.data<data) {

            return add(current.right, data);
        }
        return current;
    }

    public int[] returnAsArray(){
        int[] array = new int[num];

        if(num==1)
            array[0]=root.data;

     /*   else {
            while(num!=0)
            {
                                        //find a way to go through tree and return it as an array
            }
        }

        }
      */
        return array;
    }
}

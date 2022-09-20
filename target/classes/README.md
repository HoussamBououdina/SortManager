# Sort Manager
This is an app designed to take an array and sort it in descending order of the elements. This application asks the user to decide which type of sorting algorithm from the ones listed to use. 
It then asks the user to enter the size of the array to be sorted. The array is then filled with random number from 1 to 10,000
The 3 sorting algorithms used in this Application are:

* Bubble Sort
* Merge Sort
* Binary Tree Sort

### Sorter Interface:
* This is the interface which all sort algorithms implement. Each sort class has to implement the sortArray() method of this interface
```java 
public interface Sorter {

    int[] sortArray(int[] arrayToSort);

}
```

### Mergesort Class:
* This class implements the above Sorter Interface and sorts by continuously dividing the given array into the 2 arrays until each array has 1 element.
* Then it returns the array and sorts it recursively.
* The method below calls the merge arrays method that sorts given arrays then sorts them.
```java 
  public int[] sortArray(int[] arrayToSort){

        if(arrayToSort==null)
            return null;
        if(arrayToSort.length==0)
            return arrayToSort;
        if(arrayToSort.length==1)
        {
            return arrayToSort;
        }

        else
        {
            int[] firstHalf = new int[arrayToSort.length/2];
            int[] secondHalf = new int[arrayToSort.length- firstHalf.length];

            for(int i=0;i< arrayToSort.length;i++)
            {
                if(i< firstHalf.length)
                {
                    firstHalf[i]=arrayToSort[i];
                } else {
                    secondHalf[i- firstHalf.length]=arrayToSort[i];

                }


            }
            return (removeDupes(mergeArrays(sortArray(firstHalf),sortArray(secondHalf))));
        }

    }
```


### Bubble Sort.
* This is a sort algorithm that compares 2 elements of an array at a time and sorts them. It is less optimal for larger arrays.
```java 
public int[] sortArray(int[] arrayToSort){
        if(arrayToSort==null)
            return null;

        int[] sortedArray= Arrays.copyOf(arrayToSort,arrayToSort.length);
        int size=(sortedArray.length-1);
        swapped = false;
        int dup =0;

        if(sortedArray.length==0||sortedArray.length==1)
            return arrayToSort;
        do{
            swapped = false;
            for(int i=0;i<size;i++){
                if(sortedArray[i]>sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    swapped=true;
                }
            }
            size=size-1;
        }while(swapped);

        for (int i=0;i<sortedArray.length-1;i++)
        {
            if(sortedArray[i]==sortedArray[i+1])
            {
                dup++;
            }

        }
        int[] noDupSorted= new int[sortedArray.length-dup];
        int noDupIndex=1;
        noDupSorted[0]=sortedArray[0];
       for (int i=1;i<sortedArray.length;i++)
        {
            if(sortedArray[i]!=sortedArray[i-1])
            {
                noDupSorted[noDupIndex]=sortedArray[i];
                noDupIndex++;
            }

        }

        return noDupSorted;


    }
```

### Binary Tree Sort:

* This class sorting algorithm sorts arrays but taking the first element and using it as the root node.
* The subsequent elements are then placed in nodes to the left or right depending on whether they are smaller or larger than the nodes.
* It uses other classes that implement the function of adding and traversing through the binary tree.
```java
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
```
### Sort Type
* This is an ENUM used in the sort factory to determine which sorting algorithm to use based on user input.
```java
public enum SortType {
    BUBBLESORT,
    MERGESORT,
    BINARYSORT;

}

```
### ChooseArraySize

This class is used to ask the user what size of array they would like to sort then create it.

### GenerateRandomArray

This class is used to then fill the above array with random values.

```java 

public static int[] generateRandomArray(int arraySize){
        int[] array = new int[arraySize];
        for(int i=0;i<arraySize;i++)
        {
            array[i]=(int)(Math.random()*10_000);
        }


        return array;

    }
    
    
```
### Starter
This Class represents the Controller from MVC model in java design. It is in charge of calling all relevant methods for the program to function.
* It also includes logging to see what happened through the runtime of the program.
* it also generates required objects for the program. 
* it calls the methods to ask the user for input and also the methods to display results to the user.

```java 
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
```

# Bubble Sorter
This is an app designed to take an array and sort it in descending order of the elements.
This app uses the bubble sort algorithm which is the simplest sorting algorithm. 
* It basically compares 2 values at a time and swaps them if the second value it larger than the first.
* It then moves to the third element and compares it with the second element and does the same.
* It repeats this until it reaches the end.


## Methods:

### public int[] sortArray(int[] arrayToSort):
This is the main method of the class and sorts the array using the bubble sort Algorithm. This is divided into different parts that perform different function. it returns the array after sorting it.

#### boolean swapped 
This is a boolean variable used to determine whether any values have been swapped in an array.
```java 
for(int i=0;i<size;i++){
                if(sortedArray[i]>sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    swapped=true;
                }
                
```


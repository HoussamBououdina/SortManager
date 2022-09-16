import com.spartaglobal.sorters.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestMergeSort {

    @Test
    @DisplayName("test normal array")
    void testArray(){
        MergeSort b=new MergeSort();
        int[] arr1 = {7,5,1,3};
        int[] arr2 = {1,3,5,7};
        int[] sorted=b.sortArray(arr1);
        Assertions.assertArrayEquals(arr2,sorted);

    }

    @Test
    @DisplayName("test single element array")
    void testSingleElementArray(){
        MergeSort m=new MergeSort();
        int[] arr1 = {7};
        int[] arr2 = {7};
        int[] sorted=m.sortArray(arr1);
        Assertions.assertArrayEquals(arr2,sorted);

    }

    @Test
    @DisplayName("test array with negative values")
    void testNegArray(){
        MergeSort m=new MergeSort();
        int[] arr1 = {7,-5,1,3};
        int[] arr2 = {-5,1,3,7};
        int[] sorted=m.sortArray(arr1);
        Assertions.assertArrayEquals(arr2,sorted);

    }

    @Test
    @DisplayName("test a null array")
    void testNullArray(){
        MergeSort m=new MergeSort();
        int[] arr1 = null;
        int[] arr2 = null;
        int[] sorted=m.sortArray(arr1);
        Assertions.assertArrayEquals(arr2,sorted);

    }

    @Test
    @DisplayName("test array with no elements")
    void testNoElementArray(){
        MergeSort m=new MergeSort();
        int[] arr1 = {};
        int[] arr2 = {};
        int[] sorted=m.sortArray(arr1);
        Assertions.assertArrayEquals(arr2,sorted);

    }


}

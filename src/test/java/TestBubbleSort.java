import com.spartaglobal.sorters.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestBubbleSort {



@Test
@DisplayName("test normal array")
void testArray(){
    BubbleSort b=new BubbleSort();
    int[] arr1 = {7,5,1,3};
    int[] arr2 = {1,3,5,7};
    int[] sorted=b.sortArray(arr1);
    Assertions.assertArrayEquals(arr2,sorted);

}

    @Test
    @DisplayName("test single element array")
    void testSingleElementArray(){
        BubbleSort b=new BubbleSort();
        int[] arr1 = {7};
        int[] arr2 = {7};
        int[] sorted=b.sortArray(arr1);
        Assertions.assertArrayEquals(arr2,sorted);

    }

    @Test
    @DisplayName("test array with negative values")
    void testNegArray(){
        BubbleSort b=new BubbleSort();
        int[] arr1 = {7,-5,1,3};
        int[] arr2 = {-5,1,3,7};
        int[] sorted=b.sortArray(arr1);
        Assertions.assertArrayEquals(arr2,sorted);

    }

    @Test
    @DisplayName("test a null array")
    void testNullArray(){
        BubbleSort b=new BubbleSort();
        int[] arr1 = null;
        int[] arr2 = null;
        int[] sorted=b.sortArray(arr1);
        Assertions.assertArrayEquals(arr2,sorted);

    }

    @Test
    @DisplayName("test array with no elements")
    void testNoElementArray(){
        BubbleSort b=new BubbleSort();
        int[] arr1 = {};
        int[] arr2 = {};
        int[] sorted=b.sortArray(arr1);
        Assertions.assertArrayEquals(arr2,sorted);

    }



}

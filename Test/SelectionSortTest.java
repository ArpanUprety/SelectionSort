import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class SelectionSortTest {

        @Test
        public void testSelectionSort(){
            int[] testArr = new int[]{9,8,7,6,5,4,3,2,1};
            int[] validArr = new int[]{1,2,3,4,5,6,7,8,9};
            SelectionSort.SelectionSort(testArr);
            assertArrayEquals(validArr, testArr );
        }




}

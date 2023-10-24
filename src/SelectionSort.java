import javax.swing.*;
import java.util.ArrayList;
public class SelectionSort {



    public static void main(String[] args) {

     int  myArray[] = new int[]{82,19,20,32};

        for (int k = 0; k < myArray.length ; k++) {
            System.out.print(myArray[k]);
        }
    }

    public static void SelectionSort(int[] myArray){
        int ln ;
        for (int i = 0; i < myArray.length - 1; i ++ ){
            for (int j = i + 1; j < myArray.length; j++){
                if (myArray[j] < myArray[i]){
                    ln = j;

                    int swapped = myArray[ln];
                    myArray[ln] = myArray[i];
                    myArray[i] = swapped;

                }
            }
        }
    }

}

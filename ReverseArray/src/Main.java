import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            int[] array = {1, 2, 3, 4, 5};
            reverse(array);
        }

    public static void reverse(int[] inputArray){
        System.out.println("Array = " + Arrays.toString(inputArray));

        int[] getArray = Arrays.copyOf(inputArray,inputArray.length);
        for(int i= 0; i< inputArray.length;i++){
            inputArray[i] = getArray[inputArray.length-1-i];
        }
        System.out.println("Reversed Array = " + Arrays.toString(inputArray));
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = "
                + Arrays.toString(myIntArray));
        System.out.println("anotherArray = "
                + Arrays.toString(anotherArray));

        anotherArray[0] =1;
        modifyArray(myIntArray);
        System.out.println(("after Change myIntArray = " + Arrays.toString(myIntArray)));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[1]= 2;
        array[2] = 3;
        array [3] = 4;
        array [4] =5;

    }
}
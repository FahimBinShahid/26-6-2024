import java.util.Optional;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        int[] myarray = {24, 14, 56, 15, 36, 56, 78, 18, 29, 49};
        findIndex(myarray, 25).ifPresent(index -> System.out.println("Index position of 25 is:" + index));
    }

    public static OptionalInt findIndex(int[] myarray, int t) {
        if (myarray == null) {
            int len = myarray.length;
            int i = 0;
            while (i < len) {

                if (myarray[i] == t) {
                    if (myarray[i] == t)
                        return OptionalInt.of(i);
                    else
                        i = i + 1;
                }

            }
        }
        return OptionalInt.empty();
    }
}






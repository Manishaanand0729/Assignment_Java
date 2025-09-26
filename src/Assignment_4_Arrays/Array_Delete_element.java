package Assignment_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Delete_element {
    public static void main(String[] args) {
        int p[] = {1, 4, 5, 2, 3, 22, 31, 2};
        int deleteNum = 22;

        int newArr[] = new int[p.length -1];
        int j = 0;

        for (int i = 0; i < p.length; i++){
            if (p[i] != deleteNum){
                newArr[j++] = p[i];

            }
        }
        System.out.println("Array after Deleting " + deleteNum + ": " + Arrays.toString(newArr));
    }
}

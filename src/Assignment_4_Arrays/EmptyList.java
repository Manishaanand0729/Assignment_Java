package Assignment_4_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class EmptyList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        System.out.println("Before Clear: " + list);

        list.clear();
        System.out.println("After Clear: " + list);
    }
}

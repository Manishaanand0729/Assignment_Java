package Assignment_4_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana","Mango","Grapes"));

        System.out.println("Before Removing: "+ fruits);

        fruits.remove(2);

        System.out.println("After removing: " + fruits);
    }
}

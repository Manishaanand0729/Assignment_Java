package Assignment_4_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple","Banana", "Mango"));

        System.out.println("Before Update: " + fruits);

        fruits.set(1, "Orange");
        System.out.println("After Update: " + fruits);


    }
}

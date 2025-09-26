package Assignment_4_Arrays;

import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        int index = 1;

        System.out.println("Element at index " + index + ": " +list.get(index));
    }
}

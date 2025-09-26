package Assignment_4_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintUsingPosition {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Dog", "Cat", " Tiger"));

        for(int i = 0; i < animals.size(); i++){
            System.out.println("Position: " + i + ": " + animals.get(i));
        }
    }
}

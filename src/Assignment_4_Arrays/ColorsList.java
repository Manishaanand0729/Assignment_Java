package Assignment_4_Arrays;

import java.util.AbstractList;
import java.util.ArrayList;

public class ColorsList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Pink");

        System.out.println("Colors List");
        for (String c : colors){
            System.out.println(c);
        }

    }
}

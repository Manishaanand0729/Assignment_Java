package Assignment_4_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Manisha", "Aashika", "Ashu",  "Sneha"));

        String search = "Sneha";

        for(int i = 0; i < names.size(); i++){
            if(names.get(i).equals(search)){
                System.out.println(search + " Found at Index " + i );
                break;
            }
        }
    }
}

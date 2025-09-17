package Assignment_day_3;

public class Vowels {
    public static void main(String[] args) {

        // using For loop

        System.out.println("Using For loop");
        for (char c = 'a'; c <= 'z'; c++){
            if(c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println(c + " ");
            }
        }
        System.out.println("\n");

        System.out.println("using While loop");

        char ch = 'a';
        while (ch <= 'z'){
            if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch + " ");
            }
            ch++;

        }
        System.out.println("\n");
    }
}

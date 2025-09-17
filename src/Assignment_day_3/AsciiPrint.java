package Assignment_day_3;

public class AsciiPrint {

    public static void main(String[] args) {

        System.out.println("Upeercase A-Z");
        for (char c = 'A'; c <= 'Z'; c++){
            System.out.println(c + " : " + (int)c);
        }

        // While loop

        System.out.println("LowerCase a - z");

        char j = 'a';
        while (j <= 'z'){
            System.out.println(j + " : " + (int)j);
            j++;
        }

        System.out.println("Digit--- 1-9");
        for (char i = '1'; i <= '9'; i++){
            System.out.println(i + " : " + (int)i);
        }
    }
}

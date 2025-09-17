package Assignment_day_2;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Alphabet");
        char ch = input.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " Is vowel");
            default:
                System.out.println(ch + " IS Consonent");
        }
    }
}

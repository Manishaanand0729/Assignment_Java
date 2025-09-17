package Assignment_day_2;

import java.util.Scanner;

public class Odd_evenCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " This Is Even number");
        }else {
            System.out.println(num  + " this is Odd number");
        }
    }
}

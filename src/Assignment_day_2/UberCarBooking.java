package Assignment_day_2;

import java.util.Scanner;

public class UberCarBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Type (Mini/Sedan/SUV/Premium): ");
        String carType = sc.next().toLowerCase();

        switch (carType){
            case "mini":
                System.out.println("You booked a Mini car");
                break;
            case "sedan":
                System.out.println("You booked a sedan car");
                break;
            case "suv":
                System.out.println("You booked a suv  car");
                break;
            case "premium":
                System.out.println("You booked a premium car");
                break;
            default:
                System.out.println("Please select the right car type");
        }
    }
}

package Assignment_day_2;

public class GreatestOfFour {

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 78;
        int num3 = 87;
        int num4 = 97;


        int greatest = num1;

        if(num2 > greatest)greatest = num2;
        if (num3 > greatest)greatest = num3;
        if(num4 > greatest)greatest =  num4;

        System.out.println("The Greatest Num: " + greatest);
    }
}

package Assignment_day_2;

public class greatest_number {
    public static void main(String[] args) {
    int num1 = 25;
    int num2 = 78;
    int num3 = 87;
    if (num1 > num2 && num1 > num3){
        System.out.println("The Greatest Num Is: " + num1);
    } else if (num2 > num1 && num2 > num3) {
        System.out.println("The Gratest num is: " + num2);
    }else {
        System.out.println("The Greatest Num is: " + num3);
    }

    }
}

package Assignment_day_2;

public class PositiveNegativeTest {
    public static void main(String[] args) {
         int num1 = 35;
         int num2 = -11;

        System.out.println("input Number: " + num1);

        if (num1 > 0 ){
            System.out.println(num1 + " Is Positive");
        } else if (num1 < 0) {
            System.out.println(num1 + " Is Negative");
        }else {
            System.out.println("The number is zero");
        }

        System.out.println();

        // test Second Number

        System.out.println("Input Number: " + num2);

        if (num2 > 0){
            System.out.println(num2 + " is Positive");
        } else if (num2 < 0) {
            System.out.println(num2 + " Is Negative");
        }else {
            System.out.println(" The number is Zero");
        }
        System.out.println();
    }
}

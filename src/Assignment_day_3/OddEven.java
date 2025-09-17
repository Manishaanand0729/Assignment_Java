package Assignment_day_3;

public class OddEven {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println( i + "This is a even number");
            }else {
                System.out.println(i + "This is a odd number");
            }
        }
    }
}

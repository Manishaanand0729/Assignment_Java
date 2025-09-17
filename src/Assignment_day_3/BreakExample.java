package Assignment_day_3;

public class BreakExample {
    public static void main(String[] args) {
         for (int i = 1; i <=10; i++){
             System.out.println(i);
             if (i % 7 == 0){
                 System.out.println("See ya Tomorrow: ");
                 break;
             }
         }
    }
}
